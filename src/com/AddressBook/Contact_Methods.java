package com.AddressBook;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
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
		int flag = -1;
		System.out.println("\nEnter first name to edit :- ");
		String name = input.next();
		for (AddressBookList addressBookList : addresslist) {
			for (Create_Contact person : addressBookList.contactBook) {
				
				if (name.equals(person.First_Name)) {
					System.out.print(
							"\n Option to edit\n1.First_name \n2.Last_name \n3.Address \n4.City \n5.State \n6.Zip_code \n7.Phone_number \n8.Email :- ");
					int choice = input.nextInt();
					switch (choice) {
					case 1:
						flag = 0;
						System.out.print("Enter new first name :- ");
						String newFirstName = input.next();
						person.setFirst_Name(newFirstName);
						System.out.println("First name is updated.");
						break;

					case 2:
						flag = 0;
						System.out.print("Enter new last name :- ");
						String newLastName = input.next();
						person.setLast_Name(newLastName);
						System.out.println("Last name is updated.");
						break;

					case 3:
						flag = 0;
						System.out.print("Enter new Address :- ");
						String newAddress = input.next();
						person.setAddress(newAddress);
						System.out.println("Address is updated.");
						break;

					case 4:
						flag = 0;
						System.out.print("Enter new city name :- ");
						String newCity = input.next();
						person.setCity(newCity);
						System.out.println("City is updated.");
						break;

					case 5:
						flag = 0;
						System.out.print("Enter new state name :- ");
						String newState = input.next();
						person.setState(newState);
						System.out.println("State is updated.");
						break;

					case 6:
						flag = 0;
						System.out.print("Enter new Zip code :- ");
						int newZip = input.nextInt();
						person.setZip_code(newZip);
						System.out.println("Zip code is updated.");
						break;

					case 7:
						flag = 0;
						System.out.print("Enter new phone number :- ");
						int newPhone = input.nextInt();
						person.setPhone_number(newPhone);
						System.out.println("Phone number is updated.");
						break;

					case 8:
						flag = 0;
						System.out.print("Enter new email :- ");
						String newEmail = input.next();
						person.setEmail(newEmail);
						System.out.println("Email is updated.");
						break;

					default:
						System.out.println("Enter Valid Choice");

					}
				} else {
					continue;
					}
				}
			}
			if(flag == -1) {
				System.out.println("No contact with first name '"+name+"' exist\n");
				return;
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

	public void searchContact() {
		
		System.out.println("\nFor contact search through 'CITY' press 1\nFor contact search through 'STATE' press 2\n ");
		int choice = input.nextInt();
		int flag = -1;
		switch (choice) {
		
		case 1:
			if(addresslist.isEmpty()) {
				System.out.println("Addressbook is empty\nAdd Addressook\n");
				return;
			}
			System.out.println("Enter the city to be searched\n ");
			String city = input.next();
			Dictionary<String, String> cityDict =  new Hashtable<>();
			for (AddressBookList addressBookList : addresslist) {
				for (Create_Contact contacts : addressBookList.contactBook) {
					if (city.equals(contacts.City)) {
						flag = 0;
						cityDict.put(contacts.getFirst_Name(), contacts.getCity());
						//System.out.println("First name: "+contacts.getFirst_Name()+"Last name: "+contacts.getLast_Name()+"City: "+contacts.getCity()+"\n" );
					}
					else {
						continue;
					}
				}
			}
			if(flag == -1) {
				System.out.println("No contact with this city present\n");
			}else {
				System.out.println("Contact with city as "+city+" are\n");
				for(Enumeration<String> i = cityDict.keys();i.hasMoreElements();) {
					System.out.println(i.nextElement());
				}
				
			}
			break;

		case 2:
			if(addresslist.isEmpty()) {
				System.out.println("Addressbook is empty\nAdd Addressook\n");
				return;
			}
			Dictionary<String, String> stateDict = new Hashtable<>();
			System.out.println("Enter the state to be searched\n ");
			String state = input.next();
			for (AddressBookList list : addresslist) {
				for (Create_Contact contact : list.contactBook) {
					if (state.equals(contact.State)) {
						flag = 0;
						stateDict.put(contact.getFirst_Name(), contact. getState());
						//System.out.println("First name: "+contact.getFirst_Name()+"Last name: "+contact.getLast_Name()+"State: "+contact.getState());
					}
					else {
						continue;
					}
				}
			}
			if(flag == -1)
				System.out.println("No contact with this state present\n");
			else {
				System.out.println("Contact with state as "+state+" are\n");
				for(Enumeration<String> i = stateDict.keys();i.hasMoreElements();) {
					System.out.println(i.nextElement());
				}
			}
			break;
		}
	}

	public void contactCount() {
		if(addresslist.isEmpty()) {
			System.out.println("AddressBook is empty \nAdd Book ");
			return;
		}
		System.out.println("To count number of person with same 'CITY' press 1\nTo count number of person with same 'STATE' press 2");
		int choice = input.nextInt();
		int count = 0;
		switch(choice) {
		case 1:
			System.out.println("Enter city name\n");
			String cityName = input.next();
			for (AddressBookList addressBookList : addresslist) {
				for (Create_Contact person : addressBookList.contactBook) {
					if(cityName.equals(person.City)) 
						count++;	
				}
			}
			System.out.println("The count of contacts with city "+cityName+" is "+count);
			break;
			
		case 2 :
			System.out.println("Enter state name\n");
			String stateName = input.next();
			for (AddressBookList addressBookList : addresslist) {
				for(Create_Contact person: addressBookList.contactBook) {
					if(stateName.equals(person.State))
						count++;
				}
			}
			System.out.println("The count of contacts with state "+stateName+" is "+count);
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
			System.out.println("Address Book is empty\nAdd AddressBook\n");
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
	
	public void sortContact() {
		System.out.println("Enter addressook name to display its contact \n");
		String bookname = input.next();
		int flag = -1;
			for (AddressBookList addressBookList : addresslist) {
				if(bookname.equals(addressBookList.addressbook_name)) {
					flag = 0;
					addressBookList.contactBook.stream()
					.sorted((contact1, contact2) -> contact1.getFirst_Name().compareToIgnoreCase(contact2.getFirst_Name()))
					.forEach(contact -> System.out.println(contact));
				}else {
					continue;
				}}
			if(flag == -1) {
				System.out.println("Enter valid addressbook name\n");
			}
		 		
	}
}
