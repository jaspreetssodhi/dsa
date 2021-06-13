package jaspreet;
import java.util.HashMap;

public class arratWsap {
	//using hashing
	static void pairSum() {
		int k =9;
		int arr[] = {1,2,5,4,3,7,5,6};
		
		//HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(100);
		int map[] = new int[100]; 
		for(int i=0;i<arr.length;i++) {
			int index = k-i;
			if(map[index]==1) {
				System.out.println("Pair found :"+i+index);
				//break;
			}
			else {
				map[arr[i]]=1;
			}
		}
	}
	public static void main(String args[])
	{
		pairSum();
	}
}
