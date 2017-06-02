package lec6.initialConcepts.controlflow;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		int sum=0;
		
		// Normal For Loop
		
		for(int i=1; i <=10; i++)
		{
			sum = sum + i;
		}
		
		System.out.println(sum);
	
		// Normal For Loop...
		sum = 0;
		int[] numbers = {2,17,15,4,5,6,7,8,9,10};
		
		for(int x =0; x < numbers.length; x++)
		{
			if( x == 5)
			{
				break;
			}
			sum = sum + numbers[x];
		}
		
		System.out.println("Sum of array is " + sum);
		
		//Advance For Loop

		// CTRL + SPACE
		sum =0;
		//for(int x =0; x < numbers.length; x++)
		for (int i : numbers) {
			sum = sum +i;
		}
		
		System.out.println("Sum of Advance for loop " + sum);
	
		// Empty For Loop   -> infinite for loop   --> Just like while(true)
		
		/*for (;;) {
			System.out.println("Infinite Loop");
		}*/
		
		/*while(true){
			System.out.println("Infinite Loop in while");
		}*/
	}
	
	
}
