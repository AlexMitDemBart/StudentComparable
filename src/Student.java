
public class Student implements Comparable {
	private String firstName;
	private String lastName;
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	@Override
	public int compareTo(Object o) {
		Student student = (Student)o;
		return this.firstName.compareTo(student.firstName);
	}
	
	@Override
	public String toString() {
		return String.format("firstname: %s lastname: %s ",
				firstName, lastName);
	}
}
