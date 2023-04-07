package javaSE.loops.loops;

public class Shapes {
	public static void main(String[] args) {
		int i, j;
		System.out.println("Rectangle: ");
		for(j=0; j<5; j++) {
			for(i=0; i<5; i++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		System.out.println("Triangle 1: ");
		for(j=0; j<5; j++) {
			for(i=0; i<=j; i++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		System.out.println("Triangle 2: ");
		for(j=0; j<5; j++) {
			for(i=0; i<5-j; i++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		System.out.println("Triangle 3: ");
		for(j=0; j<5; j++) {
			for(i=0; i<4-j; i++) {
				System.out.print("   ");
			}
			for(i=0; i<=j; i++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		

		System.out.println("Triangle 4: ");
		for(j=0; j<5; j++) {
			for(i=0; i<j; i++) {
				System.out.print("   ");
			}
			for(i=0; i<5-j; i++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		
		
	}
}
