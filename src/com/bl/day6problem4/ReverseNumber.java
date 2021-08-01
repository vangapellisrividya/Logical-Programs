package com.bl.day6problem4;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Number");
		int N, r = 0, remainder = 0;
		N = sc.nextInt();
		while(N != 0) {
		  remainder = N % 10;
		   r = r*10+remainder;
		N = N/10;}
		System.out.println(" "+r);}

}