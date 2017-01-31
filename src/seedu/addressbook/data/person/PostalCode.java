package seedu.addressbook.data.person;

/**
 * Represents a Person's postal code in the address book.
 */
public class PostalCode {
	private String postalCodeNumber;
	
	public PostalCode(String postalCodeNumber) {
		this.postalCodeNumber = postalCodeNumber;
	}
	
	public String get() {
		return postalCodeNumber;
	}
}
