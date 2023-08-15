package peparationQuestions;

public class Stringrev {
	public static void main(String[] args) {
		String name="ajith kumar";
		String rev="";
		String revs="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		for(int i=0;i<name.length();i++) {
			revs=name.charAt(i)+revs;
		}
		System.out.println(revs);
		
	}

}
