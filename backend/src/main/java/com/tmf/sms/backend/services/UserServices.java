package com.tmf.sms.backend.services;

import java.util.List;
import java.util.Scanner;

import com.tmf.sms.backend.dao.UserDAO;
import com.tmf.sms.backend.models.User;

public class UserServices {
	UserDAO dao = new UserDAO();
	Scanner scan = new Scanner(System.in);
	
	public String registerUser() {
		System.out.println("Enter the User Id ");
		int id = scan.nextInt();
		System.out.println("Enter the User Name ");
		String name = scan.next();
		System.out.println("Enter User's Age ");
		int age = scan.nextInt();
		System.out.println("Enter User's Phone number");
		long phone = scan.nextLong();
		
		User u = new User();
		u.setAge(age);
		u.setPhoneNumber(phone);
		u.setUserId(id);
		u.setUserName(name);
		
		return dao.insertUser(u);
	}
	
	public void displayUseers() {
		List<User> users = dao.availabeUsers();
		for(User u : users) {
			dao.getUserDetails(u);
		}
	}
	
	public void menu() {
		while(true) {
			System.out.println("================Users info================");
			System.out.println("Press 1 for new User entry");
			System.out.println("Press 2 for Display all users");
			System.out.println("Press 9 for exit");
			System.out.println("Choose your choice");
			int choice = scan.nextInt();
			switch(choice) {
				case 1 : registerUser();break;
				case 2 : displayUseers();break;
				case 9 : System.exit(0);
				default : System.out.println("Sorry Wrong choice");
			}
		}
	}
}
