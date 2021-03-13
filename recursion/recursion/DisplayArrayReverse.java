package recursion;

import java.util.Scanner;

public class DisplayArrayReverse {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		displayArr(arr,0);
		scn.close();

	}
	public static void displayArr(int[] arr,int idx) {
		if(idx==arr.length) {
			return;
		}
		displayArr(arr,idx+1);
		System.out.println(arr[idx]);
	}
}
