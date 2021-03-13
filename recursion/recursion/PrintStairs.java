package recursion;

import java.util.*;

public class PrintStairs {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		printStairsPaths(n, "");
		scn.close();
	}
	public static void printStairsPaths(int n,String path) {
		if(n<0) {
			return;
		}
		if(n==0) {
			System.out.println(path);
			return;
		}
		printStairsPaths(n-1,path+"1");
		printStairsPaths(n-2,path+"2");
		printStairsPaths(n-3,path+"3");
	}
}
