package com.entity;

import java.util.ArrayList;

public class AddressBook {
	
	 public String addressbook_name;
	 public ArrayList<ContactBook> contactBook;

	 public AddressBook(String addressbook_name) {
			this.addressbook_name = addressbook_name;
			this.contactBook = new ArrayList<ContactBook>();
		}

	public String getAddressbook_name() {
		return addressbook_name;
	}

	public void setAddressbook_name(String addressbook_name) {
		this.addressbook_name = addressbook_name;
	}

	public ArrayList<ContactBook> getContactBook() {
		return contactBook;
	}

	public void setContactBook(ArrayList<ContactBook> contactBook) {
		this.contactBook = contactBook;
	}

	@Override
	public String toString() {
		return "AddressBookList [addressbook_name=" + addressbook_name + ", contactBook=" + contactBook + "]";
	}
	
	
	
}
