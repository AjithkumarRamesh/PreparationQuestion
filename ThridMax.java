package peparationQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThridMax {
	public static void main(String[] args) {
		int[] num = { 2, 10, 90, 10, 20, 100, 101,99 };
		int len = num.length;
		int max=0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (num[i] < num[j]) {
					max = num[i];
					num[i] = num[j];
					num[j] = max;
				}
			}

		}
		System.out.println(num[len - 3]);
		List<Integer>ar=Arrays.asList(2,10,90,10,20,100,101,99);
		int tm=ar.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		System.out.println(tm);
		ar.stream().filter(x->x%2==0).map(x->x+100).forEach(x->System.out.println(x));
	}

}
