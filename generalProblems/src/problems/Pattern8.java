package problems;

import java.util.*;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n= scn.nextInt();
		int sp=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("\t");
			}
			System.out.println("*\t");
			sp--;
			System.out.println();
		}
		scn.close();
	}

}
