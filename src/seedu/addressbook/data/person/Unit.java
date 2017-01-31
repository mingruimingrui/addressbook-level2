package seedu.addressbook.data.person;

/**
 * Represents a Person's unit in the address book.
 */
public class Unit {
	private String unitNumber;
	
	public Unit(String unitNumber) {
		this.unitNumber = unitNumber;
	}
	
	public String get() {
		return unitNumber;
	}
}
