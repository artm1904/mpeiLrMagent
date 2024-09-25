package Lr1Calc;

public class RomanCalcs extends Calculations {

	public String calk(String str) {
		if (str.contains("+")) {
			this.setNums(str.split("\\+"));
			result = this.addition(n1, n2);

		} else if (str.contains("-")) {
			this.setNums(str.split("-"));
			result = this.subtraction(n1, n2);
			if (result<0) {
				return "Неположительный результат";
			}

		} else if (str.contains("*")) {
			this.setNums(str.split("\\*"));
			result = this.multiplication(n1, n2);

		} else {
			this.setNums(str.split("/"));
			result = this.division(n1, n2);
		}

		return intToRoman(result);
	}


	private void setNums(String[] nums) {
		String[] strings = romanToInt(nums);
		n1 = Integer.parseInt(strings[0]);
		n2 = Integer.parseInt(strings[1]);
	}



	private String [] romanToInt(String[] nums){

		String[] var = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
		for (int i =0; i<var.length; i++){
			if (var[i].equals(nums[0])){
				nums[0] = String.valueOf(i);
			}
			if (var[i].equals(nums[1])){
				nums[1] = String.valueOf(i);
			}
		}
		return nums;
	}

	/**
	 *  Allows to convert integer number 1 to 4999 into Romanic style
	 * @param num integer number to convert into Romanic style
	 * @author Artem Savcneko
	 *
	 */
	private String intToRoman(int num) {
		var keys = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "	XL", "X", "IX", "V", "IV", "I"};
		var vals = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

		StringBuilder ret = new StringBuilder();
		int ind = 0;

		while (ind < keys.length) {
			while (num >= vals[ind]) {
				var d = num / vals[ind];
				num = num % vals[ind];
				for (int i = 0; i < d; i++)
					ret.append(keys[ind]);
			}
			ind++;
		}

		return ret.toString();
	}
}
