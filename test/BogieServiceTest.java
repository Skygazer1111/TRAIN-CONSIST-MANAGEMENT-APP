import java.util.ArrayList;
import java.util.List;

public class BogieServiceTest {

    public static void main(String[] args) {
        BogieService service = new BogieService();

        // Sample bogies
        List<PassengerBogie> list = new ArrayList<>();
        list.add(new PassengerBogie("Sleeper", 72));
        list.add(new PassengerBogie("AC Chair", 56));
        list.add(new PassengerBogie("Sleeper", 70));
        list.add(new PassengerBogie("First Class", 24));

        // Test getTotalCapacity
        int total = service.getTotalCapacity(list);
        System.out.println("Total seating capacity: " + total); // Should print 222

        // Test filterByCapacity
        List<PassengerBogie> filtered = service.filterByCapacity(list, 60);
        System.out.println("Bogie with capacity > 60: " + filtered);

        // Test groupByType
        System.out.println("Group bogies by type: " + service.groupByType(list));
    }
}