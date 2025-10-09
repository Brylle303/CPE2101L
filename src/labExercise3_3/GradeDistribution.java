package labExercise3_3;

public class GradeDistribution {
	
	private int A, B, C, D, F;
	private int totalGrades;
	
	// Methods for setting each grade
	public void setNumberA(int A) {
		this.A = A;
	}
	public void setNumberB(int B) {
		this.B = B;
	}
	public void setNumberC(int C) {
		this.C = C;
	}
	public void setNumberD(int D) {
		this.D = D;
	}
	public void setNumberF(int F) {
		this.F = F;
	}
	
	// Methods for reading each grade
	public int readGradeA() {
		return A;
	}
	public int readGradeB() {
		return B;
	}
	public int readGradeC() {
		return C;
	}
	public int readGradeD() {
		return D;
	}
	public int readGradeF() {
		return F;
	}
	
	// Total number of grades
	
	public int totalGrades(int totalGrades) {
		this.totalGrades = totalGrades;
		return this.totalGrades;
	}
	
	
}

