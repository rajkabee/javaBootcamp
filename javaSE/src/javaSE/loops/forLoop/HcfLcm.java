package javaSE.loops.forLoop;

import java.util.Scanner;

public class HcfLcm {
	public static void main(String[] args) {
		int a, b, hcf, lcm;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		System.out.println("a: ");
		a = sc.nextInt();
		System.out.println("b: ");
		b = sc.nextInt();
//		hcf = a<b?a:b;
//		while(!(a%hcf==0 && b%hcf==0)) {
//			hcf--;
//		}
//		int x=a, y=b;
//		while(!(a%b==0)) {
//			a=a%b;
//			a=a+b;
//			b=a-b;
//			a-=b;
//		}
		int x,y;
		for(x=a, y=b; !(x%y==0); ) {
			x=x%y;
			x+=y;
			y=x-y;
			x-=y;
		}
		hcf=y;
		System.out.println("HCF: "+hcf);
		
//		lcm=x<y?y:x;
//		while(!(lcm%x==0 && lcm%y==0)) {
//			lcm++;
//		}
		lcm = a*b/hcf;
		
		System.out.println("LCM: "+lcm);
		
	}
}
