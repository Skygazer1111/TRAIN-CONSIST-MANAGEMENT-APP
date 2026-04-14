import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TrainConsistManagementAppSearchTest {

    @Test
    public void testSearch_BogieFound() {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        boolean found = TrainConsistManagementApp.searchBogieId(bogieIds, "BG309");

        assertTrue(found);
    }

    @Test
    public void testSearch_BogieNotFound() {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        boolean found = TrainConsistManagementApp.searchBogieId(bogieIds, "BG999");

        assertFalse(found);
    }

    @Test
    public void testSearch_FirstElementMatch() {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        boolean found = TrainConsistManagementApp.searchBogieId(bogieIds, "BG101");

        assertTrue(found);
    }

    @Test
    public void testSearch_LastElementMatch() {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        boolean found = TrainConsistManagementApp.searchBogieId(bogieIds, "BG550");

        assertTrue(found);
    }

    @Test
    public void testSearch_SingleElementArray() {
        String[] bogieIds = {"BG101"};

        boolean found = TrainConsistManagementApp.searchBogieId(bogieIds, "BG101");

        assertTrue(found);
    }
}
