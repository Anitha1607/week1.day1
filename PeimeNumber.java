package seleiniumAssignments;

public class PeimeNumber {

	public static void main(String[] args) {
		int a = 13;
		boolean flag = false;

		for (int i = 2; i <= a; i++) {

			if (a % 2 != 0) {

				flag = true;
				break;

			}

		}
		if (flag) {

			System.out.println("the number is prime");
		} else {
			System.out.println("the number is not prime");

		}

	}

}
