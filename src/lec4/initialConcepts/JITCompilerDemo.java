package lec4.initialConcepts;

/*
 * JIT :- Just in time compiler
 *        JVM
101010  --> 00001
       JVM
101010  --> 00001
       JVM
101010  --> 00001
       JVM
101010  --> 00001
       JVM
101010  --> 00001

JIT;- to recompile the .class file at runtime to enhance the performance of the program 
 */

public class JITCompilerDemo {

	public static void main(String[] args) {
		
		int x = 10;
		
		// JIT will remove this un-used line during re-compilation
		int y = 20;
		
		System.out.println("Vishal");
		
		System.out.println("Vishal");
		
		System.out.println("Vishal");
		
		System.out.println("Vishal");
		
		System.out.println("Vishal");
		
		System.out.println(x);
	}
}
