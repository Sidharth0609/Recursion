package recursion;

import java.util.Scanner;

public class LastIndexOfAnArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int data=scn.nextInt();
		int li = LastIndex(arr,0,data);
		System.out.println(li);
		scn.close();
	}
	public static int LastIndex(int[] arr,int idx,int x) {
		if(idx==arr.length) {
			return -1;
		}
		int liisa=LastIndex(arr,idx+1,x);
		if(liisa == -1) {
			if(arr[idx]==x) {
				return idx;
			} else {
				return -1;
			}
		} else {
			return liisa;
		}
		
	}
	
}
