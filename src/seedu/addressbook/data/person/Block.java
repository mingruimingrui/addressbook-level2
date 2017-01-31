package seedu.addressbook.data.person;

/**
 * Represents a Person's block in the address book.
 */
public class Block {
	private String blockNumber;
	
	public Block(String blockNumber) {
		this.blockNumber = blockNumber;
	}
	
	public String get() {
		return blockNumber;
	}
}
