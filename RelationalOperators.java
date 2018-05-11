package chapter2.Operators;

public class RelationalOperators {
	public static void main(String[] args) {
		
		byte b = 123;
		short s = 123;
		char c = 123;
		int i = 123;
		long l = 123L;
		float f = 123.123F;
		double d = 123.123;
		
		// java relational operators will automatically promote
		// a smaller numeric operand to match the numeric
		// data type of a larger opposite operand.
		
		System.out.println(f >= d);		// true
		System.out.println(b >= d);		// false
		System.out.println(f >= c);		// true
		System.out.println(i <= d);		// true
		System.out.println(s == d);		// false
	}

}
