/**
 * 
 */
package root;

/**
 * @author chauhan_k
 *
 */
public class Student {
	private String firstName;
	private String lastName;
	private String id;
	
	public Student(String firstName, String lastName, String id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getId() {
		return id;
	}
}

class StudentBuilder {
	private String firstName;
	private String lastName;
	private String id;

	public StudentBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public StudentBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public StudentBuilder id(String id) {
		this.id = id;
		return this;
	}
	
	public Student build() {
		return new Student(this.firstName, this.lastName, this.id);
	}
	
}
