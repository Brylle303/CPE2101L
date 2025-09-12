package labExercise1;

import java.util.Scanner;

public class chocolateBars {

    public static final double CHOCOLATE_CALORIES = 230.0;


    public static void main(String[] args) {
        // Program that calculates the amount of chocolate bars needed to maintain weight
        Scanner scan = new Scanner(System.in);

        double weight, height, age;

        // Obtaining input
        System.out.println("[Chocolate Bar]");
        System.out.print("Enter your weight in pounds: ");
        weight = scan.nextDouble();
        System.out.print("Enter your height in inches: ");
        height = scan.nextDouble();
        System.out.print("Enter your age in years: ");
        age = scan.nextDouble();

        scan.close();

        // Calculations + Printing output
        double maleBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
        double femaleBMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);

        System.out.printf("BMR (if Male): %.2f\n", maleBMR);
        System.out.printf("BMR (if Female): %.2f\n", femaleBMR);

        System.out.printf("[!]You need %d bars of chocolate if you are Male\n", (int)(maleBMR/CHOCOLATE_CALORIES));
        System.out.printf("[!]You need %d bars of chocolate if you are Female", (int)(femaleBMR/CHOCOLATE_CALORIES));
    }
}
