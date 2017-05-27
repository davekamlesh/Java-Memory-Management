package lec4.initialConcepts;

/*
 * 1. variable
 * 2. Method
 * 3. Constructor
 * 4. static block
 * 5. instance block
 * 
 * 
 *     execution sequence
 *     
 *     1. static block
 *     2. main method
 *     3. instance block
 *     4. Constructor
 *     5. instance method
 */

public class ExecuteWithoutMain {
	
	{
		System.out.println("inside instance block...");
	}
	
	static{
		System.out.println("inside static block...");
	}
	
	public ExecuteWithoutMain() {
      System.out.println("Inside Constructor...");
	}

	public static void main(String[] args) {
		staticMethod();
		ExecuteWithoutMain aa = new ExecuteWithoutMain();
	}
	
	public void myDisplay()
	{
		System.out.println("inside method...");
	}
	
	public static void staticMethod()
	{
		System.out.println("inside static method");
	}
}
