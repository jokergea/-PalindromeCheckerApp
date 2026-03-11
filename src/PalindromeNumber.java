import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        int number, originalNumber, remainder, reversedNumber = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        originalNumber = number;

        // Reverse the number
        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }

        // Check palindrome
        if (originalNumber == reversedNumber) {
            System.out.println("The number is a Palindrome.");
        } else {
            System.out.println("The number is NOT a Palindrome.");
        }

        scanner.close();
    }
}