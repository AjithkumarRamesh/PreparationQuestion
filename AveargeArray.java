package peparationQuestions;

public class AveargeArray {
	public static void main(String[] args) {
		int[]a= {2,5,10,20,1};
		int len=a.length;
		int ave=0;
		for(int i=0;i<a.length;i++) {
			ave=ave+a[i];
		}
		int sum=ave/len;
		System.out.println(sum);
		
	}

}
