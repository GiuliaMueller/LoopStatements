package chapter2.Operators;

public class UnaryOperators {
	public static void main(String[] args) {
		
		// Will the following output be positive or negative?
		int posOrNeg = - (-1);
		System.out.println("negation operator results = "+ posOrNeg);
		// literal "1" defaults to positive, next the inner "-" reverse to
		// negative, then the outer "-" reverse it back to positive.

		int x = 10;
		System.out.println("x = "+ x-- +", x = "+ ++x +", x = "+ x-- );
		// x-- decrement occurs after the 1st String concatenation,
		// ++x increment occurs before the 2nd String concatenation,
		// x-- decrement occurs after 3rd String concatenation.
		// x = 9;
		
		System.out.println(10 * x-- + --x   + --x % 9);
		// The above equates to: (10 * 9) + 7 + (6 % 9) = 103
		// NOTE: Unary increment/decrement operators have higher order of 
		// precedence the "--x" in the modulus.
	}

}
