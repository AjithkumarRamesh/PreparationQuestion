package peparationQuestions;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=false;
			}
		}
		if(isPrime==true) {
			System.out.println(num+"Number is Prime");
		}
		else {
			System.out.println(num+"Number is Not a Prime");
		}
	}

}
