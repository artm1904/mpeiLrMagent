package Lr1Calc;

abstract class Calculations {
	int n1, n2;
	int result;

	protected int addition(int n1, int n2) {
		return (n1 + n2);
	}

	protected int subtraction(int n1, int n2) {
		return (n1 - n2);
	}

	protected int multiplication(int n1, int n2) {
		return (n1 * n2);
	}

	protected int division(int n1, int n2) {
		return (n1 / n2);
	}
}
