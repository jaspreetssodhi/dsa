package jaspreet;
import java.util.ArrayList;

public class subSequence {
	static ArrayList<String> subSeq(String str) {
		if(str.length() == 0) {
			ArrayList<String> temp = new ArrayList<String>();
			temp.add("");
			return temp;
		}
		
		char firstChar = str.charAt(0);
		String remaining = str.substring(1);
		ArrayList<String> finalResult = new ArrayList<String>();
		ArrayList<String> tempResult = subSeq(remaining);
		for(String temp: tempResult) {
			finalResult.add(temp);
			finalResult.add(firstChar+temp);
		}
		
		subSeq(remaining);
		return finalResult;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(subSeq("SAIBY"));

	}

}
