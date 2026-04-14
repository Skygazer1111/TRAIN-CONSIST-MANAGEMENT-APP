import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("========================================\n");

        // Create bogie array (empty train scenario)
        String[] bogieIds = {};

        // Search key
        String searchId = "BG101";

        // Fail-fast validation before search
        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in train. Cannot perform search.");
        }

        boolean found = searchBogieIdWithValidation(bogieIds, searchId);

        if (found) {
            System.out.println("\nBogie " + searchId + " found in train consist.");
        } else {
            System.out.println("\nBogie " + searchId + " not found in train consist.");
        }

        System.out.println("\nUC20 execution completed...");
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

    public static boolean searchBogieIdWithValidation(String[] bogieIds, String searchId) {
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in train. Cannot perform search.");
        }
        return searchBogieId(bogieIds, searchId);
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