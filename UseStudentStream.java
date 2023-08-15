package peparationQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UseStudentStream {
	public static void main(String[] args) {
		StudentStream s1 = new StudentStream(1, "ajith", 98);
		StudentStream s2 = new StudentStream(2, "gugan", 90);
		StudentStream s3 = new StudentStream(5, "john", 70);
		StudentStream s4 = new StudentStream(6, "sanjai", 100);
		StudentStream s5 = new StudentStream(7, "shakthi", 78);
		StudentStream s6 = new StudentStream(8, "nbll", 80);
		ArrayList<StudentStream> ss = new ArrayList<>();
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		ss.add(s4);
		ss.add(s5);
		ss.add(s6);
		StudentStream tm = ss.stream().sorted(Comparator.comparingInt(StudentStream::getMark).reversed()).skip(2)
				.findFirst().get();
		System.out.println(tm);
		List<StudentStream> tt = ss.stream().sorted(Comparator.comparingInt(StudentStream::getMark).reversed()).limit(3)
				.toList();
		System.out.println(tt);
		int max = ss.stream().map(x -> x.getMark()).sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		System.out.println(max);
		int maxs = ss.stream().map(x -> x.getMark()).max(Integer::compareTo).get();
		System.out.println(maxs);
		int min = ss.stream().map(x -> x.getMark()).min(Integer::compareTo).get();
		System.out.println(min);
		int mintwo = ss.stream().map(x -> x.getMark()).sorted().skip(1).findFirst().get();
		System.out.println(mintwo);
		StudentStream sm = ss.stream().sorted(Comparator.comparingInt(StudentStream::getMark).reversed()).skip(1)
				.findFirst().get();
		System.out.println(sm);

		long vc = ss.stream().map(x -> x.getName()).filter(
				x -> x.contains("a") || x.contains("e") || x.contains("i") || x.contains("u") || x.contains("o"))
				.count();
		System.out.println(vc);
		String ds = "ajithkuamr";
		long ds1 = ds.chars().filter(x -> "aeiou".indexOf(x) >= 0).count();
		System.out.println(ds1);
		List<String>ds2=Arrays.asList("ajithkuamr");
		//String ds3=ds2.stream().reduce(0,(i,j)->i+"kuamr"+j);

	}

}
