package tut.univ.library;

public class VarDemo {

	public static void main(String[] args) {
		byte b = (byte) 128;
		int number = -123;
		int sum = 1234567890;     // This value is within the range of int
		long bigSum = 8234567890L;  // ERROR: this value is outside the range of int
		System.out.println(bigSum);
	}
}
