import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        System.out.println("=== Running JUnit Tests ===\n");
        
        // Run all test suites
        Result result1 = JUnitCore.runClasses(BogieServiceTest.class);
        Result result2 = JUnitCore.runClasses(PassengerBogieTest.class);
        Result result3 = JUnitCore.runClasses(ValidationServiceTest.class);
        Result result4 = JUnitCore.runClasses(SafetyServiceTest.class);
        Result result5 = JUnitCore.runClasses(GoodsBogieTest.class);
        Result result6 = JUnitCore.runClasses(UseCase16TrainConsistMgmntTest.class);
        Result result7 = JUnitCore.runClasses(TrainConsistManagementAppTest.class);
        Result result8 = JUnitCore.runClasses(TrainConsistManagementAppSearchTest.class);
        
        // Print summary
        System.out.println("\n=== Test Summary ===");
        int totalTests = result1.getRunCount() + result2.getRunCount() + result3.getRunCount() + result4.getRunCount() + result5.getRunCount() + result6.getRunCount() + result7.getRunCount() + result8.getRunCount();
        int totalFailures = result1.getFailureCount() + result2.getFailureCount() + result3.getFailureCount() + result4.getFailureCount() + result5.getFailureCount() + result6.getFailureCount() + result7.getFailureCount() + result8.getFailureCount();
        int totalIgnored = result1.getIgnoreCount() + result2.getIgnoreCount() + result3.getIgnoreCount() + result4.getIgnoreCount() + result5.getIgnoreCount() + result6.getIgnoreCount() + result7.getIgnoreCount() + result8.getIgnoreCount();
        
        System.out.println("Total Tests: " + totalTests);
        System.out.println("Failures: " + totalFailures);
        System.out.println("Ignored: " + totalIgnored);
        System.out.println("Success: " + (totalTests - totalFailures - totalIgnored));
        
        if (totalFailures == 0 && totalIgnored == 0) {
            System.out.println("\n✓ All tests PASSED!");
        } else if (totalFailures > 0) {
            System.out.println("\n✗ Some tests FAILED");
            System.out.println("\nFailure details:");
            printFailures(result1);
            printFailures(result2);
            printFailures(result3);
            printFailures(result4);
            printFailures(result5);
            printFailures(result6);
            printFailures(result7);
            printFailures(result8);
        }
    }
    
    private static void printFailures(Result result) {
        for (Failure failure : result.getFailures()) {
            System.out.println("\n  - " + failure.getTestHeader());
            System.out.println("    " + failure.getMessage());
        }
    }
}