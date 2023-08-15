package peparationQuestions;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student(1,"Dhana",21,80);
		Student s2=new Student(2,"john",20,98);
		Student s3=new Student(3,"Naveen",20,78);
		Student s4=new Student(4,"Anesh",25,90);
		Student s5=new Student(5,"Bhuwan",26,75);
		ArrayList<Student>as=new ArrayList<>();
		as.add(s1);
		as.add(s2);
		as.add(s3);
		as.add(s4);
		as.add(s5);
		Map<Integer,Student>mp=as.stream().collect(Collectors.toMap(a->a.getId(), b->b));
		System.out.println(mp);
		
	}

}
