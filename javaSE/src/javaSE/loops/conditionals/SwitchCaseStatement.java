package javaSE.loops.conditionals;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		System.out.println("------MENU------");
		System.out.println("a. Americano");
		System.out.println("b. Mochaccino");
		System.out.println("c. Cappuccino");
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'a','b':
			System.out.println("Americano is served!");
			break;
//		case 'b':
//			System.out.println("Mochaccino is served!");
//			break;
		case 'c':
			System.out.println("Cappuccino is served!");
			break;
		default:
			System.out.println("Invalid Choice!");
		}
	}
}
