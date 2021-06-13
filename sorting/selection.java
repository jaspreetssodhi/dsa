package sorting;

public class selection {
	static void selectionSort() {
		int arr[] = {7,8,5,4,9,2};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			int min= arr[i];
			int minindex=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					minindex=j;
				}				
			
			if(arr[i]>arr[j]) {
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selectionSort();
	}

}
