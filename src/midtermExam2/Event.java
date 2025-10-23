package midtermExam2;

//UML & SCREENSHOTS LINK: https://drive.google.com/drive/folders/11xUJvoJJXDVGOAZzFpWOq3Hx2Yh7q86C?usp=sharing

public class Event {
	
	public final static int pricePerGuest  = 35;
	public final static int cutOffValue = 50;
	
	private String eventNumber;
	private int numberOfGuests;
	private int price;
	
	public Event() {
		this("A000", 0);
	}
	
	public Event(String eventNumber, int numberOfGuests) {
		setEventNumber(eventNumber);
		setGuests(numberOfGuests);
	}
	
	public void setEventNumber(String eventNumber) {
		this.eventNumber = eventNumber;
	}
	public String getEventNumber() {
		return this.eventNumber;
	}
	
	public void setGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
		
		this.price = pricePerGuest * numberOfGuests;
	}
	public int getGuests() {
		return numberOfGuests;
	}
	
	public int getPrice() {
		if(numberOfGuests > cutOffValue) {
			System.out.println("(Number of guests beyond cutoff! Invalid event)");
			return 0;
		}
		else {
			return this.price;
		}
		
	}
	
	
	
	

	

}
