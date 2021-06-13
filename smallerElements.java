package jaspreet;
import java.util.HashMap;

public class smallerElements {
	static void countSmaller() {
		int arr[] = {8,1,2,2,3};
		int arr2[] = arr.clone(); 
		HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			hash.put(arr[i], i);
			}
		int output[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			hash.get(i);
		}
	}
}
