package labExercise4;

import java.util.Scanner;

public class FruitJuiceMachine {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		CashRegister register = new CashRegister();
		DispenserType appleJuice = new DispenserType(50, 100);
		DispenserType orangeJuice = new DispenserType(50, 100);
		DispenserType mangoLassi = new DispenserType(25, 250);
		DispenserType fruitPunch = new DispenserType(25, 150);
		
		int choice1 = 0;
		char choice2;
		char choice3;
		boolean isDone = false;
		
		
		
		do {
			
			System.out.println("[Fruit Juice Machine]\nEnter a number to select a product:");
			System.out.println("(1) Apple Juice\n(2) Orange Juice\n(3) Mango Lassi\n(4) Fruit Punch\n(5) Check Register");
			System.out.print("[CHOICE]: ");
			
			choice1 = scan.nextInt();
			
			switch(choice1) {
			case 1:
				System.out.println("\n[!] You have selected [Apple Juice]");
				System.out.println("[ ] Available: " + appleJuice.getNoOfItems() + "  Cost:" + appleJuice.getCost() + " cents");
				System.out.print("[ ] Buy? (Y/N): ");
				choice2 = scan.next().charAt(0);
				
				if(choice2 == 'Y' || choice2 == 'y') {
					register.acceptAmount(appleJuice.getCost());
					appleJuice.makeSale();
					System.out.println("[!] Purchase Successful!");
				}
				else {
					System.out.println("[Transaction cancelled]");
				}
				break;
			case 2:
				System.out.println("\n[!] You have selected [Orange Juice]");
				System.out.println("[ ] Available: " + orangeJuice.getNoOfItems() + "  Cost:" + orangeJuice.getCost() + " cents");
				System.out.print("[ ] Buy? (Y/N): ");
				choice2 = scan.next().charAt(0);
				
				if(choice2 == 'Y' || choice2 == 'y') {
					register.acceptAmount(orangeJuice.getCost());
					orangeJuice.makeSale();
					System.out.println("[!] Purchase Successful!");
				}
				else {
					System.out.println("[Transaction cancelled]");
				}
				break;
			case 3:
				System.out.println("\n[!] You have selected [Mango Lassi]");
				System.out.println("[ ] Available: " + mangoLassi.getNoOfItems() + "  Cost:" + mangoLassi.getCost() + " cents");
				System.out.print("[ ] Buy? (Y/N): ");
				choice2 = scan.next().charAt(0);
				
				if(choice2 == 'Y' || choice2 == 'y') {
					register.acceptAmount(mangoLassi.getCost());
					mangoLassi.makeSale();
					System.out.println("[!] Purchase Successful!");
				}
				else {
					System.out.println("[Transaction cancelled]");
				}
				break;
			case 4:
				System.out.println("\n[!] You have selected [Fruit Punch]");
				System.out.println("[ ] Available: " + fruitPunch.getNoOfItems() + "  Cost:" + fruitPunch.getCost() + " cents");
				System.out.print("[ ] Buy? (Y/N): ");
				choice2 = scan.next().charAt(0);
				
				if(choice2 == 'Y' || choice2 == 'y') {
					register.acceptAmount(fruitPunch.getCost());
					fruitPunch.makeSale();
					System.out.println("[!] Purchase Successful!");
				}
				else {
					System.out.println("[Transaction cancelled]");
				}
				break;
			case 5:
				System.out.println("[!] Balance: " + register.getCurrentBalance());
				break;
			default:
				System.out.println("Invalid input!");
				break;
			}
			
			// Exit check
			System.out.print("\n[ ] Browse Again? (Y/N): ");
			choice3 = scan.next().charAt(0);
			
			if(choice3 == 'Y' || choice3 == 'y') {
				System.out.println("[Confirmed: Resetting]\n\n");
			}
			else {
				System.out.println("[Exiting Program!]");
				isDone = true;
			}
			
		} while(!isDone);
	}
	
}
