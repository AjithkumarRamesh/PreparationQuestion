package peparationQuestions;

public class MissingNumber {
	public static void main(String[] args) {
		String num = "13579";
		for (int i = 0; i < 10; i++) {
			if (!num.contains(i + "")) {
				System.out.println(i);
			}
		}
		System.out.println("------------");
		int[] a = { 1, 2, 4, 6, 8, 9 };
		for (int i = 0; i < 10; i++) {
			int c = 0;
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					c++;
				}
			}
			if (c == 0) {
				System.out.println(i);
			}
		}
	}
}
