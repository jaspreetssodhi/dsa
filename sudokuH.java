package jaspreet;
public class sudokuH {

	static int checker(int a[][],int r,int c,int value)
	{	int flag=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[r][x]==value)
			{
				//value++;
				flag = 1;
				return flag;
						//checker(a,r,c,value);
			}
		}
		for(int y=0;y<a[r].length;y++)
		{
			if(a[y][c]==value)
			{
				//value++;
				flag = 1;
				return flag;
				//checker(a,r,c,value);
			}
		}
		
		if(r<3)
			r=0;
		else if(r<6)
			r=3;
		else
			r=6;
		if(c<3)
			c=0;
		else if(c<6)
			c=3;
		else
			c=6;
		for(int m=r;m<=r+2;m++)
			for(int n=c;n<=c+2;n++)
				{
					if(a[m][n]==value)
					{
						//value++;
						flag = 1;
						return flag;
						//checker(a,r,c,value);
					}
				}
		
		return 1;
	}
	
	static int[][] solver(int grid[][]) {
		
		for(int m=0;m<grid.length;m++)
			for(int n=0;n<grid[m].length;n++)
			{
				if(grid[m][n]==0)
					grid[m][n]=checker(grid,m,n,1);
			}
		return grid;
	}
	
	
	public static void main(String args[]) {
		int grid[][]= {{4,3,5,0,0,9,0,8,0},
						{0,0,2,5,0,1,4,0,3},
						{0,0,7,8,3,0,0,6,2},
						{0,0,6,0,9,5,3,0,7},
						{3,7,0,0,8,0,0,1,5},
						{9,0,1,7,4,0,6,0,0},
						{5,1,0,0,2,6,8,0,0},
						{2,0,8,9,0,7,1,0,0},
						{0,6,0,4,0,0,2,5,9}};
		int grid1[][] =solver(grid);
		for(int i=0;i<grid.length;i++)
		{
			for(int j=0;j<grid1[i].length;j++)
				System.out.print(grid1[i][j] + ",");
			System.out.println();
		}
	}

}
