package com.AddressBook;

public class Create_Contact {
	
	
			String First_Name;
			String Last_Name;
			String Address;
			String City;
			String State;
			int Zip_code;
			int Phone_number;
			String Email;
			
			public Create_Contact(String first_Name, String last_Name, String address, String city, String state,
					int zip_code, int phone_number, String email) {
				super();
				this.First_Name = first_Name;
				this.Last_Name = last_Name;
				this.Address = address;
				this.City = city;
				this.State = state;
				this.Zip_code = zip_code;
				this.Phone_number = phone_number;
				this.Email = email;
			}
				
			public String getFirst_Name() {
				return First_Name;
			}

			public void setFirst_Name(String first_Name) {
				First_Name = first_Name;
			}

			public String getLast_Name() {
				return Last_Name;
			}

			public void setLast_Name(String last_Name) {
				Last_Name = last_Name;
			}

			public String getAddress() {
				return Address;
			}
 
			public void setAddress(String address) {
				Address = address;
			}

			public String getCity() {
				return City;
			}

			public void setCity(String city) {
				City = city;
			}

			public String getState() {
				return State;
			}

			public void setState(String state) {
				State = state;
			}

			public int getZip_code() {
				return Zip_code;
			}
			
			public void setZip_code(int zip_code) {
				Zip_code = zip_code;
			}

			public int getPhone_number() {
				return Phone_number;
			}

			public void setPhone_number(int phone_number) {
				Phone_number = phone_number;
			}

			public String getEmail() {
				return Email;
			}

			public void setEmail(String email) {
				Email = email;
			}

			public String toString() {
				return ("First name : "+First_Name+"\nLast_name : "+Last_Name+"\nAddress : "+Address+"\nCity : "+City+"\nState : "+State+"\nZip_Code : "+Zip_code+"\nPhone_Number : "+Phone_number+"\nEmail :"+Email+"\n\n\n\n\n");
				
			}
			
			
		}