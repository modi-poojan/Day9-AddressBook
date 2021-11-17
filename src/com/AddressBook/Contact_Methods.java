package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact_Methods {

	static Scanner input = new Scanner(System.in);
	static ArrayList<Create_Contact> contactBook = new ArrayList<>();
	
	public void AddContact() {
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
	
	public void DisplayContacts() {
		System.out.println("\nContacts Present in Address Book:");
		for(Create_Contact  person : contactBook) {
			System.out.println(person.toString());
		}
	}
	
	public void EditContact() {
		System.out.println("\nEnter first name to edit :- ");
		String name = input.next();
		
		for(Create_Contact person : contactBook) {
			if(name.equals(person.First_Name)) {
				System.out.print("\nSelect option to edit----\n1.First_name \n2.Last_name \n3.Address \n4.City \n5.State \n6.Zip_code \n7.Phone_number \n8.Email :- ");
				int choice = input.nextInt();
				switch(choice) {
				case 1: 
					System.out.print("Enter new first name :- ");
					String newFirstName = input.next();
					person.setFirst_Name(newFirstName);
					System.out.println("First name is updated.");
					break;
					
				case 2:
					System.out.print("Enter new last name :- ");
					String newLastName = input.next();
					person.setLast_Name(newLastName);
					System.out.println("Last name is updated.");
					break;
					
				case 3:
					System.out.print("Enter new Address :- ");
					String newAddress = input.next();
					person.setAddress(newAddress);
					System.out.println("Address is updated.");
					break;
					
				case 4:
					System.out.print("Enter new city name :- ");
					String newCity = input.next();
					person.setCity(newCity);
					System.out.println("City is updated.");
					break;
					
				case 5:
					System.out.print("Enter new state name :- ");
					String newState = input.next();
					person.setState(newState);
					System.out.println("State is updated.");
					break;
					
				case 6:
					System.out.print("Enter new Zip code :- ");
					int newZip = input.nextInt();
					person.setZip_code(newZip);
					System.out.println("Zip code is updated.");
					break;
					
				case 7:
					System.out.print("Enter new phonr number :- ");
					int newPhone = input.nextInt();
					person.setPhone_number(newPhone);
					System.out.println("Phone number is updated.");
					break;
					
				case 8:
					System.out.print("Enter new email :- ");
					String newEmail = input.next();
					person.setEmail(newEmail);
					System.out.println("Email is updated.");
					break;
					
				default:
					System.out.println("Please enter a number between 1 to 8 only...");
					
				}
			}
			else {
				continue;
			}
		}
	}
	
	public void DeleteContact() {
		System.out.print("Enter first name to delete contact:- ");
		String name_to_delete = input.next();
		
		for(int i = 0; i < contactBook.size(); i++) {
			String search_name_in_arrayList = contactBook.get(i).getFirst_Name();
			
			if(name_to_delete.equals(search_name_in_arrayList)) {
				contactBook.remove(i);
				System.out.println("\nEntered contact deleted successfully.");
				break;
			}
			else {
				continue;
			}
		}
	}
	
	public void AddMultiplePersons() {
		System.out.println("Enter how many contacts you want to add :- ");
		int user_input = input.nextInt();
		for(int i = 1; i <= user_input; i++) {
			AddContact();
		}
	}
}
