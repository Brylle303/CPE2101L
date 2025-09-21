package labExercise2;

import java.util.Scanner;

public class decToHex {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String hexaOutput = "";
		int decimalInput;
		int remainder;
		
		
		char[] hexaValues = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.print("[Decimal to Hexa]");
		System.out.print("Enter a decimal number: ");
		
		decimalInput = scan.nextInt();
		scan.close();
		
		// Loop for successive division
		while(decimalInput > 0) {
			
			remainder = decimalInput % 16;
			hexaOutput = hexaValues[remainder] + hexaOutput;
			decimalInput /= 16;
		}
		
		System.out.println("Hexadecimal Equivalent: " + hexaOutput);
	}
}
