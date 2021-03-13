package recursion;

import java.util.Scanner;

public class MaxOfAnArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int max = MaxInArray(arr,0);
		System.out.println(max);
		scn.close();

	}
	public static int MaxInArray(int[] arr, int idx) {
		if(idx==arr.length-1) {
			return arr[idx];
		}
		int misa=MaxInArray(arr,idx+1);
		if(misa>arr[idx]) {
			return misa;
		} else {
			return arr[idx];
		}
	}
}
