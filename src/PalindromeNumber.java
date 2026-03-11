public class PalindromeNumber {

    // Method to check palindrome ignoring spaces and case
    public static boolean isPalindrome(String word) {

        // Normalize: remove non-alphanumeric characters and convert to lowercase
        String normalized = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        // Two-pointer comparison
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "A man, a plan, a canal: Panama";

        if (isPalindrome(word)) {
            System.out.println("\"" + word + "\" is a Palindrome (ignoring spaces and case)");
        } else {
            System.out.println("\"" + word + "\" is NOT a Palindrome (ignoring spaces and case)");
        }
    }
}