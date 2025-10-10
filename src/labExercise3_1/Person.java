package labExercise3_1;

public class Person {

	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setNameAndAge(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean isEqual(Person person) {
		return this.name.equals(person.name) && age == person.age;
	}
	
	public boolean isSameName(String name) {
		if(this.name == name) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSameAge(int age) {
		if(this.age == age) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isOlder(int age) {
		if(this.age > age) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isYounger(int age) {
		if(this.age < age) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
