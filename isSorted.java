package jaspreet;

public class isSorted {
	static boolean isSort(int arr[], int n) {
		if(arr.length-1==n) {
			return true;
		}
		if(arr[n] > arr[n+1]) {
			return false;
		}
		return isSort(arr,n+1);
	}
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5};
		int n=0;
		System.out.print(isSort(arr,n)?"Array is Sorted":"Not sorted");
	}

}
