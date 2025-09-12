package labExercise1;

import java.util.Scanner;

public class changeDenomination {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int coinInput;

        System.out.print("[Change Calculator]\nEnter a number between 1 and 99: ");

        coinInput = scan.nextInt();

        if(coinInput >= 1 && coinInput <= 99) {
            int coin25 = coinInput / 25;
            coinInput %= 25;

            int coin10 = coinInput / 10;
            coinInput %= 10;

            int coin5 = coinInput / 5;
            coinInput %= 5;

            int coin1 = coinInput;
            coinInput %= 1;

            System.out.println("Result: ");
            System.out.println("25 cents: " + coin25);
            System.out.println("10 cents: " + coin10);
            System.out.println("5 cents: " + coin5);
            System.out.println("1 cents: " + coin1);

        }
        else {
            System.out.println("Invalid input! Only numbers between 1 and 99!");
        }


    }
}
