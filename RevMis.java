package peparationQuestions;

public class RevMis {
	public static void main(String[] args) {
		String name="sakthi";
		String dub="";
		for(int i=name.length()-1;i>=0;i--) {
			if(name.charAt(i)!='k') {
			dub=dub+name.charAt(i);
			}
		}
		System.out.println(dub);
	}

}
