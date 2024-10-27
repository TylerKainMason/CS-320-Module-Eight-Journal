/*************************
 * Name: 	Kain Mason
 * Course: 	CS-320 
 * Date: 	September 22, 2024
 * Description: Stores and manages contact info with basic validation.
 *************************/

 package Contact;

 import java.util.concurrent.atomic.AtomicLong;
 
 public class Contact {
	 private final String contactID;
	 private String firstName;
	 private String lastName;
	 private String number;
	 private String address;
	 private static AtomicLong idGenerator = new AtomicLong();
 
	 // Constructor
	 /*
	  * Initializes a Contact with given details and generates a unique ID.
	  * Enforces max lengths (10 for names, 30 for address) and default values for invalid data.
	  */
	 public Contact(String firstName, String lastName, String number, String address) {
		 // Unique Contact ID
		 this.contactID = String.valueOf(idGenerator.getAndIncrement());
 
		 // First Name validation
		 this.firstName = (firstName == null || firstName.isEmpty()) ? "NULL" : firstName.length() > 10 ? firstName.substring(0, 10) : firstName;
 
		 // Last Name validation
		 this.lastName = (lastName == null || lastName.isEmpty()) ? "NULL" : lastName.length() > 10 ? lastName.substring(0, 10) : lastName;
		 
		 // Phone number validation
		 this.number = (number == null || number.isEmpty() || number.length() != 10) ? "5555555555" : number;
		 
		 // Address validation
		 this.address = (address == null || address.isEmpty()) ? "NULL" : address.length() > 30 ? address.substring(0, 30) : address;
	 }
 
	 // Getters
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
		 return number;
	 }
 
	 public String getAddress() {
		 return address;
	 }
 
	 // Setters
	 /*
	  * Update contact details with same validation rules as constructor.
	  */
	 public void setFirstName(String firstName) {
		 this.firstName = (firstName == null || firstName.isEmpty()) ? "NULL" : firstName.length() > 10 ? firstName.substring(0, 10) : firstName;
	 }
 
	 public void setLastName(String lastName) {
		 this.lastName = (lastName == null || lastName.isEmpty()) ? "NULL" : lastName.length() > 10 ? lastName.substring(0, 10) : lastName;
	 }
 
	 public void setNumber(String number) {
		 this.number = (number == null || number.isEmpty() || number.length() != 10) ? "5555555555" : number;
	 }
 
	 public void setAddress(String address) {
		 this.address = (address == null || address.isEmpty()) ? "NULL" : address.length() > 30 ? address.substring(0, 30) : address;
	 }
 }
 