package javaSE.loops.forLoop;

import java.util.Scanner;

public class BinToDec {
	public static void main(String[] args) {
		int bin, dec=0, rem, pv=1;
		System.out.println("Enter a binary number:");
		Scanner sc = new Scanner(System.in);
		bin = sc.nextInt();
		while(bin!=0) {
			rem=bin%10;
			dec+=rem*pv;
			pv*=2;
			bin/=10;
		}
		System.out.println("Decimal Value: "+dec);
		
	}
}
