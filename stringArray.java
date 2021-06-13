package jaspreet;

public class stringArray {
	static void removeDuplicate(String str) {
		str.toLowerCase();
		char []a =str.toCharArray();
		int []hash = new int[26];
		for(int i=0;i<a.length;i++) {
			hash[a[i]-97] = hash[a[i]-97]+1;
		}
		for(int k=0;k<hash.length;k++) {
			if(hash[k]==0) {
				System.out.println('a'+k);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeDuplicate("aabb");
	}

}
