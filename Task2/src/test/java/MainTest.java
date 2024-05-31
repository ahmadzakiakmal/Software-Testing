import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MainTest {

    @ParameterizedTest
    @MethodSource("provideEuclideanDistanceTestData")
    public void testEuclideanDistance(double x1, double y1, double x2, double y2, double expected) {
        assertEquals(expected, Main.euclideanDistance(x1, y1, x2, y2), 0.001,
                "Distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") should be " + expected);
    }

    private static Stream<Arguments> provideEuclideanDistanceTestData() {
        return Stream.of(
                Arguments.of(0, 0, 3, 4, 5.0),
                Arguments.of(1, 1, 1, 1, 0.0),
                Arguments.of(0, 0, 1, 1, Math.sqrt(2))
        );
    }

    @ParameterizedTest
    @MethodSource("providePalindromeTestData")
    public void testIsPalindrome(String input, boolean expected) {
        if (expected) {
            assertTrue(Main.isPalindrome(input), "'" + input + "' should be a palindrome");
        } else {
            assertFalse(Main.isPalindrome(input), "'" + input + "' should not be a palindrome");
        }
    }

    private static Stream<Arguments> providePalindromeTestData() {
        return Stream.of(
                Arguments.of("hello", false),
                Arguments.of("racecar", true),
                Arguments.of("race car", true),
                Arguments.of("Racecar", true),
                Arguments.of(" ", true),
                Arguments.of(null, false)
        );
    }
}
