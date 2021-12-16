package com.AddressBook;
import java.util.ArrayList;
import java.util.Scanner;

public class Contact_Methods {

	//static AddressBookList object = new AddressBookList(null);
	static Scanner input = new Scanner(System.in);

	// static Set<Create_Contact> contactBook = new HashSet<Create_Contact>();
	public ArrayList<AddressBookList> addresslist = new ArrayList<>();

	public void addMultiplePersons() {
		if(addresslist.isEmpty()) {
			System.out.println("AddressBook is empty\nCreate a book\n");
		}else {
			System.out.println("\nEnter how many contacts you want to add :- \n");
			int user_input = input.nextInt();
			for (int i = 1; i <= user_input; i++) {
			addContact();
			}
		}
	}

	public void addContact() {
		
		int flag = -1;
		if (addresslist.isEmpty()) {
			System.out.println("\nAddressBook is empty\n1st create an addressbook\n");
			return;
		}
		System.out.println("In which Addressbook you want to add this contact\n");
		String bookName = input.next();
		for (AddressBookList addressBookList : addresslist) {
			if (bookName.equals(addressBookList.addressbook_name)) {
				flag = 0;
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

				boolean checknames = duplicateNames(first, last);
				if (checknames == true) {
					System.out.println("\nContact with this name already exist\nStart again\n");
					return;
				} else {
					Create_Contact contact = new Create_Contact(first, last, add, city, state, zip, phone, email);
					addressBookList.contactBook.add(contact);
					System.out.println("Contact added Successfully.\n");
				}
			} else {
				continue;
				}
			}
			if(flag == -1)
				System.out.println("No addressbook with this name present\n");
	}

	public boolean duplicateNames(String first, String last) {
		for (AddressBookList addressBookList : addresslist) {
			for (Create_Contact i : addressBookList.contactBook) {
				if (first.equals(i.First_Name) && last.equals(i.Last_Name)) {
					return true;
				}
			}
		}
		return false;
	}

	
	public void displayContacts() {

		if (addresslist.isEmpty()) {
			System.out.println("There are no contacts in book\nPlease add contacts in book\n");
		} else {
			for (AddressBookList addressBookList : addresslist) {
				for (Create_Contact person : addressBookList.contactBook) {
					if(addressBookList.contactBook.isEmpty()) {
						System.out.println("No Contacts in book\n Add Contacts\n");
					}else {
						System.out.println("Contacts Present in Address Book:\n"+addressBookList.addressbook_name);
						System.out.println(person.toString());
					}
				}
			}
		}
	}

	public void editContact() {
		
		if (addresslist.isEmpty()) {
			System.out.println("Addressbook is empty\n 1st create an addressbook ");
			return;
		}
		for (AddressBookList addressBookList : addresslist) {
			for (Create_Contact person : addressBookList.contactBook) {
				System.out.println("\nEnter first name to edit :- ");
				String name = input.next();
				if (name.equals(person.First_Name)) {
					System.out.print(
							"\nSelect option to edit----\n1.First_name \n2.Last_name \n3.Address \n4.City \n5.State \n6.Zip_code \n7.Phone_number \n8.Email :- ");
					int choice = input.nextInt();
					switch (choice) {
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
						System.out.print("Enter new phone number :- ");
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
						System.out.println("Enter Valid Choice");

					}
				} else {
					System.out.println("No contact exist with this first name\nEnter valid First name");
					return;
				}
			}
		}
	}

	public void deleteContact() {
	
		if (addresslist.isEmpty()) {
			System.out.println("\nAddressbook is empty");
			return;
		} else {
			System.out.print("\nEnter first name to delete contact:- \n");
			String name_to_delete = input.next();
			for (AddressBookList addressBookList : addresslist) {
				for (Create_Contact person : addressBookList.contactBook) {
					if (name_to_delete.equals(person.First_Name)) {
						addressBookList.contactBook.remove(person);
						System.out.println("\nEntered contact deleted successfully.");
						break;
					} else {
						System.out.println("No contact with this name exist in book");
						return;
					}
				}
			}
		}
	}

	
	public void newAddressBook() {
		System.out.println("Enter Address Book Name :- ");
		String addressbook_name = input.next();
		Boolean check = duplicateList(addressbook_name);
		if (check == false) {
			AddressBookList addressBook = new AddressBookList(addressbook_name);
			addresslist.add(addressBook);
			System.out.println("New AddressBook " + addressbook_name + " created");
		} else {
			System.out.println("\nAn addressbook with this name already exist\nUse some other name");
		}
	}
	
	public boolean duplicateList(String bookname) {
		for (AddressBookList addressBookList : addresslist) {
			if (bookname.equals(addressBookList.addressbook_name)) {
				return true;
			}
		}
		return false;
	}


	public void displayAddressBook() {
		if (addresslist.isEmpty()) {
			System.out.println("\nAddressBook is empty\nCreate new AddressBook");
		} else {
			for (AddressBookList name : addresslist) {
				System.out.println(name.toString());
			}
		}
	}

	public void editAddressBook() {
		
		int flag = -1;
	
		if(addresslist.isEmpty()) {
			System.out.println("Address Book is empty\n Add AddressBook\n");
		}else {
			System.out.println("\nEnter the AddressBook name you want to edit\n ");
			String bookname = input.next();
			for (AddressBookList i : addresslist) {
				if (bookname.equals(i.addressbook_name)) {
					flag = 0;
					System.out.println("\nEnter new name for this AddressBook\n");
					String newbookname = input.next();
					i.setAddressbook_name(newbookname);
					System.out.println(bookname + " name changed to " + newbookname);
				}else {
					continue;
				}
			}
				if(flag == -1) {
					System.out.println("No AddressBook with this name exist\nTry again\n ");
				}
			}
		}
	}
