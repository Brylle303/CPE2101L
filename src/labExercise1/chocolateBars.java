package labExercise1;

import java.util.Scanner;

public class chocolateBars {

    public static final double CHOCOLATE_CALORIES = 230.0;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double weight, height, age;

        System.out.println("[Chocolate Bar]\n");
        System.out.print("Enter your weight in pounds: ");
        weight = scan.nextDouble();
        System.out.print("Enter your height in inches: ");
        height = scan.nextDouble();
        System.out.print("Enter your age in years: ");
        age = scan.nextDouble();


    }
}
