import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("========================================\n");

        // Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Ensure data is sorted before binary search (precondition)
        Arrays.sort(bogieIds);

        // Search key
        String key = "BG309";

        // Display all bogies
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Binary search for requested ID
        boolean found = binarySearchBogieId(bogieIds, key);

        if (found) {
            System.out.println("\nBogie " + key + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + key + " not found using Binary Search.");
        }

        System.out.println("\nUC19 search completed...");
    }

    // Kept for UC17 test compatibility
    public static void sortBogieNames(String[] bogieNames) {
        if (bogieNames == null || bogieNames.length < 2) {
            return;
        }
        Arrays.sort(bogieNames);
    }

    // Kept for UC18 test compatibility
    public static boolean searchBogieId(String[] bogieIds, String searchId) {
        if (bogieIds == null || searchId == null) {
            return false;
        }

        for (String id : bogieIds) {
            if (searchId.equals(id)) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearchBogieId(String[] bogieIds, String key) {
        if (bogieIds == null || key == null || bogieIds.length == 0) {
            return false;
        }

        // Work on a sorted copy so callers can pass unsorted input safely
        String[] sorted = Arrays.copyOf(bogieIds, bogieIds.length);
        Arrays.sort(sorted);

        int low = 0;
        int high = sorted.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = key.compareTo(sorted[mid]);

            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}