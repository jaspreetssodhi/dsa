package stack;
import java.util.Stack;
import java.util.Math;

public class largestRectArea {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bars[] =  {6, 2, 5, 4, 5, 1, 6};
		//int bars[] =  {2,1,5,6,2,3};
		int right,middle,left;
		int max_area=0;
		int area;
		
		Stack<Integer> s = new Stack<>();
		s.push(-1);
		for (int i=0;i<bars.length;i++) {
			while(s.peek()!=-1 && bars[s.peek()]>bars[i]) {
				right =i;
				middle = s.pop();
				left = s.peek();
				area = bars[middle] * (right-left-1);
				max_area = Math.max(max_area, area);
			}
			s.push(i);
		}
			while(s.peek() !=-1) {
				area = bars[s.pop()] * (bars.length - s.peek() -1);
				max_area = Math.max(max_area, area);
			}
		
		System.out.println(max_area);
	}

}
