/**
 * Animal.java
 * Main superclass
 */
package proj;

/**
 * @author Adam Pollins
 *
 */
public abstract class Animal {

	private String name;
	private String type;
	
	/**
	 * Constructs an Animal object
	 * 
	 * @param name	the Animal's name
	 */
	public Animal(String name) {
		setName(name);
		setType(getClass().getSimpleName());
	}
	
	/**
	 * @return the name
	 */
	String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return the type of animal
	 */
	String getType() {
		return type;
	}
	
	/**
	 * 
	 * @param type of animal, default is taken from the class name
	 */
	void setType(String type) {
		this.type = type;
	}
	
	/**
	 * 
	 * @return the full name of the animal in the form "[name] the [animal]"
	 */
	public String getFullName() {
		return this.getName() + " the " + this.getType();
	}
	
	void doAction(String action) {
		System.out.println(getFullName() + " " + action);
	}
	
	/**
	 * Wake up behavior
	 */
	public void wakeUp() {
		doAction("wakes up.");
	}
	
	/**
	 * Make noise behavior
	 */
	public abstract void makeNoise();
	
	/**
	 * Eat behavior
	 */
	public abstract void eat();
	
	/**
	 * Roam behavior
	 */
	public abstract void roam();

	/**
	 * Makes the animal go to sleep
	 */
	public void sleep() {
		System.out.println(getFullName() + " goes to sleep.");
	}
}
