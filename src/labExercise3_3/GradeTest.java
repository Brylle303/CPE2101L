package labExercise3_3;

public class GradeTest {

	public static void main(String[] args) {
		GradeDistribution myGrades = new GradeDistribution(1, 4, 6, 2, 1);
		
		// You can also alternatively set them one by one below
//		myGrades.setNumberA(1);
//		myGrades.setNumberB(4);
//		myGrades.setNumberC(6);
//		myGrades.setNumberD(2);
//		myGrades.setNumberF(1);
		
		myGrades.drawGraph();
		
	}

}
