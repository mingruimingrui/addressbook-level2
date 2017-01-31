package seedu.addressbook.data.person;

/**
 * Represents a Person's street in the address book.
 */
public class Street {
	private String streetName;
	
	public Street(String streetName) {
		this.streetName = streetName;
	}
	
	public String get() {
		return streetName;
	}
}
