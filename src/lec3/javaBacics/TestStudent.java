package lec3.javaBacics;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		/*System.out.println(s1.age);
		System.out.println(s1.name);*/
		
		Student s2 = new Student(20, "Vishal");
		s2.updateName("Kanhaiya");
		/*System.out.println(s2.age);
		System.out.println(s2.name);*/
		
		System.out.println(s2.getName());
		/*s2.name = "Kanhaiya";
		
		System.out.println("Name after change " +s2.name);
		 s2 = new Student(20, "Rohan");*/
		
		
	}
}
