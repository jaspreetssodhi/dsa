package jaspreet;

public class longestPlindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pali = "abcdedcma";
		int bps = 0;
		int bpe=0;
		int len = pali.length();
		for(int i=len/2, j=len/2;i>=0 && j<len;i--,j++) {
			if(pali.charAt(i) != pali.charAt(j)) {
				bps = i;
				bpe = j;
				break;
			}
			
			
		}
		System.out.println(len/2);
		System.out.println(bps);
		System.out.println(bpe);
		
		int s= bps+1;
		int e = bpe;
		System.out.println(s);
		System.out.println(e);
		System.out.println(pali.substring(s,e));
	
	}

}
