import java.util.Scanner;
import java.util.Stack;

/**
 * This class contains a method to check if a string is a palindrome using a stack.
 */
public class PalindromeChecker {
    /**
     * Main method to run the palindrome check.
     * @param args command line arguments, not used in this program.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println(isPalindrome(input) ? "The string is a palindrome." : "The string is not a palindrome.");
        scanner.close();
    }

    /**
     * Checks if a string is a palindrome.
     * @param str the string to check.
     * @return true if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder reversedStr = new StringBuilder(str.length());
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }
        return str.equals(reversedStr.toString());
    }
}
