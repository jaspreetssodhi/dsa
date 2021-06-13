package jaspreet;

public class trappingRainWater {
	static void rainWater(int []arr) {
		int leftMax=0;
		int[] leftPillar=new int[arr.length];
		int rightPillar[] = new int[arr.length];
		int rightMax=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>leftMax) {
				leftMax=arr[i];
			}
			leftPillar[i] = leftMax;
		}
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>rightMax) {
				rightMax=arr[i];
			}
			rightPillar[i] = rightMax;
		}
		System.out.println();
		for(int i:leftPillar) {
			System.out.print(i);
		}
		System.out.println();
		for(int i:rightPillar) {
			System.out.print(i);
		}
		System.out.println();
		int totalWater=0;
		for(int i=0;i<arr.length;i++) {
			totalWater += Math.min(leftPillar[i], rightPillar[i])-arr[i];
		}
		System.out.println(totalWater);
		
	}
	
	//ques conatianer with most water
	
	static void mostWater(int [] arr) {
		int leftMax=0;
		int[] leftPillar=new int[arr.length];
		int[] rightPillar=new int [arr.length];
		int rightMax=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>leftMax) {
				leftMax=arr[i];
			}
			leftPillar[i] = leftMax;
		}
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>rightMax) {
				rightMax=arr[i];
			}
			rightPillar[i] = rightMax;
		}
		System.out.println();
		for(int i:leftPillar) {
			System.out.print(i);
		}
		System.out.println();
		for(int i:rightPillar) {
			System.out.print(i);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {0,1,0,2,1,0,1,3,2,1,2,1};
		int a1[] = {3,0,1,2,4,3};
		rainWater(a);
	}

}
