package jaspreet;

public class stringVoidPerm {
	static void perm(String str, String result) {
		if(str.length()==0) {
			System.out.println(result);
			return;
		}
		
		for(int i=0;i<=str.length();i++) {
			char first = str.charAt(i);
			String remaining = str.substring(0,i)+str.substring(i+1);
			perm(remaining, result+first);
		}				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perm("abc", " ");
	}

}
