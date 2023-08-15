package peparationQuestions;

public class FindTheMiddle {
	public static void main(String[] args) {
		String a = "onesofts";
		System.out.println(a.substring(1));
		int b;
		int len;
		if (a.length() % 2 == 0) {
			b = a.length() / 2 - 1;
			len = 2;
			System.out.println(a.substring(b,b+len));
		} else {
			b = a.length() / 2;
			len = 1;
			System.out.println(a.substring(b,b+len));
		}
	
	}

}
