package labExercise4;

public class CashRegister {
	
	private int cashOnHand = 0;
	
	public CashRegister() {
		cashOnHand = 500;
	}
	public CashRegister(int cashIn) {
		cashOnHand = cashIn;
	}
	
	public int getCurrentBalance() {
		return cashOnHand;
	}
	
	public void acceptAmount(int amountIn) {
		cashOnHand += amountIn;
	}
	
}
