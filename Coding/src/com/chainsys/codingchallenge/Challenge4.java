package com.chainsys.codingchallenge;

import java.util.Scanner;

/*Input
 42
3.1415
Welcome to HackerRank's Java tutorials!
Output
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
*/
public class Challenge4 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int i = scan.nextInt();
	        double d = scan.nextDouble();
	        scan.nextLine();
	        String s = scan.nextLine();
	       
	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	}
}
