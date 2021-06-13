package sorting;

public class quick {
	static void quickSort() {
		int arr[] = {7,8,5,4,9,2};
		int i=0;
		int temp = 0;
		int j=arr.length-2;
		int pivot = arr.length-1;
		for(int k=0;k<arr.length-1;k++) {
			if(arr[i]>arr[pivot] && arr[j]<arr[pivot]) {
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			else 
				if(arr[i]<arr[pivot]){
					i++;
				}
				else 
					if(arr[j]>arr[pivot]){
						j--;
					}
					else if(i>=j) {
						temp = arr[i];
						arr[i]=arr[pivot];
						arr[pivot]=temp;
						break;
					}
			
		}
		return arr;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quickSort(arr);
		int arr[] = {7,8,5,4,9,2};
		for(int m=0;m<arr.length;m++) {
			System.out.print(arr[m]+ " ");
		}
	}

}
