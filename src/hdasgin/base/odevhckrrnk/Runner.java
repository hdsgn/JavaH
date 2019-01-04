package hdasgin.base.odevhckrrnk;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();

		if (n%2==1) {
			System.out.println("weird");
		}else if (n%2==0 && n>=2 && n<=5) {
			System.out.println("Not weird");
		}else if (n%2==0 && n>=6 && n<=20) {
			System.out.println("weird");
		}else {
			
		}
			//System.out.println("weird");
	}

}
