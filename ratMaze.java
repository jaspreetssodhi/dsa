package jaspreet;
import java.util.ArrayList;

public class ratMaze {
	static ArrayList<String> rat(int x,int y){
		if(x==2 && y==2) {
			ArrayList<String> blankStringList = new ArrayList<>();
			blankStringList.add("\n");
			return blankStringList;
		}
		if(x>2 || y>2) {
			ArrayList<String> blankList = new ArrayList<>();
			return blankList;
		}
		ArrayList<String> result = new ArrayList<>();
		/*for(int i=0;i<2;i++) {
				if(i==0 && x<2) {
					int x1 = x+1;
				ArrayList<String> temp = rat(x1,y);
				for(String tempstr:temp)
					result.add(tempstr+'H');
				}
				if(i==0 &&i<2)
				{
				int y1=y+1;
				ArrayList<String> temp1 = rat(x,y1);
				for(String tempstr1:temp1)
					result.add(tempstr1+'V');
				
				}
		}*/
		int x1 = x+1;
		ArrayList<String> temp = rat(x1,y);
		for(String tempstr:temp)
			result.add(tempstr+'H');
		int y1=y+1;
		ArrayList<String> temp1 = rat(x,y1);
		for(String tempstr1:temp1)
			result.add(tempstr1+'V');
		
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(rat(0,0));

	}

}
