import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== UC12: Safety Compliance Check ===");

        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Open", "Grain"));

        SafetyService safetyService = new SafetyService();
        boolean isSafe = safetyService.isTrainSafe(goodsBogies);

        System.out.println("Train Safety Compliance: " + (isSafe ? "SAFE" : "UNSAFE"));
    }
}