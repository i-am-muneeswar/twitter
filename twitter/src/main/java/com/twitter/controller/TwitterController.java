package com.twitter.controller;

import java.util.Scanner;

import com.twitter.entity.TwitterUser;
import com.twitter.service.TwitterService;

public class TwitterController {

	public void createProfile() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.next();
		
		System.out.println("Enter Password: ");
		String password = sc.next();
		
		System.out.println("Enter email: ");
		String email = sc.next();
		
		System.out.println("Enter address: ");
		String address = sc.next();
		
		TwitterUser tu = new TwitterUser();
		tu.setName(name);
		tu.setPassword(password);
		tu.setEmail(email);
		tu.setAddress(address);
		
		TwitterService ts = new TwitterService();
		int i = ts.createProfileService(tu);
		
		if(i>0) {
			System.out.println("Your profile is created "+name);
		}
		
		else {
			System.out.println("We have failed you");
		}
		
		
		
		
	}
	
	

}
