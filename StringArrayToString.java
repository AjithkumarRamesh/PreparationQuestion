package peparationQuestions;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringArrayToString {
	public static void main(String[] args) {
		String[] name= {"ajith","dhana","naveen","vino"};
		String a=Arrays.stream(name).collect(Collectors.joining(","));
		System.out.println('"'+a+'"');
		StringJoiner x=new StringJoiner(",");
		for(String c:name) {
			x.add(c);
		}
		System.out.println(x);
		String y=name[0];
		for(int i=1;i<name.length;i++) {
			y=y+","+name[i];
		}
		System.out.println('"'+y+'"');
	}

}
