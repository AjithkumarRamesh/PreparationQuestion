package peparationQuestions;

public class SingleNumber {
	public static void main(String[] args) {
		int[] a = { 3, 4, 2, 1,5 };
		int output=0;
		for(int i=0;i<a.length;i++) {
			output=output*10+a[i];
		}
		System.out.println(output);
	}

}
