package jaspreet;

public class spiralMatrix {
	static void spiral(int [][] mat) {
		int arr[] = new int[9];
		for(int i=0;i<mat[0].length;i++) {
			System.out.println(mat[0][i]);
		}
		for(int i=1;i<mat.length;i++) {
			System.out.println(mat[i][mat[i].length-1]);
		}
		for(int i= mat.length-2;i>=0;i--) {
			System.out.println(mat[mat[i].length-1][i]);
		}
		for(int i= mat.length-2;i>=1;i--) {
			System.out.println(mat[i][mat[i].length-1]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={	{1,1,1},
					{2,2,2},
					{3,3,3}};
		spiral(a);
	}

}
