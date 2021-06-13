package jaspreet;

public class prefixSum {
	static int prefixsum(int start, int end) {
		int curr=0,prev=0;
		int arr[] = {9,8,1,2,3,6,4};
		for(int i=1;i<arr.length;i++) {
			curr=arr[i];
			prev = arr[i-1];
			arr[i]=curr+prev;
		}
		/*for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}*/
		return arr[end]-arr[start];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = prefixsum(0,2);
		System.out.println(res);
	}

}
