package jaspreet;
import java.util.HashMap;

public class KWeakest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{1,1,0,0,0},
						{1,0,0,0,0},
						{1,1,1,1,0},
						{1,1,1,0,0}};
		int count =0;
		int countArr[] = {-1,-1,-1,-1,-1};
		HashMap<Integer,Integer> hash = new HashMap<>();
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(mat[i][j]==0) {
					count++;
				}	
			}
			System.out.println(count + "th weakest row is "+(i+1));
			hash.put(i,count);
			count=0;
		}
		System.out.print(hash);
	}

}
