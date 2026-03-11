public class PalindromeNumber {

    public static void main(String[] args) {

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker();

        // Test string
        String word = "civic";

        // Check palindrome
        if (checker.checkPalindrome(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}

// PalindromeChecker class encapsulates palindrome logic
class PalindromeChecker {

    // Method to check palindrome using two-pointer technique
    public boolean checkPalindrome(String word) {

        if (word == null || word.isEmpty()) {
            return false;
        }

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}