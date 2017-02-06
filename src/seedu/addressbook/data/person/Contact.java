package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's [contact] in the address book.
 */
public class Contact {
	
	public static final String EXAMPLE = "Example of your contact input";
	public static final String MESSAGE_CONTACT_CONSTRAINTS = "User instructions for correct input format";
	public static final String CONTACT_VALIDATION_REGEX = "Regular expression format of correct input";
	
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
		if (!isValidContact(trimmedContact)) {
            throw new IllegalValueException(MESSAGE_CONTACT_CONSTRAINTS);
        }
        this.value = trimmedContact;
	}
	
    /**
     * Checks if a given string is a valid person [contact].
     */
	public static boolean isValidContact(String test) {
        return test.matches(CONTACT_VALIDATION_REGEX);
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
