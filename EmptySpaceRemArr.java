package peparationQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmptySpaceRemArr {
	public static void main(String[] args) {
		List<String>a=Arrays.asList("","Hi","","Hello","","All","");
		List<String>b=a.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
		List<String>c=a.stream().filter(x->!x.isBlank()).collect(Collectors.toList());
		System.out.println(c);
		System.out.println(b);
	}

}
