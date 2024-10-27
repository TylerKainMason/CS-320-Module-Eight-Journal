/*************************
 * Name: 	Kain Mason
 * Course: 	CS-320 
 * Date: 	September 22, 2024
 * Description: Unit tests for the Contact class.
 *************************/

 package Test;

 import org.junit.jupiter.api.Test;
 import Contact.Contact;
 import org.junit.jupiter.api.DisplayName;
 import static org.junit.jupiter.api.Assertions.*;
 
 public class ContactTest {
	 /*
	  * These tests check the Contact class.
	  * The first five ensure fields don't exceed length limits:
	  * - 10 characters for first/last name
	  * - Exactly 10 characters for the phone number
	  * - 30 characters for the address
	  * The last four tests check that fields are not null.
	  * ContactID isn't tested for null or updates as it's handled internally.
	  */
	 
	 @Test
	 @DisplayName("Contact ID cannot have more than 10 characters")
	 void testContactIDWithMoreThanTenCharacters() {
		 Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr", "Address");
		 if (contact.getContactID().length() > 10) {
			 fail("Contact ID has more than 10 characters.");
		 }
	 }
 
	 @Test
	 @DisplayName("Contact First Name cannot have more than 10 characters")
	 void testContactFirstNameWithMoreThanTenCharacters() {
		 Contact contact = new Contact("OllyOllyOxenFree", "LastName", "PhoneNumbr", "Address");
		 if (contact.getFirstName().length() > 10) {
			 fail("First Name has more than 10 characters.");
		 }
	 }
 
	 @Test
	 @DisplayName("Contact Last Name cannot have more than 10 characters")
	 void testContactLastNameWithMoreThanTenCharacters() {
		 Contact contact = new Contact("FirstName", "OllyOllyOxenFree", "PhoneNumbr", "Address");
		 if (contact.getLastName().length() > 10) {
			 fail("Last Name has more than 10 characters.");
		 }
	 }
 
	 @Test
	 @DisplayName("Contact phone number is exactly 10 characters")
	 void testContactNumberWithMoreThanTenCharacters() {
		 Contact contact = new Contact("FirstName", "LastName", "55555555555", "Address");
		 if (contact.getNumber().length() != 10) {
			 fail("Phone number length does not equal 10.");
		 }
	 }
 
	 @Test
	 @DisplayName("Contact address cannot have more than 30 characters")
	 void testContactAddressWithMoreThanThirtyCharacters() {
		 Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr",
				 "123456789 is nine characters long" + "123456789 is another nine characters long");
		 if (contact.getAddress().length() > 30) {
			 fail("Address has more than 30 characters.");
		 }
	 }
 
	 @Test
	 @DisplayName("Contact First Name shall not be null")
	 void testContactFirstNameNotNull() {
		 Contact contact = new Contact(null, "LastName", "PhoneNumbr", "Address");
		 assertNotNull(contact.getFirstName(), "First name was null.");
	 }
 
	 @Test
	 @DisplayName("Contact Last Name shall not be null")
	 void testContactLastNameNotNull() {
		 Contact contact = new Contact("FirstName", null, "PhoneNumbr", "Address");
		 assertNotNull(contact.getLastName(), "Last name was null.");
	 }
 
	 @Test
	 @DisplayName("Contact Phone Number shall not be null")
	 void testContactPhoneNotNull() {
		 Contact contact = new Contact("FirstName", "LastName", null, "Address");
		 assertNotNull(contact.getNumber(), "Phone number was null.");
	 }
 
	 @Test
	 @DisplayName("Contact Address shall not be null")
	 void testContactAddressNotNull() {
		 Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr", null);
		 assertNotNull(contact.getAddress(), "Address was null.");
	 }
 }
 