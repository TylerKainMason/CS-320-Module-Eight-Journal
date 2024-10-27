/*************************
 * Name: 	Kain Mason
 * Course: 	CS-320 
 * Date: 	September 22, 2024
 * Description: Manages a list of contacts with add, delete, and update functionality.
 *************************/

 package Contact;

 import java.util.ArrayList;
 
 public class ContactService {
	 // List to store contacts
	 public ArrayList<Contact> contactList = new ArrayList<Contact>();
 
	 // Display the contact list
	 public void displayContactList() {
		 for (Contact contact : contactList) {
			 System.out.println("\t Contact ID: " + contact.getContactID());
			 System.out.println("\t First Name: " + contact.getFirstName());
			 System.out.println("\t Last Name: " + contact.getLastName());
			 System.out.println("\t Phone Number: " + contact.getNumber());
			 System.out.println("\t Address: " + contact.getAddress() + "\n");
		 }
	 }
 
	 // Add a new contact
	 public void addContact(String firstName, String lastName, String number, String address) {
		 Contact contact = new Contact(firstName, lastName, number, address);
		 contactList.add(contact);
	 }
 
	 // Get contact by ID, return default if not found
	 public Contact getContact(String contactID) {
		 for (Contact contact : contactList) {
			 if (contact.getContactID().equals(contactID)) {
				 return contact;
			 }
		 }
		 return new Contact(null, null, null, null);
	 }
 
	 // Delete contact by ID
	 public void deleteContact(String contactID) {
		 for (int i = 0; i < contactList.size(); i++) {
			 if (contactList.get(i).getContactID().equals(contactID)) {
				 contactList.remove(i);
				 return;
			 }
		 }
		 System.out.println("Contact ID: " + contactID + " not found.");
	 }
 
	 // Update first name by ID
	 public void updateFirstName(String updatedString, String contactID) {
		 for (Contact contact : contactList) {
			 if (contact.getContactID().equals(contactID)) {
				 contact.setFirstName(updatedString);
				 return;
			 }
		 }
		 System.out.println("Contact ID: " + contactID + " not found.");
	 }
 
	 // Update last name by ID
	 public void updateLastName(String updatedString, String contactID) {
		 for (Contact contact : contactList) {
			 if (contact.getContactID().equals(contactID)) {
				 contact.setLastName(updatedString);
				 return;
			 }
		 }
		 System.out.println("Contact ID: " + contactID + " not found.");
	 }
 
	 // Update phone number by ID
	 public void updateNumber(String updatedString, String contactID) {
		 for (Contact contact : contactList) {
			 if (contact.getContactID().equals(contactID)) {
				 contact.setNumber(updatedString);
				 return;
			 }
		 }
		 System.out.println("Contact ID: " + contactID + " not found.");
	 }
 
	 // Update address by ID
	 public void updateAddress(String updatedString, String contactID) {
		 for (Contact contact : contactList) {
			 if (contact.getContactID().equals(contactID)) {
				 contact.setAddress(updatedString);
				 return;
			 }
		 }
		 System.out.println("Contact ID: " + contactID + " not found.");
	 }
 }
 