package com.AddressBook;

public class AddressBookList {
	
	 String addressbook_name;

	 public AddressBookList(String addressbook_name) {
			super();
			this.addressbook_name = addressbook_name;
		}

	public String getAddressbook_name() {
		return addressbook_name;
	}

	public void setAddressbook_name(String addressbook_name) {
		this.addressbook_name = addressbook_name;
	}

	@Override
	public String toString() {
		return "AddressBookList [addressbook_name=" + addressbook_name + "]";
	}
	
	
	
}
