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
	
	public boolean isEqual(Object obj) {
		
		if(this == obj) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSameName(Object obj) {
		if(this.name == obj) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
