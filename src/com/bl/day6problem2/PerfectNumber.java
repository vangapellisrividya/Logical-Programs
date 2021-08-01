package com.bl.day6problem2;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Number");
		int N, sum = 0;
		N = sc.nextInt();
		int i = 1;
		for(; i<N;) {
		if(N % i == 0)
		{
		 sum = sum + i;
		 }i++;
		}
		if( N == sum) {
		System.out.println(" perfect number");}
		else {
			System.out.println("not a perfect number");
		}
	
		 
	}
}



