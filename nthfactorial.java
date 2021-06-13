package jaspreet;

public class nthfactorial {
	static int nfact(int n) {
		if(n<=1) {
			return n;
		}
		return nfact(n-1)+nfact(n-2);
		
		
	}
public static void main(String args[])
{
	System.out.print(nfact(4));
}
}
