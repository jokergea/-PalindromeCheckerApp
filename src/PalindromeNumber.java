import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeNumber {

    public static void main(String[] args) {

        // Original string
        String word = "level";

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);     // Enqueue
            stack.push(ch);    // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove(); // Dequeue (FIFO)
            char fromStack = stack.pop();    // Pop (LIFO)

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}