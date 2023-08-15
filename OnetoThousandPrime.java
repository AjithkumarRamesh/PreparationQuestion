package peparationQuestions;

public class OnetoThousandPrime {
	public static void main(String[] args) {
		for (int num = 2; num <= 100; num++) {
			boolean isPrime = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
				}
			}
			if (isPrime == true) {
				System.out.print(num+",");
			}
		}
	}

}
