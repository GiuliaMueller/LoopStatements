package chapter2.Operatrs;

public class ArithmeticOperators {
	public static void main(String [] args) {
		
		// '*', '%', and '/' have higher order of precedence than '+' and '-'
		System.out.println(2 * 5 + 3 * 4 - 8); 
		// this is equivalent to: (2*5) + (3*4) -8 = 14
		
		// modulus returns remainder of division operation
		System.out.println(32 % 3);
		// [remainder = 2]
		
		// When the modulus divided is less than the divisor, the dividend is returned as the remainder
		System.out.println(2 % 3);
		// [remainder = 2]
		
		// How many Numeric Promotions will occur?
		// What is the resulting data type?
		byte b = 1; char c = 2; short s = 3; int i = 4; long l = 5; float f = 6; double d = 7;
		System.out.println((b + c + s) - i * f / d);
		// this is equivalent to : (1 + 2 + 3) - (4 * 6) / 7
		// 6 - (24 / 7)
		// 6 - 3.428571428571429 ==
		// 2.5714285714285716
		
		// Q1 Answer: 6 numeric promotions will occur:
		// b, c, and s are promoted to int								(3)
		// i is promoted to float 										(1)
		// the results of (i * f) is promoted from float to double		(1)
		// the results of (b + c + s) is promoted from int to double	(1)
		// Q2 Answer: the resulting data type is a double
	}
	
	
	

}
