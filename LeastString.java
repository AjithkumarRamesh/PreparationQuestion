package peparationQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LeastString {
	public static void main(String[] args) {

		String name = "java is a programming language";
		String[] ns = name.split(" ");
		int len = ns.length;
		String temp;
		System.out.println(len);

		for (int i = 0; i < len; i++) {
			for (int j = 1; j < len - i; j++) {
				if (ns[j - 1].length() > ns[j].length()) {
					temp = ns[j];
					ns[j] = ns[j - 1];
					ns[j - 1] = temp;
				}
			}

		}
		for (String n : ns) {
			System.out.print(n + " ");
		}
		//System.out.println(Arrays.toString(ns));

		System.out.println("----------");
		String name1 = "java is a programming language";
		String[] a = name1.split(" ");
		String b = a[0];
		String c = a[1];
		String d = a[2];
		String e = a[3];
		String f = a[4];

		ArrayList<String> li = new ArrayList<>();
		li.add(b);
		li.add(c);
		li.add(d);
		li.add(e);
		li.add(f);

		li.sort(Comparator.comparingInt(String::length));
		for (String s : li) {
			System.out.print(s + " ");
		}
		System.out.println("-----------");
		String wod = "java a is programming langauage ajith";
		String  ls = Arrays.stream(wod.split(" ")).sorted(Comparator.comparing(String::length)).collect(Collectors.joining(" "));
		System.out.println(ls);
		String res=Arrays.stream(wod.split(" ")).sorted(Comparator.comparing(String::length)).reduce("",(i,j)->i+" "+j);
		System.out.println(res);
				
	}
}
