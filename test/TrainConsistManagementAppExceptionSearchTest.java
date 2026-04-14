import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TrainConsistManagementAppExceptionSearchTest {

    @Test(expected = IllegalStateException.class)
    public void testSearch_ThrowsExceptionWhenEmpty() {
        String[] bogieIds = {};

        TrainConsistManagementApp.searchBogieIdWithValidation(bogieIds, "BG101");
    }

    @Test
    public void testSearch_AllowsSearchWhenDataExists() {
        String[] bogieIds = {"BG101", "BG205"};

        boolean found = TrainConsistManagementApp.searchBogieIdWithValidation(bogieIds, "BG101");

        assertTrue(found);
    }

    @Test
    public void testSearch_BogieFoundAfterValidation() {
        String[] bogieIds = {"BG101", "BG205", "BG309"};

        boolean found = TrainConsistManagementApp.searchBogieIdWithValidation(bogieIds, "BG205");

        assertTrue(found);
    }

    @Test
    public void testSearch_BogieNotFoundAfterValidation() {
        String[] bogieIds = {"BG101", "BG205", "BG309"};

        boolean found = TrainConsistManagementApp.searchBogieIdWithValidation(bogieIds, "BG999");

        assertFalse(found);
    }

    @Test
    public void testSearch_SingleElementValidCase() {
        String[] bogieIds = {"BG101"};

        boolean found = TrainConsistManagementApp.searchBogieIdWithValidation(bogieIds, "BG101");

        assertTrue(found);
    }
}
