package jaspreet;

public class eqilibriumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eqb[] = {1,3,0,3};
		int eqbIndex = 0;
		for (int i=0;i<eqb.length;i++) {
			int leftSum =0;
			int rightSum = 0;
			for(int j=i-1;j>=0;j--) {
				leftSum+=eqb[j];
			}
			for(int k=i+1;k<eqb.length;k++) {
				rightSum+=eqb[k];
			}
			if(leftSum == rightSum) {
				eqbIndex=i;
				System.out.println("Eqilibrium index is "+eqbIndex);
				System.out.println("Eqilibrium number is "+eqb[eqbIndex]);
				break;
			}
			leftSum = 0;
			rightSum = 0;
		}
		if(eqbIndex == 0) {
			System.out.println("No eqilibrium index");
		}
	}

}
