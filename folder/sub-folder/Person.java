import java.util.Objects;

/**
 * Represents a basic person that can do absolutely nothing incredible.
 */
public class Person {
	
	private static final int MAX_AGE_LIMIT = 120;
	private static final int MIN_AGE_LIMIT = 1;
	
	private String name;
	private int age;
	
	/**
	 * @param name the name of the person
	 * @param age the age of the person
	 * @throws NullPointerException if the name is null
	 */
	public Person(String name, int age) {
		this.name = Objects.requireNonNull(name);
		this.age = (age < MIN_AGE_LIMIT || age > MAX_AGE_LIMIT) ? 1 : age;
	}
	
	public String getName() { return name; }
	
	public int getAge() { return age; }

}
