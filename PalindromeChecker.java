import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking string input from user
        System.out.println("Enter a word or phrase:");
        String userinput = sc.nextLine();

        // Remove all non-alphanumeric characters and convert to lowercase
        String cleaningInput = userinput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned input is a palindrome
        if (isPalindrome(cleaningInput)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String newstr) {
        int left = 0;
        int right = newstr.length() - 1;

        while (left < right) {
            if (newstr.charAt(left) != newstr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
