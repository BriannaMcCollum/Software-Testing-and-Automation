package MobileServices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//Brianna McCollum
//7/15/2022
//CS-320
	
//The contact service that manages contacts and holds the list of contacts that the user owns
public class ContactService {
	
	//array list of contacts to keep them all stored in the Contact Service
	private static List<Contact> contacts = new ArrayList<Contact>();
	
	//internal function to search for a contact by ID and return the contact if found, null if not
	private Contact contactSearch(Contact contact) {
		//An iterator will make searching for our contact much easier
		Iterator<Contact> contactIterator = contacts.iterator();
		
		//has a check to avoid searching an empty list, would cause an error otherwise
		if(contacts.isEmpty()) {
			return null;
		}
		
		//The iterator continues to loop through it's contents until there are no values left, or until a match is found
		while(contactIterator.hasNext()) {
			Contact placeholder = contactIterator.next();
			//checks to see if the ID of the contact matches the desired contact's ID
			if (placeholder.getContactID() == contact.getContactID()) {
				// if found, return the contact
				return placeholder;
			}
		}
		
		//If not found, return null
		return null;
	}
	
	//internal function to search for a contact using only ID and return the contact if found, null if not
		private Contact contactIDSearch(String ID) {
			//An iterator will make searching for our contact much easier
			Iterator<Contact> contactIterator = contacts.iterator();
			
			//has a check to avoid searching an empty list, would cause an error otherwise
			if(contacts.isEmpty()) {
				return null;
			}
			
			//The iterator continues to loop through it's contents until there are no values left, or until a match is found
			while(contactIterator.hasNext()) {
				Contact placeholder = contactIterator.next();
				//checks to see if the ID of the contact matches the desired contact's ID
				if (placeholder.getContactID() == ID) {
					// if found, return the contact
					return placeholder;
				}
			}
			
			//If not found, return null
			return null;
		}
	
	//adds a contact to the list if it's not already present
	public void addContact(Contact contact) {
		
		//run the search function to find if the contact already exists.
		Contact result = contactSearch(contact);
		
		//if the contact is not in our list, the new contact will be added
		if (result == null) {
			contacts.add(contact);
		}
	}
	
	//removes an existing contact from the list
	public void deleteContact(Contact contact) {
		//run the search function to find if the contact exists.
		Contact result = contactSearch(contact);
		
		//if the contact is found, remove it from the list
		if (result != null) {
			contacts.remove(contact);
		}
	}
	
	public void updateFirstName(Contact contact, String name) {
		//run the search function to find if the contact exists.
		Contact result = contactSearch(contact);
				
		//if the contact is found, change it's name to the desired name
		if (result != null) {
			result.setFirstName(name);
		}
	}
	
	public void updateLastName(Contact contact, String name) {
		//run the search function to find if the contact exists.
		Contact result = contactSearch(contact);
				
		//if the contact is found, change it's name to the desired name
		if (result != null) {
			result.setLastName(name);
		}
	}
	
	public void updateNumber(Contact contact, String number) {
		//run the search function to find if the contact exists.
		Contact result = contactSearch(contact);
				
		//if the contact is found, change it's name to the desired name
		if (result != null) {
			result.setNumber(number);
		}
	}
	
	public void updateAddress(Contact contact, String address) {
		//run the search function to find if the contact exists.
		Contact result = contactSearch(contact);
				
		//if the contact is found, change it's name to the desired name
		if (result != null) {
			result.setAddress(address);
		}
	}
	
	//returns contact with a specific ID
	public Contact getContact(String ID) {
		//run the ID specific search function to find the desired contact.
		Contact result = contactIDSearch(ID);
		
		//if the contact is found, change it's name to the desired name
		if (result != null) {
			return result;
		}
		//return null if nothing is found
		return null;
	}
	
	//public check for if the contact list is empty
	public boolean isEmpty() {
		if (contacts.isEmpty()) {
			return true;
		}
		return false;
	}

}
