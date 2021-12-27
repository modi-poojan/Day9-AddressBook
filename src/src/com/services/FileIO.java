package com.services;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.entity.AddressBook;
import com.entity.ContactBook;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.CSVWriter;

public class FileIO {

	public ArrayList<AddressBook> addresslist = new ArrayList<>();
	
	public void writeContactInFile() throws IOException {
		  
		  File file = new File("src/ContactInfo.txt"); 
		  FileWriter writter = new FileWriter(file); 
		  String output = addresslist.toString();
		  writter.write(output); writter.close();
		  System.out.println("Data added sucessfully\n"); 
		  System.out.println("Path = "+file.getAbsolutePath()); 
	  }
	  
	public void readFile() throws FileNotFoundException {
	  
		  Scanner scan = new Scanner(new File("src/ContactInfo.txt"));
		  while(scan.hasNext()) { 
			  System.out.println(scan.nextLine()); 
		  }
	  
	  }
	 
	public void writeContactInCSVFile() throws IOException {
	 
		List<String[]> temp = new ArrayList<>(); 
		File file = new File("src/ContactInfoCSV.csv"); 
		CSVWriter csvwritter = new CSVWriter(new FileWriter(file)); 
		temp.add(new String[] { "AddressBook Name", "First_Name","Last_Name" ,"Address","City","State","Zip-Code","PhoneNumber","Email" }); 
		for (AddressBook addressbooklist :addresslist) { 
		 for (ContactBook person : addressbooklist.contactBook) {
			 temp.add(new String[] { addressbooklist.getAddressbook_name(),
					 person.getFirst_Name(), person.getLast_Name(), person.getAddress(),
					 person.getCity(), person.getState(), Integer.toString(person.getZip_code()),
					 Integer.toString(person.getPhone_number()) , person.getEmail() }); 
			 	}
		 	} 
		csvwritter.writeAll(temp); csvwritter.close();
		System.out.println("Data added sucessfully to CSV file\n"); 
		System.out.println("Path = "+ file.getAbsolutePath()); 
		 
	 }
		 
	public void readCSVFile() throws FileNotFoundException {
	 
		Scanner scan = new Scanner(new File("src/ContactInfoCSV.csv"));
		while(scan.hasNext()) { 
		 System.out.println(scan.nextLine()); 
		} 
	}
	 
	public void writeInJson() throws IOException {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String str = gson.toJson(addresslist);
		FileWriter file = new FileWriter(new File("src/JsonOutput.json"));
		file.write(str);
		file.close();
		System.out.println("Data added successfully\n");
	}

	public void readJson() throws FileNotFoundException {

			Scanner Scan = new Scanner(new File("src/JsonOutput.json"));
			while (Scan.hasNext()) {
				System.out.println(Scan.nextLine());
			}
		}

}
