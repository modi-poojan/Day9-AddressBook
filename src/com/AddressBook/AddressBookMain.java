package com.AddressBook;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		Contact_Methods obj = new Contact_Methods();
		Scanner scan = new Scanner(System.in);
		System.out.println("Address Book Program");
		while(true) {
		System.out.println("\nSelect an operation to perform\n 1. Add AddressBook\n 2. Add Contact\n 3. Display Contacts\n 4. Edit Existing Contact\n 5. Delete Existing Contact\n 6. Display All Addressook\n 7. Edit AddressBook\n 8. Exit\n");
		int choice = scan.nextInt();
		switch (choice) {
		
		case 1 :
				obj.newAddressBook();
				obj.displayAddressBook();
				break;
		case 2 : 
				obj.addMultiplePersons();
				break;
		case 3 : 
				obj.displayContacts();
				break;
		case 4 : 
				obj.editContact();
				break;
		case 5 : 
				obj.deleteContact();
				break;
		case 6 :
				obj.displayAddressBook();
				break;		
		case 7 :
				obj.editAddressBook();
				break;
		case 8 :
			System.out.println("Exited the program");
			return;
				
		default:System.out.println("Enter Valid Choice");
		}
		
		}
	 }
		
}