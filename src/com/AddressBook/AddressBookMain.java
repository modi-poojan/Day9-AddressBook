package com.AddressBook;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		Contact_Methods obj = new Contact_Methods();
		Scanner scan = new Scanner(System.in);
		System.out.println("--------------------Welcome To Address Book Program-----------------------");
		while(true) {
		System.out.println("Select an operation to perform\n 1. Add Contact\n 2. Display Object\n 3. Edit Existing Contact\n 4.Delete Existing Contact\n 5.Exit");
		int choice = scan.nextInt();
		switch (choice) {
		case 1 : 
				obj.AddMultiplePersons();
				break;
		case 2 : 
				obj.DisplayContacts();
				break;
		case 3 : 
				obj.EditContact();
				break;
		case 4 : 
				obj.DeleteContact();
				break;
		case 5 :
				return;
		default:System.out.println("Enter Valid Choice");
		}
		scan.close();
		}
	 }
		
}