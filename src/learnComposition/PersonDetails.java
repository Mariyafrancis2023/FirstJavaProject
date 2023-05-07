package learnComposition;

public class PersonDetails {

	private String name;
	private String address;
	private int age;
	private String qualification;
	private int marks;

	public PersonDetails(String name, String address, int age, String qualification, int marks) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.qualification = qualification;
		this.marks = marks;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getQualification() {
		return qualification;
	}

	public int getMarks() {
		return marks;
	}
}
