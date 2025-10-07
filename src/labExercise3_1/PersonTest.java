package labExercise3_1;

public class PersonTest {

	public static void main(String[] args) {
		Person firstPerson = new Person();
		Person secondPerson = new Person();
		
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
		
		System.out.println("\nAre they equal?: " + firstPerson.isEqual(secondPerson));
		System.out.println("Same name?:\t " + firstPerson.isSameName(name2));
		System.out.println("Same age?:\t " + firstPerson.isSameAge(age2));
		System.out.println("Person 1 older?: " + firstPerson.isOlder(age2));
		System.out.println("Person 1 younger?: " + firstPerson.isYounger(age2));
		
	}

}
