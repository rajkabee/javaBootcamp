package javaSE.loops.conditionals;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		if(age<18) {
			System.out.println("you are a minor!");
			System.out.println("Let me get you a chocolate!");
		}
		else if(age<60) {
			System.out.println("You are an adult!");
		}
		else {
			System.out.println("You are a senior citizen!");
			}
		
		
	}
}
