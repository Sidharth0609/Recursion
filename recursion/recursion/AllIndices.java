package recursion;

import java.util.Scanner;

public class AllIndices {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int data=scn.nextInt();
		int[] allIndices = allIndices(arr,data,0,0);
		for(int val:allIndices) {
		System.out.println(val);
		}
		scn.close();
	}
	public static int[] allIndices(int[] arr,int x,int idx,int fsf) {
		if(idx==arr.length) {
			return new int[fsf];
		}
		if(arr[idx]==x) {
			int[] iarr=allIndices(arr,x,idx+1,fsf+1);
			iarr[fsf]=idx;
			return iarr;
		} else {
			int[] iarr=allIndices(arr,x,idx+1,fsf);
			return iarr;
		}
	}
}
