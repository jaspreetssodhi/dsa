package jaspreet;

public class matrix {
	static void snakeProblem(int arr[][]) {
		int len= arr.length*arr[0].length;
		int result[] = new int[len];
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
			}
			else {
				for(int j=arr[i].length-1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
	
	static void sumBounds(int mat[][]) {
		int upper =0,lower=0;
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++) {
				if(i<j || i==j) {
					upper = upper+mat[i][j];
				}
			}
		}
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++) {
				if(i>j || i==j) {
					lower=lower+mat[i][j];
				}
			}
		}
		System.out.println("Upper bound sum : "+upper);
		System.out.println("lower bound sum : "+lower);
	}
	
	static void transpose(int [][]mat) {
		int mat1[][]=new int[mat[0].length][mat.length];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat1[j][i] = mat[i][j];
			}
		}
		for(int i=0;i<mat1.length;i++) {
			for(int j=0;j<mat1[i].length;j++) {
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { {10, 20, 30, 40},
		                {15, 25, 35, 45},
		                {27, 29, 37, 48}
		                };
		//snakeProblem(mat);
		//sumBounds(mat);
		transpose(mat);
		
	}

}
