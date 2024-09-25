package Lr1Calc;

public class NumberIdentifier {
	private static String romanic = "I II III IV V VI VII VIII IX X + - * /";
	private static String arabiac = "0 1 2 3 4 5 6 7 8 9 10 + - * /";

	public static boolean isArabicNumber(String number) {
		for (int i = 0; i < number.length(); i++) {
			if (arabiac.indexOf(number.charAt(i)) == -1) {
				return false;
			}
		}
		return true;
	}

	public static boolean isRomanNumber(String number) {
		for (int i = 0; i < number.length(); i++) {
			if (romanic.indexOf(number.charAt(i)) == -1) {
				return false;
			}
		}
		return true;
	}
}
