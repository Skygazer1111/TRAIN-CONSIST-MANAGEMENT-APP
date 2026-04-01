import java.util.List;
import java.util.ArrayList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("============================");
        System.out.println("Total Train Capacity");
        System.out.println("============================\n");

        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("Sleeper", 70));
        bogieList.add(new Bogie("First Class", 24));

        BogieService service = new BogieService();

        int totalCapacity = service.getTotalCapacity(bogieList);

        System.out.println("Total Seating Capacity: " + totalCapacity);
    }
}
