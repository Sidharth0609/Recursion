package recursion;

import java.util.Scanner;

public class PrintMazeWithJumps {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n =scn.nextInt();
		int m=scn.nextInt();
		printMazePaths(1,1,n,m,"");
		scn.close();
	}
	static void printMazePaths(int sr,int sc,int dr,int dc,String psf) {
		if(sr==dr && sc==dc) {
			System.out.println(psf);
		}
		
		for(int ms=1;ms<=dc-sc;ms++) {
			printMazePaths(sr,sc+ms,dr,dc,psf+"h"+ms);
		}
		for(int ms=1;ms<=dr-sr;ms++) {
			printMazePaths(sr+ms,sc,dr,dc,psf+"v"+ms);
		}
		for(int ms=1;ms<=dc-sc && ms<=dr-sr;ms++) {
			printMazePaths(sr+ms,sc+ms,dr,dc,psf+"d"+ms);
		}
	}
}
