package MobileServices;

import java.util.concurrent.atomic.AtomicLong;
//Brianna McCollum
//7/15/2022
//CS-320

//This is the contact class. It creates and stores contact information.
//See the Constructor for more info.
public class Contact {

	//making the contactID final means it will not change
	private final String contactID;
	private String firstName;
	private String lastName;
	private String Number;
	private String Address;
	//Used to generate a random, unique ID for the contact in the constructor
	private static AtomicLong idGenerator = new AtomicLong();

	//CONSTRUCTOR
	/*
	* The constructor takes first name, last name, phone number, and address as parameters.
	* The first thing it does is generates a new ID for the contactID field.
	*
	* First name and last name are checked for null condition or blank fields. If either of
	* those conditions exist, fill in the field with the phrase "NULL" so that something exists
	* to protect data integrity while making it clear it is a placeholder.
	* In both cases, if the first or last name is greater than 10 characters, truncate it
	* so that only the first 10 characters are used.
	*
	* For the number field, if the phone number is not exactly 10 characters then fill it with
	* the placeholder '5555555555'.
	*
	* Address is like first and last names. If it is blank or null, set it to "NULL".
	* If it is more than 30 characters, truncate to the first 30 characters.
	*/
	public Contact(String firstName, String lastName, String number, String address)  {

		//CONTACTID
		//Contact ID is generated when the constructor is called. It is set as a final variable and has
		//no other getter or setter so there should be no way to change it.
		//The idGenerator is static to prevent duplicates across all contacts.
		this.contactID = String.valueOf(idGenerator.getAndIncrement());
	
		//FIRSTNAME
		if (firstName == null || firstName.isBlank()) {
	
		this.firstName = "NULL";
	
		//If first name is longer than 10 characters, just grab the first 10 characters
		} 
		else if(firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		} 
		else {
			this.firstName = firstName;
		}
	
		//LASTNAME
		if (lastName == null || lastName.isBlank()) {
			this.lastName = "NULL";
		} 
		else if(lastName.length() > 10) {
			this.lastName = lastName.substring(0,10);
		} 
		else {
			this.lastName = lastName;
		}
		//NUMBER
		if (number == null || number.isBlank() || number.length() != 10) {
			this.Number = "5555555555";
		} 
		else {
			this.Number = number;
		}
		//ADDRESS
		if (address == null || address.isBlank()) {
			this.Address = "NULL";
		} 
		else if(address.length() > 30) {
			this.Address = address.substring(0,30);
		} 
		else {
			this.Address = address;
		}
	}

	//GETTERS
	public String getContactID() {
		return contactID;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getNumber() {
		return Number;
	}
	
	public String getAddress() {
		return Address;
	}
	
	//SETTERS
	public void setFirstName(String name) {
		//if blank or null, set to NULL
		if (name == null || name.isBlank()) {
			firstName = "NULL";
		} 
		//If first name is longer than 10 characters, just grab the first 10 characters
		else if (name.length() > 10) {
			firstName = name.substring(0, 10);
		} 
		//name is valid as is
		else {
			firstName = name;
		}
	}
	
	public void setLastName(String name) {
		//if blank or null, set to NULL
		if (name == null || name.isBlank()) {
			lastName = "NULL";
		} 
		//If first name is longer than 10 characters, just grab the first 10 characters
		else if (name.length() > 10) {
			lastName = name.substring(0, 10);
		} 
		//name is valid as is
		else {
			lastName = name;
		}
	}
	
	public void setNumber(String number) {
		//If the number is an invalid input, simply make it 5555555555
		if (number == null || number.isBlank() || number.length() != 10) {
			Number = "5555555555";
		} 
		//Valid number can be input
		else {
			Number = number;
		}
	}
	
	public void setAddress(String address) {
		//if blank or null, set to NULL
		if (address == null || address.isBlank()) {
			address = "NULL";
		} 
		//if the address is longer than 30 characters, grab the first 30
		else if(address.length() > 30) {
			Address = address.substring(0,30);
		} 
		//address is valid as is
		else {
			Address = address;
		}
	}
}
