package chapter2.Operators;

public class TernaryOperator {
	public static void main(String [] args) {
		String results = null;
		
		// Java only provides one ternary operator.
		results = (results == null) ? (new String("abc")) : (results.concat("def"));
		System.out.println(results);
		
		// enclosing ternary operands within parentheses is not a requirement.
		results = results == null ? new String("abc") : results.concat("def");
		System.out.println(results);
		
	}

}
