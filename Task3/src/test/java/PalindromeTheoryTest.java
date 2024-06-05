import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

public class PalindromeTheoryTest {

    @Test
    public void testPalindromeReverseStillTheSame() {
        String str = "A man a plan a canal Panama";
        assumeTrue("String is null", str != null);                // Assume
        assumeTrue("String is not a palindrome: " + str, Main.isPalindrome(str));     // Assume

        // Clean the string: remove non-alphanumeric characters and convert to lower case
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanedStr).reverse().toString(); // Act

        assertTrue("Original: " + cleanedStr + ", Reversed: " + reversed, cleanedStr.equals(reversed));       // Assert
    }

    @Test
    public void testPalindromeReverseStillTheSameRacecar() {
        String str = "racecar";
        assumeTrue("String is null", str != null);                // Assume
        assumeTrue("String is not a palindrome: " + str, Main.isPalindrome(str));     // Assume

        // Clean the string: remove non-alphanumeric characters and convert to lower case
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanedStr).reverse().toString(); // Act

        assertTrue("Original: " + cleanedStr + ", Reversed: " + reversed, cleanedStr.equals(reversed));       // Assert
    }

    @Test
    public void testPalindromeReverseStillTheSameHello() {
        String str = "hello";
        assumeTrue("String is null", str != null);                // Assume
        assumeTrue("String is not a palindrome: " + str, Main.isPalindrome(str));     // Assume

        // Clean the string: remove non-alphanumeric characters and convert to lower case
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanedStr).reverse().toString(); // Act

        assertTrue("Original: " + cleanedStr + ", Reversed: " + reversed, cleanedStr.equals(reversed));       // Assert
    }

    @Test
    public void testPalindromeReverseStillTheSameRandom() {
        String str = "random";
        assumeTrue("String is null", str != null);                // Assume
        assumeTrue("String is not a palindrome: " + str, Main.isPalindrome(str));     // Assume

        // Clean the string: remove non-alphanumeric characters and convert to lower case
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanedStr).reverse().toString(); // Act

        assertTrue("Original: " + cleanedStr + ", Reversed: " + reversed, cleanedStr.equals(reversed));       // Assert
    }
}
