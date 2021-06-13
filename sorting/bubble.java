package sorting;

public class bubble {
	static void bubbleSort() {
		int temp=0;
		int arr[] = {5,8,1,6,9,2};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String args[]) {
		bubbleSort();
	}
}
