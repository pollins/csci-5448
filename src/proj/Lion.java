/**
 * Lion.java
 * Subclass
 */
package proj;

/**
 * @author Adam Pollins
 *
 */
public class Lion extends Feline {

	/**
	 * @param name
	 */
	public Lion(String name) {
		super(name);
	}

	/**
	 * Specific noise behavior for Lion
	 */
	void actuallyMakeNoise() {
		doAction("roars.");
	}

	/**
	 * Specific eating behavior for Lion
	 */
	@Override
	public void eat() {
		doAction("eats a zebra.");
	}
	
}
