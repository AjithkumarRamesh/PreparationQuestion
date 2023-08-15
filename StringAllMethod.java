package peparationQuestions;

public class StringAllMethod {
	public static void main(String[] args) {
		String name = "AjItHkUmAr1+2-3%";
		String a = "";
		String b = "";
		String c = "";
		String d = "";
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
				a = a + name.charAt(i);
			} else if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') {
				b = b + name.charAt(i);
			} else if (name.charAt(i) >= '0' && name.charAt(i) <= '9') {
				c = c + name.charAt(i);
			} else {
				d = d + name.charAt(i);
			}

		}
		System.out.println("UpperCase  :"+a);
		System.out.println("LowerCase  :"+b);
		System.out.println("Numbers    :"+c);
		System.out.println("Symbols    :"+d);
	}

}
