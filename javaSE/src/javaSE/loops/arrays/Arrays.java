package javaSE.loops.arrays;

public class Arrays {
	public static void main(String[] args) {
		int[] arr = {54,45,26,78,39};
		int[] arr2 = new int[20];
		arr[4]=23;
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		int[][] A = {{1,2,3}, {4,5,6},{7,8,9}};
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
