package jaspreet;

public class power_number {
	//recursion
	static void print(int n) {
		if(n==0) {
			return;
		}
		if(n%2!=0) {
		System.out.println(n);
		}
		print(n-1);
		if (n%2==0) {
		System.out.println(n);
		}
	}
	public static void main(String args[]) {
		power(5);
}
}	
