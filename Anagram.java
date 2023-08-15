package peparationQuestions;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String a="tea";
		String b="eat";
		boolean e = false;
		if(a.length()==b.length()) {
			char[] aa=a.toCharArray();
			char[] bb=b.toCharArray();
			
			Arrays.sort(aa);
			Arrays.sort(bb);
		
			
		   e=Arrays.equals(aa, bb);
		}
		
		if(e==true) {
			System.out.println(a+" "+b+" an anagram");
		}else {
			System.out.println(a+" "+b+" not an anagram");
		}
	}

}
