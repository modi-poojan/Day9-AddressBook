package com.AddressBook;

import java.io.IOException;
import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		Contact_Methods obj = new Contact_Methods();
		Scanner scan = new Scanner(System.in);
		System.out.println("Address Book Program\n");
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
			System.out.println("Enter in which file you want to add data\n1. TXT File\n2. CSV File\n");
			int writeInput = scan.nextInt();
			if(writeInput == 1) {
				try {
					obj.writeContactInFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			}
			else if (writeInput == 2) {
				try {
					obj.writeContactInCSVFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			}
			else
				System.out.println("Enter Valid option\n");
			break;
		case 11:
			System.out.println("Enter from which file you want to read data\n1. TXT File\n2. CSV File\n");
			int readInput = scan.nextInt();
			if(readInput == 1) {
				try {
					obj.readFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			}
			else if (readInput == 2) {
				try {
					obj.readCSVFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			}
			else
				System.out.println("Enter Valid option\n");
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