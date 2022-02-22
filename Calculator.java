package seleiniumAssignments;

public class Calculator {

	public int addThreeNumbers() {
		int a = 10;
		int b = 20;
		int c = 30;
		int sum = (a + b + c);
		System.out.println(sum);
		return a + b + c;
	}

	public int subTwoNumbers() {
		int a = 50;
		int b = 20;
		int sub = (a - b);
		System.out.println(sub);
		return a - b;
	}

	public double mulTwoNumbers() {
		double a = 5;
		double b = 2;
		double mul = (a * b);
		System.out.println(mul);
		return (a * b);
	}

	public float divTwoNumbers() {
		float a = 8;
		float b = 2;
		float div = (a / b);
		System.out.println(div);
		return a / b;
	}

	/*
	 * public static void main(String[] args) { Calculator add =new Calculator();
	 * add.addThreeNumbers();
	 * 
	 * Calculator sub =new Calculator(); sub.subTwoNumbers();
	 * 
	 * Calculator mul =new Calculator(); mul.mulTwoNumbers();
	 * 
	 * Calculator div =new Calculator(); div.divTwoNumbers();
	 * 
	 * 
	 * }
	 */

}