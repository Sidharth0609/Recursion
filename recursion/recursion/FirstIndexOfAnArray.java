package recursion;

import java.util.Scanner;

public class FirstIndexOfAnArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int data=scn.nextInt();
		int fi = FirstIndex(arr,0,data);
		System.out.println(fi);
		scn.close();
	}
	public static int FirstIndex(int[] arr,int idx,int x) {
		if(idx==arr.length) {
			return -1;
		}
		if(arr[idx]==x) {
			return idx;
		} else {
			int fiisa=FirstIndex(arr,idx+1,x);
			return fiisa;
		}
		
	}
	
}
