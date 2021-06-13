package stack;

public class gasStation {

	public static void main(String args[]) {
		int []gas  = {1,2,3,4,5};
		int []cost = {3,4,5,1,2};
		
		for(int i=0;i<gas.length;i++) {
			if(gas[i]>cost[i])
				{System.out.print(i);
				break;}
			}
		
		
		
		
	}
}
