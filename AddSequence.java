package peparationQuestions;

public class AddSequence {
	public static void main(String[] args) {
		int a=5;
		int total=0;
		int seqtotal=0;
		for(int i=1;i<=a;i++) {
			total=total+i;
			seqtotal=seqtotal+total;
		}
		System.out.println(seqtotal);
	}

}
