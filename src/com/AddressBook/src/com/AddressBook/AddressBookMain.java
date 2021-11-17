package com.AddressBook;

public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println("--------------------Welcome To Address Book Program-----------------------");
		Contact_Methods obj = new Contact_Methods();
		obj.addContact();
		obj.displayContacts();
		
	}
}