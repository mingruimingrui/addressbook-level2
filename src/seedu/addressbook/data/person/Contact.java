package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's [contact] in the address book.
 */
public class Contact {
	
	public final String value;
	protected boolean isPrivate;
	
	/**
     * Validates given [contact] number.
     *
     * @throws IllegalValueException if given [contact] string is invalid.
     */
	public Contact(String contact,boolean isPrivate) throws IllegalValueException {
		this.isPrivate = isPrivate;
		String trimmedContact = contact.trim();
        this.value = trimmedContact;
	}
	
	@Override
    public String toString() {
        return value;
    }
	
	@Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
