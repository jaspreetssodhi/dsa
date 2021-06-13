package sorting;

public class insertion {
	static void insertionSort() {
		int arr[] = {7,8,5,4,9,2};
		int temp=0;
		for(int i=1;i<arr.length;i++) {
			int current = arr[i];
			int j=i-1;
			while(j>=0 && current<arr[i]) {
				temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				j--;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertionSort();
	}

}
