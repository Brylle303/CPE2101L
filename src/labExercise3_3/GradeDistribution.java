package labExercise3_3;

public class GradeDistribution {
	
	private double gradeA, gradeB, gradeC, gradeD, gradeF;
	
	// Default constructor
	public GradeDistribution() {
		
	}
	
	// Alternative constructor
	public GradeDistribution(double gradeA, double gradeB, double gradeC, double gradeD,  double gradeF) {
		setNumberA(gradeA);
		setNumberB(gradeB);
		setNumberC(gradeC);
		setNumberD(gradeD);
		setNumberF(gradeF);
		
	}
	
	// Methods for setting each grade
	public void setNumberA(double gradeA) {
		this.gradeA = gradeA;
	}
	public void setNumberB(double gradeB) {
		this.gradeB = gradeB;
	}
	public void setNumberC(double gradeC) {
		this.gradeC = gradeC;
	}
	public void setNumberD(double gradeD) {
		this.gradeD = gradeD;
	}
	public void setNumberF(double gradeF) {
		this.gradeF = gradeF;
	}
	
	// Methods for reading each grade
	public int readGradeA() {
		return (int) gradeA;
	}
	public int readGradeB() {
		return (int) gradeB;
	}
	public int readGradeC() {
		return (int) gradeC;
	}
	public int readGradeD() {
		return (int) gradeD;
	}
	public int readGradeF() {
		return (int) gradeF;
	}
	
	// Total number of grades
	public double totalGrades() {
		return gradeA + gradeB + gradeC + gradeD + gradeF;
	}
	
	public double percentageOfGradeA() {
		return  Math.round((gradeA / totalGrades()) * 100);
	}
	public int percentageOfGradeB() {
		return (int) Math.round((gradeB / totalGrades()) * 100);
	}
	public int percentageOfGradeC() {
		return (int) Math.round((gradeC / totalGrades()) * 100);
	}
	public int percentageOfGradeD() {
		return (int) Math.round((gradeD / totalGrades()) * 100);
	}
	public int percentageOfGradeF() {
		return (int) Math.round((gradeF / totalGrades()) * 100);
	}
	
	
	public void drawGraph() {
		
		System.out.println("0    10   20   30   40   50   60   70   80   90  100%");
		
		for(int i=0;i <= 50; i++) {
			if(i % 5 != 0) {
				
				System.out.print(" ");
			}
			else {
				System.out.print("|");
			}
		}
		System.out.println();
		for(int i=0;i <= 50; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		// Drawing the asterisk for each grade
		for(int i=0;i < Math.round((percentageOfGradeA() / 2)); i++) {
			System.out.print("*");
		} System.out.print(" [A]\n");
		for(int i=0;i < Math.round((percentageOfGradeB() / 2)); i++) {
			System.out.print("*");
		} System.out.print(" [B]\n");
		for(int i=0;i < Math.round((percentageOfGradeC() / 2)); i++) {
			System.out.print("*");
		} System.out.print(" [C]\n");
		for(int i=0;i < Math.round((percentageOfGradeD() / 2)); i++) {
			System.out.print("*");
		} System.out.print(" [D]\n");
		for(int i=0;i < Math.round((percentageOfGradeF() / 2)); i++) {
			System.out.print("*");
		} System.out.print(" [F]\n");
	}
	
	//
}

