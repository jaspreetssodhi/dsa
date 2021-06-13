package jaspreet;

import java.util.Arrays;

public class arrayStart {
	static void swap(int [] arr) {
		int i=0, j=arr.length-1;
		int temp=0;
		while(i<j){
			temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}
	static void rotate(int []arr,int n) {
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<arr.length-1;j++) {
				temp = arr[j-1];
				arr[j-1]=arr[j];
				arr[arr.length-1]=temp;
			}
		}
		
	}
	static void zigzag(int []arr) {
		boolean flag = true;
		int temp =0;
		for(int i=0;i<arr.length-1;i++) {
			if(flag) {
				if(arr[i]>arr[i+1]) {
					temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			else {
				if(arr[i]<arr[i+1]) {
					temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			flag = !flag;
		}
	}
	static void leader(int []arr) {
		
		int max = 0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>max) {
				max=arr[i];
				System.out.print(max + " ");
			}
				
			}
	}
	
	static void missing(int []arr) {
		
		
	}

	static void swap01() {
		int []arr = {0,1,0,0,0,1,0,1,1,1};
		int arr1[] = new int[10];
		int count =0;
		Arrays.sort(arr);
		/*for(int i=0; i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
				}
		}
			for(int i=0;i<count;i++) {
				arr1[i]=0;
			}
			for(int j=count -1; j<arr1.length-1;j++) {
				arr1[j]=1;
			}*/
			for(int m=0;m<arr.length;m++)
				{System.out.print(arr[m]);
				}
			
		}
	static void greaterAfter() {
		int []arr = {8,1,2,2,3};
		
		int arr1[] = new int[5];
		for(int i=0;i<arr.length;i++) {
			int count =0;
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					count+=1;
			}
				
		}
			arr[i]=count;
		}
		for(int m=0;m<arr.length;m++)
		{System.out.print(arr[m]);
		}
		
	}
	static void largest3() {
		int arr[] = {5,10,65,23,45};
		Arrays.sort(arr);
		int max1 = arr[arr.length-1];
		int max2 = arr[arr.length-2];
		int max3 = arr[arr.length-3];
		System.out.println("First largest = "+max1);
		System.out.println("Second largest = "+max2);
		System.out.println("Third largest = "+max3);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []arr = {4,3,2,8,6,7,1};
		
		int []arr1 = {300,40,60,90,100,12,15,19,4,3,5,2};
		//swap(arr);
		//rotate(arr,1);
		//zigzag(arr);
		//leader(arr1);
		//swap01();
		//largest3();
		greaterAfter();
	}

}
