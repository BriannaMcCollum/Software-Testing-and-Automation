package MobileServices;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//Brianna McCollum
//7/15/2022
//CS-320
	
//Runs tests on the contact class to ensure proper behavior
class ContactTest {

	@Test
	void testCreateContact() {
		Contact testContact = new Contact("Sonic", "Hedgehog", "1234567890", "Green Hill Zone");
		assertTrue(testContact.getContactID() != null);
		assertTrue(testContact.getFirstName().equals("Sonic"));
		assertTrue(testContact.getLastName().equals("Hedgehog"));
		assertTrue(testContact.getNumber().equals("1234567890"));
		assertTrue(testContact.getAddress().equals("Green Hill Zone"));
	}
	
	@Test
	void testCreateEmptyContact() {
		Contact testContact = new Contact("", "", "", "");
		assertTrue(testContact.getFirstName().equals("NULL"));
		assertTrue(testContact.getLastName().equals("NULL"));
		assertTrue(testContact.getNumber().equals("5555555555"));
		assertTrue(testContact.getAddress().equals("NULL"));
	}
	
	@Test
	void testCreateBigContact() {
		Contact testContact = new Contact("SuperLongNameMan", "WhyMyNameSoLong", "6969696969696969", "Incredibly long super silly address for testing purposes");
		assertTrue(testContact.getFirstName().equals("SuperLongN"));
		assertTrue(testContact.getLastName().equals("WhyMyNameS"));
		assertTrue(testContact.getNumber().equals("5555555555"));
		assertTrue(testContact.getAddress().equals("Incredibly long super silly ad"));
	}
	
	@Test
	void testChangeContact() {
		Contact testContact = new Contact("", "", "", "");
		testContact.setFirstName("Changed");
		testContact.setLastName("Man");
		testContact.setNumber("1213435656");
		testContact.setAddress("A Whole New World");
		assertTrue(testContact.getFirstName().equals("Changed"));
		assertTrue(testContact.getLastName().equals("Man"));
		assertTrue(testContact.getNumber().equals("1213435656"));
		assertTrue(testContact.getAddress().equals("A Whole New World"));
	}

}
