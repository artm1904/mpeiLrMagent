package Lr1Calc;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner tty1 = new Scanner(System.in);
		while (tty1.hasNextLine()) {

			String number = tty1.nextLine();
			if (NumberIdentifier.isArabicNumber(number)) {
				ArabicCalcs c = new ArabicCalcs();
				int calkArabic = c.calk(number);
				System.out.print("Ответ на введенное выражение: "+number);
				System.out.println(" = "+ calkArabic);

			} else if (NumberIdentifier.isRomanNumber(number)) {
				RomanCalcs c = new RomanCalcs();
				String calkRoman = c.calk(number);
				System.out.print("Ответ на введенное выражение: "+number);
				System.out.println(" = "+ calkRoman);
			} else {
				System.out.println("Неверный формат чисел");
			}


		}

		tty1.close();
	}
}
