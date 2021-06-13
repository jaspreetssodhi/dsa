package jaspreet;

public class addMultiply {
	static void add(int [][]mat1, int [][]mat2) {
		int res[][] = new int[mat1.length][mat1[0].length];
		for(int i=0;i<mat1.length;i++) {
			for(int j=0;j<mat1[i].length;j++) {
				res[i][j] = mat1[i][j]+mat2[i][j];
			}
		}
		
		for(int i=0;i<mat1.length;i++) {
			for(int j=0;j<mat1[i].length;j++) {
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
	}
	
	static void multiply(int [][]a, int [][]b) {
		int res[][] = new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a.length;k++) {
				res[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
		
		//add(a,b);
		multiply(a,b);
	}

}
