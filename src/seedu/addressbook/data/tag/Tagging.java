package seedu.addressbook.data.tag;
import seedu.addressbook.data.person.Person;
import java.util.ArrayList;

public class Tagging {
	
	public enum TaggingType {ADD, DELETE};
	private static final String ADD_SYMBOL = "+";
	private static final String DELETE_SYMBOL = "-";
	
	private TaggingType taggingType;
	private Person person;
	private Tag tag;
	public static ArrayList<Tagging> allTaggings = new ArrayList<Tagging>();
	
	public Tagging(TaggingType taggingType, Person person, Tag tag) {
		this.person = person;
		this.tag = tag;
		this.taggingType = taggingType;
		allTaggings.add(this);
	}
	
	@Override
	public String toString() {
		String type;
		if (taggingType == TaggingType.ADD){
			type = ADD_SYMBOL;
		} else {
			type = DELETE_SYMBOL;
		}
		return type + " " + person.toString() + " " + tag.toString();
	}

}
