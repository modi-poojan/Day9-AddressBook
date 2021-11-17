package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact_Methods {

	static Scanner input = new Scanner(System.in);
	static ArrayList<Create_Contact> contactBook = new ArrayList<>();
	
	public void addContact() {
		System.out.print("Enter First Name:- ");
  		String first = input.next();
  		
  		System.out.print("Enter Last Name:- ");
  		String last = input.next();
  		
  		System.out.print("Enter Address:- ");
  		String add = input.next();
  		
  		System.out.print("Enter City:- ");
  		String city = input.next();
  		
  		System.out.print("Enter State:- ");
  		String state = input.next();
  		
  		System.out.print("Enter Zip Code:- ");
  		int zip = input.nextInt();
  		
  		System.out.print("Enter Phone Number:- ");
  		int phone = input.nextInt();
  		
  		System.out.print("Enter E-mail:- ");
  		String email = input.next();
	
  		Create_Contact contact = new Create_Contact(first , last , add , city , state , zip , phone , email);
  		contactBook.add(contact);
  		
  		System.out.println("\nContact added Successfully.");
	}
	
	public void displayContacts() {
		System.out.println("\nContacts Present in Address Book:");
		for(Create_Contact  person : contactBook) {
			System.out.println(person.toString());
		}
	}
}
