package peparationQuestions;

public class DecimalPointEqual {
	public static void main(String[] args) {

		float a = 10.25f;
		float b = 11.15f;
		int c = (int) ((a-(int)a) * 100);
		int d = (int) ((b-(int)b) * 100);
		if (c == d) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

		for (int num = 2; num < 20; num++) {
			boolean isPrime = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
				}
			}
			if (isPrime == true) {
				System.out.print(num + ",");
			}
		}

	}

}
