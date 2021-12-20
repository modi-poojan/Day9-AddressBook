package com.AddressBook;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		Contact_Methods obj = new Contact_Methods();
		Scanner scan = new Scanner(System.in);
		System.out.println("Address Book Program");
		while(true) {
			
		System.out.println("\nSelect an operation to perform\n "
				
				+ "1. Add AddressBook\n "
				+ "2. Add Contact\n "
				+ "3. Display Contacts\n "
				+ "4. Edit Existing Contact\n "
				+ "5. Search Contacts through City or State \n "
				+ "6. Find count of contacts through City or State \n "
				+ "7. Delete Existing Contact\n "
				+ "8. Display All Addressook\n "
				+ "9. Edit AddressBook\n "
				+ "10. To print data to file\n "
				+ "11. To read data of file\n "
				+ "12. Exit\n");
				
		
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
				//obj.displayContacts();
				obj.sortContact();
				break;
		case 4 : 
				obj.editContact();
				break;
		case 5 : 
				obj.searchContact();
				break;
		case 6 : 
				obj.contactCount();
				break;
		case 7 : 
				obj.deleteContact();
				break;
		case 8 :
				obj.displayAddressBook();
				break;		
		case 9 :
				obj.editAddressBook();
				break;
		case 10:
			try {
				obj.writeContactInFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				break;
		case 11:
			try {
				obj.readFile();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				break;
		case 12:
				System.out.println("Terminated sucessfully");
				return;
		default:
				System.out.println("Enter Valid Choice");
		}
		
		}
	 }
		
}