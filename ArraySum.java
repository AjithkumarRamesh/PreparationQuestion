package peparationQuestions;

import java.util.ArrayList;
import java.util.List;

public class ArraySum {
	public static void main(String[] args) {
		List<Integer>a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(7);
		a.add(9);
		int s=a.stream().mapToInt(Integer::intValue).sum();
		System.out.println(s);
	}

}
//