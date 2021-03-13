package recursion;

import java.util.Scanner;

public class PrintPermutations {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		permutations(str , "");
		scn.close();

	}
	public static void permutations(String ques,String asf) {
		if(ques.length()==0) {
			System.out.println(asf);
			return;
		}
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			String qlpart=ques.substring(0,i);
			String qrpart=ques.substring(i+1);
			String roq=qlpart+qrpart;
			permutations(roq,asf +ch);
		}
	}
}
