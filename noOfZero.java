package jaspreet;

public class noOfZero {
	static int count(int n, int c) {
		if(n==0) {
			return c;			
		}
		if(n%10==0)
			{c++;
			
			}
		n=n/10;
		return count(n,c);
	}
	public static void main(String args[]) {
		System.out.print(count(1040003,0));
	}

}
