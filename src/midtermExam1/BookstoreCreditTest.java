package midtermExam1;

public class BookstoreCreditTest {

	//UML & SCREENSHOTS LINK: https://drive.google.com/drive/folders/13fkehd1ZA7oNkTGOATWu6SFieFlQvWj0?usp=sharing
	
	public static void main(String[] args) {
		BookstoreCredit studentOne = new BookstoreCredit();
		BookstoreCredit studentTwo = new BookstoreCredit();
		BookstoreCredit studentThree = new BookstoreCredit("Mark", 1.5);
		
		studentOne.setName("Brylle");
		studentOne.setGradePointAverage(3.0);
		studentTwo.setName("Josh");
		studentTwo.setGradePointAverage(2.2);
		//studentThree.setName("Mark");
		//studentThree.setGradePointAverage(1.5);
		
		
		System.out.println("Book Store Credit Test:");
		System.out.println("Student 1:\nName: " + studentOne.getName());
		System.out.println("GPA: " + studentOne.getGradePointAverage());
		System.out.println("Credit: PHP " + studentOne.computeCredit());
		
		System.out.println("\nStudent 2:\nName: " + studentTwo.getName());
		System.out.println("GPA: " + studentTwo.getGradePointAverage());
		System.out.println("Credit: PHP " + studentTwo.computeCredit());
		
		System.out.println("\nStudent 3:\nName: " + studentThree.getName());
		System.out.println("GPA: " + studentThree.getGradePointAverage());
		System.out.println("Credit: PHP " + studentThree.computeCredit());
		
		

	}

}
