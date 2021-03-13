package recursion;
import java.util.*;
public class PrintMazePaths {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n =scn.nextInt();
		int m=scn.nextInt();
		printMazePaths(1,1,n,m,"");
		scn.close();

	}
	public static void printMazePaths(int sr,int sc,int dr,int dc,String psf) {
		if(sr>dc||sc>dc) {
			return;
		}
		if(sr==dr && sc==dc) {
			System.out.println(psf);
			return;
		}
		printMazePaths(sr,sc+1,dr,dc,psf+"h");
		printMazePaths(sr+1,sc,dr,dc,psf+"v");
	}
}
