package peparationQuestions;

public class FibonnicSeries {
	public static void main(String[] args) {
		int n=10;
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;i<=n;i++) {
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		}
	}

}
