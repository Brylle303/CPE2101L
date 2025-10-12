package labExercise3_1;

public class PersonTest {

	public static void main(String[] args) {
		Person firstPerson = new Person();
		Person secondPerson = new Person();
		
		// CASE 1:
		System.out.println("CASE 1: Diff name & Diff age");
		firstPerson.setName("Brylle");
		firstPerson.setAge(19);
		secondPerson.setName("Jenny");
		secondPerson.setAge(20);
		
		String name1 = firstPerson.getName();
		int age1 = firstPerson.getAge();
		String name2 = secondPerson.getName();
		int age2 = secondPerson.getAge();
		
		System.out.print("Person 1: " + name1 + " ");
		System.out.println(age1 + " years old");
		System.out.print("Person 2: " + name2 + " ");
		System.out.println(age2 + " years old");
		
		System.out.println("Are they equal?: " + firstPerson.isEqual(secondPerson));
		System.out.println("Same name?:\t " + firstPerson.isSameName(name2));
		System.out.println("Same age?:\t " + firstPerson.isSameAge(age2));
		System.out.println("Person 1 older?: " + firstPerson.isOlder(age2));
		System.out.println("Person 1 younger?: " + firstPerson.isYounger(age2));
		
		//CASE 2:
		System.out.println("\nCASE 2: Same name & Same age");
		firstPerson.setName("Brylle");
		firstPerson.setAge(20);
		secondPerson.setName("Brylle");
		
		name1 = firstPerson.getName();
		age1 = firstPerson.getAge();
		name2 = secondPerson.getName();
		
		System.out.print("Person 1: " + name1 + " ");
		System.out.println(age1 + " years old");
		System.out.print("Person 2: " + name2 + " ");
		System.out.println(age2 + " years old");
		
		System.out.println("Are they equal?: " + firstPerson.isEqual(secondPerson));
		System.out.println("Same name?:\t " + firstPerson.isSameName(name2));
		System.out.println("Same age?:\t " + firstPerson.isSameAge(age2));
		System.out.println("Person 1 older?: " + firstPerson.isOlder(age2));
		System.out.println("Person 1 younger?: " + firstPerson.isYounger(age2));
		
		// CASE 3:
		System.out.println("\nCASE 3:");
		
		secondPerson.setAge(19);
		
		age2 = secondPerson.getAge();
		
		System.out.print("Person 1: " + name1 + " ");
		System.out.println(age1 + " years old");
		System.out.print("Person 2: " + name2 + " ");
		System.out.println(age2 + " years old");
		
		System.out.println("Are they equal?: " + firstPerson.isEqual(secondPerson));
		System.out.println("Same name?:\t " + firstPerson.isSameName(name2));
		System.out.println("Same age?:\t " + firstPerson.isSameAge(age2));
		System.out.println("Person 1 older?: " + firstPerson.isOlder(age2));
		System.out.println("Person 1 younger?: " + firstPerson.isYounger(age2));
		
			
	}

}
