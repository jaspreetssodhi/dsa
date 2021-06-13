package jaspreet;

public class find21 {
	static int search(int arr[], int index, int element)
	{
		if(index == arr.length-1) {
			return 0;
		}
		if(arr[index]==element) {
			return index;
		}
		return(search(arr,index+1,element));
	}
	public static void main(String args[])
	{	int arr[] = {23,45,35,24,67};
		int index1 = search(arr,0,23);
		System.out.println(index1);
		if(index1 == 0)
			System.out.println("Element not found ");
		else
			System.out.println("Element found at " + (index1+1));
		
	}

}
