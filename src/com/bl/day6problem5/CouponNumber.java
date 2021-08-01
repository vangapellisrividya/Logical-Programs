package com.bl.day6problem5;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class CouponNumber {
public static void main(String[] args) {
	List<Integer> coupon = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	System.out.println(" enter the size");
	int size = sc.nextInt();
	
	for (int i = 0; i < size; i++) {
		int randValue = (int) (Math.random() *100)%100;
		boolean available = coupon.contains(randValue);
		if(!available) {
			coupon.add(randValue);
		}
	}
	for (int i : coupon) {
		System.out.println(i);
	}
	
}
}
