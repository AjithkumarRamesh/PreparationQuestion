package peparationQuestions;

public class ArrayAdd5 {
	public static void main(String[] args) {
		int[]num= {0,1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(5==num[i]+num[j]||num[i]+num[j]==7) {
					System.out.println(num[i]+","+num[j]);
				}
				
			}
		}
	}

}
