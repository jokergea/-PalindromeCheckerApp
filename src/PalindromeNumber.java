public class PalindromeNumber
{

    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "madam";

        // Check if the word is a palindrome by comparing it with its reverse
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}