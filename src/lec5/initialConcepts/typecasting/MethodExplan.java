package lec5.initialConcepts.typecasting;

public class MethodExplan {

	// Calling Method
	public static void main(String[] args) {
		display();
		int result = sum(10, 20);
		
		System.out.println(result);
	}
	
	// Called Method
	
	// If method does not return anything then we write "void"
	public static void display()
	{
		System.out.println("Vishal");
		return;
	}
	
	public static int sum(int x, int y){
		int temp = x+y;
		return temp;
	}
}
