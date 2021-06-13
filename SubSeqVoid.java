package jaspreet;

public class SubSeqVoid {
	static void subSeq(String str, String result) {
		if(str.length() == 0) {
			System.out.print(result+',');
			return;
		}
		//System.out.print(" ,");
		char first = str.charAt(0);
		String remaining = str.substring(1);
		//System.out.print(first + " ");
		//System.out.print(remaining + " ");
		subSeq(remaining, result);
		subSeq(remaining, result + first );
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subSeq("abc"," ");
	}

}
