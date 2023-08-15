package peparationQuestions;

public class CountPLetter {
	public static void main(String[] args) {
		String a="apple plants";
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='p') {
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
