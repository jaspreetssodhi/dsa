package jaspreet;

public class sortBubble {
	static void sortB(int arr[], int i, int n) {
		int temp;
		if(n==0) {
			for(int j=0;j<arr.length;j++)
				System.out.print(arr[j]);
			return ;
		}
		if(i==n) {
			sortB(arr,0,n-1);
			return;
		}
		if(arr[i]>arr[i+1]) {
			temp = arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			//System.out.println(arr[i]);
			}
		sortB(arr,i+1,n);
	}
	public static void main(String args[]) {
		int arr[]= {5,4,3,2,1};
		sortB(arr,0,arr.length-1);
}
}