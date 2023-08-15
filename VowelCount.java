package peparationQuestions;

public class VowelCount {
	public static void main(String[] args) {
		String name="ajithkumar";
		String dup="";
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='u'||name.charAt(i)=='i'||name.charAt(i)=='o') {
				dup=dup+name.charAt(i);
				count=count+1;
			}
		}
		System.out.println(dup);
		System.out.println(count);
	}

}
