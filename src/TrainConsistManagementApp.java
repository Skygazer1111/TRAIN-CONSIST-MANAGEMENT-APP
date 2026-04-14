public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("========================================\n");

        // Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Bogie ID to search
        String searchId = "BG309";

        // Display all bogies
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Linear search for requested ID
        boolean found = searchBogieId(bogieIds, searchId);

        if (found) {
            System.out.println("\nBogie " + searchId + " found in train consist.");
        } else {
            System.out.println("\nBogie " + searchId + " not found in train consist.");
        }

        System.out.println("\nUC18 search completed...");
    }

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
}