package lec7.arrays;

public class Student {

	static int[] marks = { 10, 15, 20, 25, 30 }; // data structure
	static int sum = 0;

	public static void main(String[] args) {
		
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
   
		System.out.println("First for loop sum "+ sum);
		
		sum = 0; 
		for (int mark : marks) {
			sum = sum + mark;
		}
		
		System.out.println("Second for loop sum "+ sum);
	}
}
