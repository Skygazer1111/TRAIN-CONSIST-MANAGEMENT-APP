import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ValidationService validator = new ValidationService();

        System.out.println("============================");
        System.out.println("Train ID & Cargo Validation");
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
    }
}