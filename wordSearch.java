package jaspreet;

public class wordSearch {
	static void search(String str, char [][] grid,int row, int col) {
		if(str.length() == 0) {
			System.out.print("found");
			//return true;
		}
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j]==str.charAt(0)) {
					search(str.substring(1),grid,i+1,j+1);
				}
				return;
			}
		}
		//return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] grid = {
							{'A','B','C','E'},
							{'S','F','C','S'},
		                    {'A','D','E','E'},
		                    {'A','C','D','H'}
						};
		String str = "AFEH";
		search(str,grid,0,0);
		//System.out.print(search);
	}

}
