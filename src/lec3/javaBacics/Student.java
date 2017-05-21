package lec3.javaBacics;

public class Student {

	// variables, member variables, instance variables
	private int age;     // 0
	private String name;   //  null
	
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public Student() {
	}
	
	// ALT + SHIFT + S
	
	public  int getAge() {
		return age;
	}
	public  void setAge(int age) {
		this.age = age;
	}
	public  String getName() {
		return name;
	}
	public  void updateName(String name) {
		this.name = name;
	}
	
}
