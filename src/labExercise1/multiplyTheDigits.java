package labExercise1;

import java.util.Scanner;

public class multiplyTheDigits {

    public static void main(String[] args) {
        // Program that accepts a number between 1 and 1000 and multiplies each digit of the number;
        Scanner scan = new Scanner(System.in);

        System.out.print("[Multiply The Digits]\nEnter a number between 0-1000: ");

        int userInput = scan.nextInt();

        // Calculations
        int firstDigit = (userInput / 100) % 10;;
        int secondDigit = (userInput / 10) % 10;
        int thirdDigit = userInput % 10;

        int result;

        // Checks whether the input has 1, 2, or 3 digits
        if(firstDigit == 0) {

            if(secondDigit == 0) {
                result = thirdDigit;
            }
            else {
                result = secondDigit * thirdDigit;
            }
        }
        else {
            result = firstDigit * secondDigit * thirdDigit;
        }

        // Print results
        if((userInput / 1000) % 10 == 1){ // Just for displaying the fourth digit in case user enters 1000
            System.out.printf("First: 1\nSecond: %d\nThird: %d\nFourth: %d\n", firstDigit, secondDigit, thirdDigit);
        }
        else {
            System.out.printf("First: %d\nSecond: %d\nThird: %d\n", firstDigit, secondDigit, thirdDigit);
        }
        System.out.print("\nRESULT: " + result);

    }
}
