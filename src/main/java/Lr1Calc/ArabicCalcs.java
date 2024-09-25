package Lr1Calc;

class ArabicCalcs extends Calculations {

	public int calk(String str) {
		if (str.contains("+")) {
			this.setNums(str.split("\\+"));
			result = this.addition(n1, n2);

		} else if (str.contains("-")) {
			this.setNums(str.split("-"));
			result = this.subtraction(n1, n2);

		} else if (str.contains("*")) {
			this.setNums(str.split("\\*"));
			result = this.multiplication(n1, n2);

		} else {
			this.setNums(str.split("/"));
			result = this.division(n1, n2);
		}
		return result;
	}

	private void setNums(String[] nums) {
		n1 = Integer.parseInt(nums[0]);
		n2 = Integer.parseInt(nums[1]);
	}
}
