package javaSE.loops.conditionals;

import java.util.Scanner;

public class TerneryOperator {
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		//String msg = age<18?"Minor":"Adult";
		String msg = age<18?"Minor":age<60?"Adult":"senior";
		System.out.println(msg);
		
	}
}


/*
	res = con ? if_true: if_false
*/