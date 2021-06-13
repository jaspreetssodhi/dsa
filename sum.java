package jaspreet;

public class sum {
	static int sumOfDigit(int n,int sum) {
		if(n<10) {
			return sum+=n;
		}
		sum +=n%10;
		n=n/10;
		return sumOfDigit(n,sum);
		}
	public static void main(String args[])
	{
		System.out.print(sumOfDigit(2341,0));
	}

}
