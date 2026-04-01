import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class BogieServiceTest {

    private static BogieService service = new BogieService();

    public static void main(String[] args) {

        System.out.println("Running UC9 Test Cases...\n");

        testGrouping_BogiesGroupedByType();
        testGrouping_MultipleBogiesInSameGroup();
        testGrouping_DifferentBogieTypes();
        testGrouping_EmptyBogieList();
        testGrouping_SingleBogieCategory();
        testGrouping_MapContainsCorrectKeys();
        testGrouping_GroupSizeValidation();
        testGrouping_OriginalListUnchanged();

        System.out.println("\nAll UC9 Tests Executed.");
    }

    private static List<Bogie> getSampleBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("Sleeper", 70));
        list.add(new Bogie("First Class", 24));
        list.add(new Bogie("AC Chair", 58));
        return list;
    }

    private static void assertTrue(boolean condition, String testName) {
        if (condition) {
            System.out.println("✔ PASS: " + testName);
        } else {
            System.out.println("✘ FAIL: " + testName);
        }
    }

    private static void assertEquals(int expected, int actual, String testName) {
        if (expected == actual) {
            System.out.println("✔ PASS: " + testName);
        } else {
            System.out.println("✘ FAIL: " + testName +
                    " | Expected: " + expected + " but got: " + actual);
        }
    }


    static void testGrouping_BogiesGroupedByType() {
        Map<String, List<Bogie>> result = service.groupByType(getSampleBogies());
        assertTrue(result.get("Sleeper").size() == 2, "Bogies grouped by type");
    }

    static void testGrouping_MultipleBogiesInSameGroup() {
        Map<String, List<Bogie>> result = service.groupByType(getSampleBogies());
        assertEquals(2, result.get("AC Chair").size(), "Multiple bogies in same group");
    }

    static void testGrouping_DifferentBogieTypes() {
        Map<String, List<Bogie>> result = service.groupByType(getSampleBogies());
        assertTrue(result.keySet().size() == 3, "Different bogie types grouped separately");
    }

    static void testGrouping_EmptyBogieList() {
        Map<String, List<Bogie>> result = service.groupByType(new ArrayList<>());
        assertTrue(result.isEmpty(), "Empty bogie list");
    }

    static void testGrouping_SingleBogieCategory() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("Sleeper", 70));

        Map<String, List<Bogie>> result = service.groupByType(list);
        assertEquals(1, result.keySet().size(), "Single bogie category");
    }

    static void testGrouping_MapContainsCorrectKeys() {
        Map<String, List<Bogie>> result = service.groupByType(getSampleBogies());
        boolean condition = result.containsKey("Sleeper") &&
                            result.containsKey("AC Chair") &&
                            result.containsKey("First Class");

        assertTrue(condition, "Map contains correct keys");
    }

    static void testGrouping_GroupSizeValidation() {
        Map<String, List<Bogie>> result = service.groupByType(getSampleBogies());
        assertEquals(2, result.get("Sleeper").size(), "Group size validation");
    }

    static void testGrouping_OriginalListUnchanged() {
        List<Bogie> original = getSampleBogies();
        service.groupByType(original);
        assertEquals(5, original.size(), "Original list unchanged");
    }
}