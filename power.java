package jaspreet;

public class power {
	static int power1(int a, int b) {
		if(b==0) {
			return 1;
		}
		return a*power1(a,b-1);
		
		//System.out.print(a);
	}
	public static void main(String args[])
	{
		System.out.print(power1(2,3));
	}
}
