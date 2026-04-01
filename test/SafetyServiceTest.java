import java.util.ArrayList;
import java.util.List;

public class SafetyServiceTest {

    public static void main(String[] args) {
        SafetyService service = new SafetyService();

        // --- Test 1: All cylindrical bogies valid ---
        List<GoodsBogie> list1 = new ArrayList<>();
        list1.add(new GoodsBogie("Cylindrical", "Petroleum"));
        list1.add(new GoodsBogie("Rectangular", "Coal"));
        boolean result1 = service.isTrainSafe(list1);
        System.out.println("Test 1 - All valid: " + result1);

        // --- Test 2: Cylindrical with invalid cargo ---
        List<GoodsBogie> list2 = new ArrayList<>();
        list2.add(new GoodsBogie("Cylindrical", "Coal")); // violation
        list2.add(new GoodsBogie("Rectangular", "Grain"));
        boolean result2 = service.isTrainSafe(list2);
        System.out.println("Test 2 - Cylindrical invalid: " + result2);

        // --- Test 3: Non-cylindrical only ---
        List<GoodsBogie> list3 = new ArrayList<>();
        list3.add(new GoodsBogie("Rectangular", "Coal"));
        list3.add(new GoodsBogie("Open", "Grain"));
        boolean result3 = service.isTrainSafe(list3);
        System.out.println("Test 3 - Non-cylindrical only: " + result3);

        // --- Test 4: Mixed with violation ---
        List<GoodsBogie> list4 = new ArrayList<>();
        list4.add(new GoodsBogie("Cylindrical", "Petroleum"));
        list4.add(new GoodsBogie("Cylindrical", "Coal")); // violation
        boolean result4 = service.isTrainSafe(list4);
        System.out.println("Test 4 - Mixed with violation: " + result4);

        // --- Test 5: Empty list ---
        List<GoodsBogie> list5 = new ArrayList<>();
        boolean result5 = service.isTrainSafe(list5);
        System.out.println("Test 5 - Empty list: " + result5);

        // Pass/Fail Summary
        if (result1 && !result2 && result3 && !result4 && result5) {
            System.out.println("SafetyServiceTest PASSED");
        } else {
            System.out.println("SafetyServiceTest FAILED");
        }
    }
}