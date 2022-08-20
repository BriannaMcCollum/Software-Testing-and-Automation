package MobileServices;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//Brianna McCollum
//7/15/2022
//CS-320
	
//Runs tests on the contact service class to ensure proper behavior
class ContactServiceTest {

	@Test
	void testAddRemoveContact() {
		ContactService testContactService = new ContactService();
		Contact testContact = new Contact("Sonic", "Hedgehog", "1234567890", "Green Hill Zone");
		testContactService.addContact(testContact);
		Contact testContactTwo = new Contact("","","","");
		testContactService.addContact(testContactTwo);
		assertEquals(testContact, testContactService.getContact(testContact.getContactID()));
		assertEquals(testContactTwo, testContactService.getContact(testContactTwo.getContactID()));
		testContactService.deleteContact(testContact);
		testContactService.deleteContact(testContactTwo);
		assertTrue(testContactService.isEmpty());
	}
	
	@Test
	void testChangeContact() {
		ContactService testContactService = new ContactService();
		Contact testContact = new Contact("Sonic", "Hedgehog", "1234567890", "Green Hill Zone");
		testContactService.addContact(testContact);
		testContactService.updateFirstName(testContact, "Changed");
		testContactService.updateLastName(testContact, "Man");
		testContactService.updateNumber(testContact, "1213435656");
		testContactService.updateAddress(testContact, "A Whole New World");
		assertTrue((testContactService.getContact(testContact.getContactID()).getFirstName()).equals("Changed"));
		assertTrue((testContactService.getContact(testContact.getContactID()).getLastName()).equals("Man"));
		assertTrue((testContactService.getContact(testContact.getContactID()).getNumber()).equals("1213435656"));
		assertTrue((testContactService.getContact(testContact.getContactID()).getAddress()).equals("A Whole New World"));
	}

}
