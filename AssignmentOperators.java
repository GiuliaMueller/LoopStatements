package chapter2.Operators;

public class AssignmentOperators {
	public static void main(String [] args) {
		short s = 32766; 	int i = 100;
		
		// Explicit number type down casting may lead to loss of precision.
		short a = (short) (s + i);
		System.out.println(a);
		
		// Compound assignment operators ("+=", "-=", etc.) will perform an automatic explicit down cast
		// without waring of potential loss of precision.
		short b = s += i; // equivalent to the above: s = (short) (s + i);
		System.out.println(b);
		
		// assignment operators return the assigned value
		int c = 0;
		System.out.println((10 * (c += 10)) + 3);
	}

}
