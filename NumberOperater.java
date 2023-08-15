package peparationQuestions;

import java.util.ArrayList;
import java.util.List;

public class NumberOperater {
	public static void main(String[] args) {
		String a = "5+3-1";
		String[] n = a.split("\\D");
		String[] o = a.split("\\d");
		List<String> li = new ArrayList<>();
		for (String c : o) {
			if (c != "") {
				li.add(c);
			}
		}
		//System.out.println(li);
		int ans = Integer.parseInt(n[0]);
		for (int i = 0; i < li.size(); i++) {
			switch (li.get(i)) {
			case "+":
				ans = ans + Integer.parseInt(n[i + 1]);
				break;
			case "-":
				ans = ans - Integer.parseInt(n[i + 1]);
				break;
			case "*":
				ans = ans * Integer.parseInt(n[i + 1]);
				break;
			}
		}
		System.out.println(ans);
	}

}
