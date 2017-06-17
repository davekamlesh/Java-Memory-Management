package lec7.arrays;

public class DifferentArrayDeclarations {

	public static void main(String[] args) {
		Integer i =0;
		
		int marks1[] = new int[4];
		
		
		int x;
		int[] marks;  // Declare an int array named marks
        // marks contains a special value called null.
		
		int newMarks[];  // Same as above, but the above syntax recommended
		
		marks = new int[5];   // Allocate 5 elements via the "new" operator
		
		marks[3] = 25;
		System.out.println(marks.length);
		
		//Declare and allocate a 20-element array in one statement via "new" operator
		int[] factors = new int[20];
		
		factors[0] = 25;
		factors[1] = 30;
		
		//Declare, allocate a 6-element array thru initialization
		int[] numbers = {11, 22, 33, 44, 55, 66}; // size of array deduced from the number of items
	
	}
// type main + CTRL + SPACE
	
	
}
