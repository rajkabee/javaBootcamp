package javaSE.loops.forLoop;

import java.util.Scanner;

public class DecToBin {
	public static void main(String[] args) {
		int dec, rbin=1, rem, bin=0;
		System.out.println("Enter a decimal value:");
		Scanner sc = new Scanner(System.in);
		dec = sc.nextInt();
		while(dec>0) {
			rem = dec%2;
			rbin=rbin*10+rem;
			dec/=2;
		}
		while(rbin>1) {
			rem=rbin%10;
			bin=bin*10+rem;
			rbin/=10;
		}
		//bin/=10;
		System.out.println("Binary Value: "+bin);
	}
}
