package labExercise2;

import java.util.Scanner;

public class dayOfTheWeek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int year; // k
		int month; // m
		int dayOfTheMonth; // q
		
		System.out.println("[Zeller's Congruence Program]");
		System.out.print("Input year: ");
		year = scan.nextInt();
		
		System.out.print("Input month: ");
		month = scan.nextInt();
		
		System.out.print("Input day of the month: ");
		dayOfTheMonth = scan.nextInt();
		
		scan.close();
		
		// Month Conversion for January and February
		if(month == 1) {
			month = 13;
			year--;
		}
		else if(month == 2) {
			month = 14;
			year--;
		}
		
		int yearOfTheCentury = year % 100;
		int yearDivided = year / 100; // j
		int dayOfTheWeek = dayOfTheMonth + ((26 * (month + 1)) / 10 ) + yearOfTheCentury + (yearOfTheCentury / 4) + (yearDivided / 4) + (5 * yearDivided); // h
		
		// Printing the day according to result of computation;
		switch(dayOfTheWeek % 7) {
		case 0:
			System.out.println("Day of the week is Saturday");
			break;
		case 1:
			System.out.println("Day of the week is Sunday");
			break;
		case 2:
			System.out.println("Day of the week is Monday");
			break;
		case 3:
			System.out.println("Day of the week is Tuesday");
			break;
		case 4:
			System.out.println("Day of the week is Wednesday");
			break;
		case 5:
			System.out.println("Day of the week is Thursday");
			break;
		case 6:
			System.out.println("Day of the week is Friday");
			break;
		}
		
	}

}
