package labExercise4;

import java.util.Scanner;

public class FruitJuiceMachine {
	
	public static void showSelection() {
		System.out.println("[Fruit Juice Machine]\nEnter a number to select a product:");
		System.out.println("(1) Apple Juice\n(2) Orange Juice\n(3) Mango Lassi\n(4) Fruit Punch\n(5) Check Register\n(6) EXIT");
		System.out.print("[CHOICE]: ");
	}
	
	public static void sellProduct(Scanner scan, CashRegister register, DispenserType item, String name) {
		char choice2;
		int deposit;
		
		System.out.println("\n[!] You have selected " + name);
		
		if(item.getNoOfItems() == 0) {
			System.out.println("This item has no available stock!");
			return;
		}
		
		System.out.println("[ ] Available: " + item.getNoOfItems() + "  Cost: " + item.getCost() + " cents");
		System.out.print("[ ] Buy? (Y/N): ");
		choice2 = scan.next().charAt(0);
		
		if(choice2 == 'Y' || choice2 == 'y') {
			
			System.out.print("Deposit amount to proceed\nINPUT: ");
			deposit = scan.nextInt();
			while (deposit != item.getCost()) {
				System.out.print("Insufficient amount! Input again!\nINPUT:");
				deposit = scan.nextInt();
			}
			register.acceptAmount(item.getCost());
			item.makeSale();
			System.out.println("[!] Purchase Successful!");
		}
		else {
			System.out.println("[Transaction cancelled]");
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		CashRegister register = new CashRegister();
		DispenserType appleJuice = new DispenserType(0, 100);
		DispenserType orangeJuice = new DispenserType(50, 100);
		DispenserType mangoLassi = new DispenserType(25, 250);
		DispenserType fruitPunch = new DispenserType(25, 150);
		
		int choice1 = 0;
		char choice3;
		boolean isDone = false;
		String name;
		
		
		
		do {
			
			showSelection();
			
			choice1 = scan.nextInt();
			
			switch(choice1) {
			case 1:
				name = "Apple Juice";
				
				sellProduct(scan, register, appleJuice, name);
				
				break;
			case 2:
				name = "Orange Juice";
				
				sellProduct(scan, register, orangeJuice, name);
				
				break;
			case 3:
				name = "Mango Lassi";
			
				sellProduct(scan, register, mangoLassi, name);
				
				break;
			case 4:
				name = "Fruit Punch";
				
				sellProduct(scan, register, fruitPunch, name);
				
				break;
			case 5:
				System.out.println("[!] Balance: " + register.getCurrentBalance());
				break;
			case 6:
				System.out.println("[Exiting Program!]");
				return;
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
