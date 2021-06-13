package jaspreet;

public class demoVoidDice {
	static void dice(int start, int end, String result) {
		if(start == end) {
			System.out.println(result);
			return;
		}
		if(start>end) {
			return;
		}
		int newstart,i;
		for(i=1;i<=6;i++) {
			newstart = start + i;
			dice(newstart,end,result + i);
		}
		//dice(newstart, end,result+i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dice(0,10," ");
	}

}
