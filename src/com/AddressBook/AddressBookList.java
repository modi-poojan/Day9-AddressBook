package com.AddressBook;

import java.util.ArrayList;

public class AddressBookList {
	
	 String addressbook_name;
	 ArrayList<Create_Contact> contactBook;

	 public AddressBookList(String addressbook_name) {
			this.addressbook_name = addressbook_name;
			this.contactBook = new ArrayList<Create_Contact>();
		}

	public String getAddressbook_name() {
		return addressbook_name;
	}

	public void setAddressbook_name(String addressbook_name) {
		this.addressbook_name = addressbook_name;
	}

	public ArrayList<Create_Contact> getContactBook() {
		return contactBook;
	}

	public void setContactBook(ArrayList<Create_Contact> contactBook) {
		this.contactBook = contactBook;
	}

	@Override
	public String toString() {
		return "AddressBookList [addressbook_name=" + addressbook_name + ", contactBook=" + contactBook + "]";
	}
	
	
	
}
