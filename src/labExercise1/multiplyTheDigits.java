package labExercise1;

import java.util.Scanner;

public class multiplyTheDigits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("[Multiply The Digits]\nEnter a number between 0-1000: ");

        int userInput = scan.nextInt();

        int firstDigit = (userInput / 100) % 10;;
        int secondDigit = (userInput / 10) % 10;
        int thirdDigit = userInput % 10;

        int result = firstDigit * secondDigit * thirdDigit;

        System.out.printf("First: %d\nSecond: %d\nThird: %d\n", firstDigit, secondDigit, thirdDigit);
        System.out.print("\nRESULT: " + result);
    }
}
