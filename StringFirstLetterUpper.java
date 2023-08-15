package peparationQuestions;

public class StringFirstLetterUpper {
	public static void main(String[] args) {
		String name="java programm is easy to compare in c++";
		String[]a=name.split(" ");
		String dup="";
		for(int i=0;i<a.length;i++) {
			String one=a[i].substring(0,1);
			String two=a[i].substring(1);
			dup=dup+one.toUpperCase()+two+" ";
			
		}
		System.out.println(dup);
	}

}
