package jaspreet;

public class triABC {
	static int printABC(int n, char a) {
			if(n==0) {
				System.out.println();
				return 0;
			}
			System.out.print(065);
			return printABC(n-1,a);
		}
		static int printPattern(int line,int n,char a) {
			if(n==line+1) {
				return 0;
			}
			printABC(n,a);
			return printPattern(line,n+1,a);
		}
		public static void main(String args[]) {
			printPattern(5,1,'A');
		}
}
