/**
 * Dragonfly.java
 * Subclass
 */
package proj;

/**
 * @author Adam Pollins
 *
 */
public class Dragonfly extends Invertebrate {

	/**
	 * @param name
	 */
	public Dragonfly(String name) {
		super(name);
	}

	/**
	 * Dragonfly specific eating behavior
	 */
	@Override
	public void eat() {
		doAction("eats some mosquitoes.");
	}

	/**
	 * Dragonfly specific roaming behavior
	 */
	@Override
	public void roam() {
		doAction("flutters about.");
	}

}
