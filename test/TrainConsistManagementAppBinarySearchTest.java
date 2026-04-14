import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TrainConsistManagementAppBinarySearchTest {

    @Test
    public void testBinarySearch_BogieFound() {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        boolean found = TrainConsistManagementApp.binarySearchBogieId(bogieIds, "BG309");

        assertTrue(found);
    }

    @Test
    public void testBinarySearch_BogieNotFound() {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        boolean found = TrainConsistManagementApp.binarySearchBogieId(bogieIds, "BG999");

        assertFalse(found);
    }

    @Test
    public void testBinarySearch_FirstElementMatch() {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        boolean found = TrainConsistManagementApp.binarySearchBogieId(bogieIds, "BG101");

        assertTrue(found);
    }

    @Test
    public void testBinarySearch_LastElementMatch() {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        boolean found = TrainConsistManagementApp.binarySearchBogieId(bogieIds, "BG550");

        assertTrue(found);
    }

    @Test
    public void testBinarySearch_SingleElementArray() {
        String[] bogieIds = {"BG101"};

        boolean found = TrainConsistManagementApp.binarySearchBogieId(bogieIds, "BG101");

        assertTrue(found);
    }

    @Test
    public void testBinarySearch_EmptyArray() {
        String[] bogieIds = {};

        boolean found = TrainConsistManagementApp.binarySearchBogieId(bogieIds, "BG101");

        assertFalse(found);
    }

    @Test
    public void testBinarySearch_UnsortedInputHandled() {
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        boolean found = TrainConsistManagementApp.binarySearchBogieId(bogieIds, "BG205");

        assertTrue(found);
    }
}
