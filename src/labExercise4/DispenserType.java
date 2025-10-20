package labExercise4;

public class DispenserType {
	
	private int numberOfItems;
	private int cost;
	
	public DispenserType() {
		numberOfItems = 50;
		cost = 50;
	}
	public DispenserType(int setNoOfItems, int setCost) {
		numberOfItems = setNoOfItems;
		cost = setCost;
	}
	
	public void makeSale() {
		numberOfItems--;	
	}
	
	public int getNoOfItems() {
		return numberOfItems;
	}
	
	public int getCost() {
		return cost;
	}
	
}
