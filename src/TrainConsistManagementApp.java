import java.util.List;
import java.util.ArrayList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("============================");
        System.out.println("Filter Bogies using Streams");
        System.out.println("============================\n");

        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        BogieService service = new BogieService();

        List<Bogie> filtered = service.filterByCapacity(bogieList, 60);

        System.out.println("Filtered Bogies (capacity > 60):\n");
        filtered.forEach(System.out::println);
    }
}
