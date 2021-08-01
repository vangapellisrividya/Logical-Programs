package com.bl.day6problem3;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Number");
		int N;
		N = sc.nextInt();
		
		 boolean flag = false;
		    
			int i = 2;
			while (i <= N/ 2) {
		   
		      if (N % i == 0) {
		        flag = true;
		        break;
		      }

		      ++i;
		    }
			sc.close();
		    if (!flag)
		      System.out.println(N + " is a prime number.");
		    else
		      System.out.println(N+ " is not a prime number.");
		  }
	
		}
	




		   
