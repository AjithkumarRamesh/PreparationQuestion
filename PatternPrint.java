package peparationQuestions;

public class PatternPrint {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------");
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("---------");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		System.out.println("-----------");
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("-----------");
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------");
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j <= 5; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("------------");
		String a = "a1b2c3";

		for (int i = 0; i < a.length(); i += 2) {
			int b = Integer.parseInt(a.charAt(i + 1) + "");
			for (int j = 0; j < b; j++) {
				System.out.print(a.charAt(i) + " ");
			}
			System.out.println();
		}
		System.out.println("---------------");
		String b="A1B3A4";
		for(int i=0;i<b.length();i+=2) {
			int c=Integer.parseInt(b.charAt(i+1)+"");
			for(int j=0;j<c;j++) {
				System.out.print(b.charAt(i)+" ");
			}
			System.out.println();
			
		}
		System.out.println("--------------");
		for(int i=1;i<4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i*2+" ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		for(int i=3;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(i*3+" ");
			}
			System.out.println();
		}
	}

}
