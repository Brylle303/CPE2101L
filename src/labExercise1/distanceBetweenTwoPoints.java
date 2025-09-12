package labExercise1;

import java.util.Scanner;

public class distanceBetweenTwoPoints {

    public static void main(String[] args) {
        // Program that calculates the distance between two given points
        Scanner scan = new Scanner(System.in);

        double x1, x2;
        double y1, y2;
        double finalResult;

        // Obtain input
        System.out.println("[Distance Calculator]");
        System.out.print("Enter x1 and y1: ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();

        System.out.print("Enter x2 and y2: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        // Calculate distance
        finalResult = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

        System.out.printf("The distance between two points is: %.3f", finalResult);




    }
}
