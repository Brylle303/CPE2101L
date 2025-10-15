package labExercise4;

import java.util.Scanner;

public class FruitJuiceMachine {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		CashRegister register = new CashRegister();
		DispenserType appleJuice = new DispenserType(50, 100);
		DispenserType orangeJuice = new DispenserType(50, 100);
		DispenserType mangoLassi = new DispenserType(50, 250);
		DispenserType fruitPunch = new DispenserType(50, 150);
		
		int choice1 = 0;
		char choice2;
		char choice3;
		boolean isDone = false;
		
		
		
		do {
			
			System.out.println("[Fruit Juice Machine]\nEnter a number to select a product:");
			System.out.println("(1) Apple Juice\n(2) Orange Juice\n(3) Mango Lassi\n(4) Fruit Punch");
			System.out.print("[CHOICE]: ");
			
			choice1 = scan.nextInt();
			
			switch(choice1) {
			case 1:
				System.out.println("\n[!] You have selected Apple Juice for " + appleJuice.getCost() + " cents");
				System.out.print("[+] Buy? (Y/N): ");
				choice2 = scan.next().charAt(0);
				
				if(choice2 == 'Y' || choice2 == 'y') {
					register.acceptAmount(appleJuice.getCost());
					
					System.out.println("[!] Purchase Successful!");
				}
				else {
					
				}
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			}
			
			// Exit check
			System.out.print("[+] Exit? (Y/N): ");
			choice3 = scan.next().charAt(0);
			
			if(choice3 == 'Y' || choice3 == 'y') {
				System.out.println("[Confirmed: Resetting]\n\n");
			}
			else {
				System.out.println("[Exiting Program!]");
			}
			
		} while(!isDone);
	}
	
}
