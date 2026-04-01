import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BogieServiceTest {

    public static void main(String[] args) {
        BogieService service = new BogieService();

        // --- Test filterByCapacity ---
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        List<Bogie> filtered = service.filterByCapacity(bogies, 60);
        System.out.println("Filtered bogies (>60 capacity): " + filtered);

        // --- Test groupByType ---
        Map<String, List<Bogie>> grouped = service.groupByType(bogies);
        System.out.println("Grouped bogies by type:");
        grouped.forEach((type, list) -> System.out.println(type + ": " + list));

        // --- Test getTotalCapacity ---
        int totalCapacity = service.getTotalCapacity(bogies);
        System.out.println("Total capacity: " + totalCapacity);

        // Pass/Fail Checks
        if (filtered.size() == 2 && totalCapacity == (72 + 56 + 24 + 70)) {
            System.out.println("BogieServiceTest PASSED");
        } else {
            System.out.println("BogieServiceTest FAILED");
        }
    }
}