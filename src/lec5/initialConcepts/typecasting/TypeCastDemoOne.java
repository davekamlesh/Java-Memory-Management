package lec5.initialConcepts.typecasting;

public class TypeCastDemoOne {

	public static void main(String[] args) {
		// Implicit Type Casting
		int x = 10;
		long l = x;
		System.out.println(l);
		
		
		// Explicit Type Casting
		long l1 = 12345;
		int x1 = (int) l1;
		System.out.println(x1);
		
		//What is value exceed in explicit type casting
		
		int num = 129;
		// 1 Byte :- -128 -> 0 -> 127
		byte b = (byte)num;
		System.out.println(b);
		
	}
}
