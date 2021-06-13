package jaspreet;

public class trianglePattern {
	static int printTri(int n) {
		if(n==0) {
			System.out.println();
			return 0;
		}
		System.out.print("*");
		return printTri(n-1);
	}
	static int printPattern(int line,int n) {
		if(n==line+1) {
			return 0;
		}
		printTri(n);
		return printPattern(line,n+1);
	}
	public static void main(String args[]) {
		printPattern(5,1);
	}
}
