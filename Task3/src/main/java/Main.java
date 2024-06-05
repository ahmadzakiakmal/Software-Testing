import static org.junit.Assume.assumeTrue;
import static org.junit.Assert.assertTrue;
import org.junit.experimental.theories.Theory;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.experimental.theories.Theories;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class Main {

    @Theory
    public void palindromeReverseStillTheSame(String str) {
        // Parameters!
        assumeTrue(str != null);                // Assume
        assumeTrue(isPalindrome(str));          // Assume

        String reversed = new StringBuilder(str).reverse().toString(); // Act

        assertTrue(str.equals(reversed));       // Assert
    }

    public boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Main.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests finished successfully...");
        }
    }
}
