package midtermExam1;

//UML & SCREENSHOTS LINK: https://drive.google.com/drive/folders/13fkehd1ZA7oNkTGOATWu6SFieFlQvWj0?usp=sharing

public class BookstoreCredit {
	public static final double creditMultiplier = 75;
	
	private String name;
	private double gradePointAverage;
	private double credit;
	
	
	//CONSTRUCTORS
	public BookstoreCredit() {
		gradePointAverage = 0;
		credit = 0;
	}
	
	public BookstoreCredit(String name, double gradePointAverage) {
		this.name = name;
		this.gradePointAverage = gradePointAverage;
	}
	
	//METHODS
	
	public String getName() {
		return name;
	}
	
	public double getGradePointAverage() {
		return gradePointAverage;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGradePointAverage(double gradePointAverage) {
		this.gradePointAverage = gradePointAverage;
	}
	
	public double computeCredit() {
		return credit = creditMultiplier * gradePointAverage;
	}
	

	
}
