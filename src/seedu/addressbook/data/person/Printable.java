package seedu.addressbook.data.person;

public interface Printable {
	
	String toString();
	
	default String getPrintableString() {;
		return this.toString();
	}
}
