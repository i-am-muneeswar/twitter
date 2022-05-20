package com.twitter;

import java.util.Scanner;

import com.twitter.controller.TwitterController;

public class TwitterView {

	public static void main(String[] args) {
		
		String s = "y";
		while(s.equals("y")) {
		
		System.out.println("******** Main Menu **********");
		System.out.println("Press 1 to create profile");
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		TwitterController tc = new TwitterController();		
		
		switch(ch) {
			case 1:
				tc.createProfile();
				break;
			default:
				System.out.println("Wrong Choice");
			}
		
			System.out.println("Press y to continue");
			s = sc.next();
		
		}		

	}

}
