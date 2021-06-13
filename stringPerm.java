package jaspreet;

import java.util.ArrayList;

public class stringPerm {
	static ArrayList<String> subPerm(String str) {
		if(str.length()==0) {
			ArrayList<String> temp = new ArrayList<>();
			temp.add("");
			return temp;
		}
		
		char firstChar = str.charAt(0);
		String remaining = str.substring(1);
		ArrayList<String> finalResult = new ArrayList<String>();
		ArrayList<String> tempResult = subPerm(remaining);
		for(String temp: tempResult) {
			for(int i=0;i<=temp.length();i++) {
				StringBuffer sb = new StringBuffer(temp);
				sb.insert(i,firstChar);
				finalResult.add(sb.toString());
			}			
		}
		
		subPerm(remaining);
		return finalResult;
	}
		public static void main(String args[]) {
		System.out.print(subPerm("ABC"));
	}

}
