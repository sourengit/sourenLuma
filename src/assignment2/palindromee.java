package assignment2;

import java.util.Scanner;

public class palindromee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        checkPalindrome(number); // Calling the function directly
    }
    
    public static void checkPalindrome(int num) {
        int original = num, reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + num % 10; // Add last digit to reversed
            num = num/ 10; // Remove last digit from number
        }

        if (original == reversed)
            System.out.println(original + " is a palindrome!");
        else
            System.out.println(original + " is not a palindrome.");
    }


}
