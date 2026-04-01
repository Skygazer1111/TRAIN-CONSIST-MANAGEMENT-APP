import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ValidationService validator = new ValidationService();

        System.out.println("============================");
        System.out.println("Train ID & Cargo Validation");
        System.out.println("Total Train Capacity");
        System.out.println("Group Bogies by Type");
        System.out.println("============================\n");

        // Input
        System.out.print("Enter Train ID: ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = scanner.nextLine();

        // Validation
        boolean isTrainValid = validator.isValidTrainId(trainId);
        boolean isCargoValid = validator.isValidCargoCode(cargoCode);

        System.out.println("\nValidation Results:\n");
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("Sleeper", 70));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("AC Chair", 58));

        if (isTrainValid) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        scanner.close();
        System.out.println("Total Seating Capacity: " + totalCapacity);

        Map<String, List<Bogie>> grouped = service.groupByType(bogieList);

        System.out.println("Grouped Bogies:\n");

        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }
    }
}