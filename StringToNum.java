package peparationQuestions;

public class StringToNum {
	public static void main(String[] args) {
		String words="a1b2c3";
		for(int i=0;i<words.length();i+=2) {
			int c=Integer.parseInt(words.charAt(i+1)+"");
			for(int j=0;j<c;j++) {
				System.out.print(words.charAt(i)+" ");
			}
			System.out.println();
		}
		
	}

}
