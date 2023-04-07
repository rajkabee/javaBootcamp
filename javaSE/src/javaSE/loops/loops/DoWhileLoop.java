package javaSE.loops.loops;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter a value less than 5");
			i=sc.nextInt();
		}while(i<5);
	}
}
