package com.chainsys.codingchallenge;

import java.util.Scanner;
 
public class Challenge6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int result;
			System.out.println("Enter your number");
	        int n = sc.nextInt();

	        for(int i=1; i<=10;i++){
	            result = n*i;
	            System.out.println(n + " x " + i+" = "+result);
	        }
	     
	}
}
