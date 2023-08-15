package peparationQuestions;

public class TwoStringDup {
	public static void main(String[] args) {
		String name="ajithkumar";
		String name1="rohitajith";
		String unick="";
		String dup="";
		for(int i=0;i<name.length();i++) {
			boolean isDup=true;
			for(int j=0;j<name1.length();j++) {
				if(isDup&&name.charAt(i)!=name1.charAt(j)) {
				System.out.println(name.charAt(i)+""+name.charAt(j));	
				}
			}
		}
	}

}
