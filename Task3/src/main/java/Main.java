public class Main {
    public static void main(String[] args) {
        System.out.println("Running Main...");
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        // Clean the string: remove non-alphanumeric characters and convert to lower case
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = cleanedStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
