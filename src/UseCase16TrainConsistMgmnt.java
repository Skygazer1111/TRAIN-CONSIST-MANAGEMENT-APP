public class UseCase16TrainConsistMgmnt {

    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("UC16 - Manual Sorting using Bubble Sort");
        System.out.println("============================================\n");

        // Create array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // Display original order
        System.out.println("Original Capacities:");
        printArray(capacities);

        bubbleSort(capacities);

        // Display sorted result
        System.out.println("\nSorted Capacities (Ascending):");
        printArray(capacities);
    }

    public static void bubbleSort(int[] capacities) {
        if (capacities == null || capacities.length < 2) {
            return;
        }

        // Outer loop controls number of passes
        for (int i = 0; i < capacities.length - 1; i++) {
            boolean swapped = false;

            // Compare adjacent values and swap if needed
            for (int j = 0; j < capacities.length - 1 - i; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    private static void printArray(int[] capacities) {
        for (int c : capacities) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
