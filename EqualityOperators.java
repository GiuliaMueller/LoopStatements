package chapter2.Operators;

public class EqualityOperators {
	public static void main(String[] args) {
		String car1 = new String("Car");
		String car2 = new String("Car");
		String car3 = car1;
		
		System.out.println("Equals Operator:");
		System.out.println("(true == true) : " + (true == true));
		System.out.println("(true == false) : " + (true == false));
		System.out.println("(false == false) : " + (false == false));
		System.out.println("(10 == 10.01) : " + ( 10 == 10.01));
		System.out.println("(car1 == car2) : " + (car1 == car2));
		System.out.println("(car1 == car3) : " + (car1 == car3));
		System.out.println();
		
		System.out.println("Not Equals Operator:");
		System.out.println("(true != true) : " + (true != true));
		System.out.println("(true != false) : " + (true != false));
		System.out.println("(false != false) : " + (false != false));
		System.out.println("(10 != 10.01) : " + (10 != 10.01));
		System.out.println("(car1 != car2) : " + ( car1 != car2));
		System.out.println("(car1 != car3) : " + (car1 != car3));
		System.out.println();
	}

}
