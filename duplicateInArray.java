package jaspreet;

public class duplicateInArray {
	static void arrayDuplicate() {
		int arr[] = {4,3,5,6,4,7,2,3,1};
		int hash[] = new int[10];
		for(int i=0;i<arr.length;i++) {
			if(hash[arr[i]]==1) {
				System.out.println(arr[i]);
			}
			hash[arr[i]]=1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayDuplicate();
	}

}
