package day2;

public class DecisionMakingWithOperators {
	public static void main(String[] args) {
		int x = 5, y = 10;
		int a = 10;
		int b = 20;

		if (x >= y) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (!(a < b) || (a == b)) {
			System.out.println("Condition is TRUE");
		} else

		{
			System.out.println("Condition is FALSE");
		}
	}

}
