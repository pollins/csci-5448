/**
 * Invertebrate.java
 * Second-level superclass
 */
package proj;

/**
 * @author Adam Pollins
 *
 */
public abstract class Invertebrate extends Animal {
	
	/**
	 * @param name
	 */
	public Invertebrate(String name){
		super(name);
	}
	
	/**
	 * Invertebrate-specific noise behavior
	 */
	public void makeNoise() {
		System.out.println(getFullName() + " nods silently.");
	}

}
