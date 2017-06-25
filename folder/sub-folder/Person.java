import java.util.Objects;

/**
 * Represents a basic person that can do absolutely nothing incredible.
 */
public class Person {
	
	private String name;
	private int age;
	
	/**
	 * @param name the name of the person
	 * @param age the age of the person
	 * @throws NullPointerException if the name is null
	 */
	public Person(String name, int age) {
		this.name = Objects.requireNonNull(name);
		this.age = (age < 1) ? 1 : age;
	}
	
	public String getName() { return name; }
	
	public int getAge() { return age; }

}
