package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {
	//Will not change Address due to error committing during last tutorial

    public static final String EXAMPLE = "a/123, some street, #12-34, 123456";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses should be "
    		+ "entered in the following format a/BLOCK, STREET, UNIT, POSTAL_CODE";
    public static final String ADDRESS_VALIDATION_REGEX = ".+(, .+){3}";
    private static final String SEPARATOR = ", ";
    private static final int BLOCK_INDEX = 0;
    private static final int STREET_INDEX = 1;
    private static final int UNIT_INDEX = 2;
    private static final int POSTAL_CODE_INDEX = 3;

    //public final String value;
    private Block blockNumber;
    private Street streetName;
    private Unit unitNumber;
    private PostalCode postalCodeNumber;
    private boolean isPrivate;
    
    public String getAddress(){
    	return blockNumber.get() + SEPARATOR + streetName.get() + SEPARATOR +
    			unitNumber.get() + SEPARATOR + postalCodeNumber.get();
    }

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        //this.value = trimmedAddress;
        String[] AddressComponents = trimmedAddress.split(SEPARATOR);
        blockNumber = new Block(AddressComponents[BLOCK_INDEX]);
        streetName = new Street(AddressComponents[STREET_INDEX]);
        unitNumber = new Unit(AddressComponents[UNIT_INDEX]);
        postalCodeNumber = new PostalCode(AddressComponents[POSTAL_CODE_INDEX]);
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return this.getAddress();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls 
                && this.getAddress().equals(((Address) other).getAddress())); // state check
    }

    @Override
    public int hashCode() {
        return this.getAddress().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
