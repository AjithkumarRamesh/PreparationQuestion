package peparationQuestions;

public class StringDub {
	public static void main(String[] args) {

		String name = "rohitajith";
		char[] ch = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[i] + " ");
				}
			}
		}
		String a = "ajithkumar";
		String b = "aravindan";
		String c = "";
		String d = "";
		for(int j=0;j<a.length();j++) {
			if(b.contains(""+a.charAt(j))) {
				if(!d.contains(a.charAt(j)+""))
				d=d+a.charAt(j);
			}else {
				if(!c.contains(a.charAt(j)+""))
				c=c+a.charAt(j);
			}
		}
		for(int j=0;j<b.length();j++) {
			if(a.contains(""+b.charAt(j))) {
				if(!d.contains(b.charAt(j)+""))
				d=d+b.charAt(j);
			}else {
				if(!c.contains(b.charAt(j)+""))
				c=c+b.charAt(j);
			}
		}

		System.out.println(c+"    "+d);
	}
}
