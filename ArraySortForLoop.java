package peparationQuestions;

import java.util.Arrays;

public class ArraySortForLoop {
	public static void main(String[] args) {
		int[] num = {2,8,0,1,7,3,10};
		int temp=0;
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println("Ascending order");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] >num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}

			System.out.println(num[i]);
		}
		System.out.println("Descenting order");
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]<num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
			System.out.println(num[i]);
		}

	}

}
