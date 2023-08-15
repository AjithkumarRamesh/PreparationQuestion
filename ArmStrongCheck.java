package peparationQuestions;

public class ArmStrongCheck {
	public static void main(String[] arg) {
		int num=153;
		int n=num;
		int check=0;
		int reminder;
		while(num>0) {
			reminder=num%10;
			check=check+(reminder*reminder*reminder);
			num=num/10;
		}
		if(check==n) {
			System.out.println(n+" Given number is armstrong number");
		}else {
			System.out.println(n+" Give number is not armsTrong number");
		}
	}
}
