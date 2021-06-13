package jaspreet;

public class replacePi {
	static String replacepi(String str,int n)
	{	if(n==str.length()) {
		return str;
	}
		
		if(str.charAt(n)=='p') {
			str = str.substring(0,n) + 3.14 +str.substring(n+2,str.length());
		}
		return replacepi(str, n+1);
		
	}
	public static void main(String args[])
	{	String s = "4*pi+5*pi+8*pi";		
		System.out.print(replacepi(s,0));
	}
}

