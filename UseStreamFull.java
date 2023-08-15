package peparationQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UseStreamFull {
	public static void main(String[] args) {
		StreamFull s1=new StreamFull(1,20,"mike",90);
		StreamFull s2=new StreamFull(2,25,"Susmitha",64);
		StreamFull s3=new StreamFull(3,23,"Gugan",35);
		StreamFull s4=new StreamFull(4,26,"Biek",53);
		StreamFull s5=new StreamFull(5,22,"Vinoth",76);
		StreamFull s7=new StreamFull(7,37,"Sakthi",70);
		StreamFull s6=new StreamFull(6,40,"Bean",88);
		List<StreamFull>sf=new ArrayList<>();
		sf.add(s1);
		sf.add(s2);
		sf.add(s3);
		sf.add(s4);
		sf.add(s5);
		sf.add(s6);
		sf.add(s7);
		System.out.println(sf);
		List<String>names=sf.stream().map(a->a.getName()).toList();
		System.out.println(names);
		List<StreamFull>filtermarks=sf.stream().filter(a->a.getTotal()>70&&a.getTotal()<100).toList();
		System.out.println(filtermarks);
		long belowcount=sf.stream().filter(a->a.getAge()>25).count();
		System.out.println(belowcount);
		StreamFull maxmar=sf.stream().max(Comparator.comparingInt(StreamFull::getTotal)).get();
		System.out.println(maxmar);
		StreamFull minmar=sf.stream().min(Comparator.comparingInt(StreamFull::getTotal)).get();
		System.out.println(minmar);
		List<String>sortname=sf.stream().map(a->a.getName()).sorted().toList();
		System.out.println(sortname);
		List<StreamFull> sortnamerev=sf.stream().sorted(Comparator.comparingInt(StreamFull::getAge).reversed()).toList();
		System.out.println(sortnamerev);
		List<StreamFull>skipone=sf.stream().sorted(Comparator.comparingInt(StreamFull::getTotal)).skip(2).toList();
		System.out.println(skipone);
		StreamFull secmax=sf.stream().sorted(Comparator.comparingInt(StreamFull::getTotal).reversed()).skip(1).findFirst().get();
		System.out.println(secmax);
		Map<Integer,StreamFull>listtomap=sf.stream().collect(Collectors.toMap(a->a.getId(), b->b));
		System.out.println(listtomap);
		Set<StreamFull>listtoset=sf.stream().collect(Collectors.toSet());
		System.err.println(listtoset);
		List<StreamFull>listtolist=sf.stream().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(listtolist);
		int max=sf.stream().map(a->a.getTotal()).max(Integer::compareTo).get();
		System.out.println(max);
		int min=sf.stream().map(a->a.getTotal()).min(Integer::compareTo).get();
		System.out.println(min);
		Integer sumtotal=sf.stream().collect(Collectors.summingInt(StreamFull::getTotal));
		System.out.println(sumtotal);
		
		
	}

}
