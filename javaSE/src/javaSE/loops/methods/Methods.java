package javaSE.loops.methods;

import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
//		int a=5;
//		int b=7;
//		int sum;
//		add(a,b);
		//System.out.println("SUM: "+sum);
		
		int bnum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary value: ");
		bnum = sc.nextInt();
		int d = bin2dec(bnum);
		System.out.println("Decimal Value: "+d);
	}
	
	static void add(int x, int y){
		int z;
		z=x+y;
		//return z;
		System.out.println("SUM: "+z);
	}
	
	static int bin2dec(int bin) {
		int dec=0, rem, pv=1;
		while(bin>0) {
			rem=bin%10;
			dec+=rem*pv;
			pv*=2;
			bin/=10;
		}
		return dec;
	}
}
