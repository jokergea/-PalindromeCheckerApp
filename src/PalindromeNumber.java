public class PalindromeNumber {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String word, int start, int end) {

        // Base condition: if start >= end, all characters matched
        if (start >= end) {
            return true;
        }

        // If characters at start and end are not equal
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        // Recursive call for next inner characters
        return isPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "deified";

        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}