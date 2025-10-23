package midtermExam2;

public class EventTest {

	//UML & SCREENSHOTS LINK: https://drive.google.com/drive/folders/11xUJvoJJXDVGOAZzFpWOq3Hx2Yh7q86C?usp=sharing
	
	public static void main(String[] args) {
		Event firstEvent = new Event("A111", 60);
		Event secondEvent = new Event();
		Event thirdEvent = new Event();
		
		thirdEvent.setEventNumber("A909");
		thirdEvent.setGuests(10);
		
		System.out.println("Event Test: ");
		System.out.println("EVENT 1:\nNumber of Guests: " + firstEvent.getGuests());
		System.out.println("Event Number: " +  firstEvent.getEventNumber());
		System.out.println("Price: " + firstEvent.getPrice());
		
		System.out.println("EVENT 2:\nNumber of Guests: " + secondEvent.getGuests());
		System.out.println("Event Number: " +  secondEvent.getEventNumber());
		System.out.println("Price: " + secondEvent.getPrice());
		
		System.out.println("EVENT 3:\nNumber of Guests: " + thirdEvent.getGuests());
		System.out.println("Event Number: " +  thirdEvent.getEventNumber());
		System.out.println("Price: " + thirdEvent.getPrice());
		
	}

}
