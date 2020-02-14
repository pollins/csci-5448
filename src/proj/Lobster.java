/**
 * Lobster.java
 * Subclass
 */
package proj;

/**
 * @author Adam Pollins
 *
 */
public class Lobster extends Invertebrate {

	/**
	 * @param	name	the name
	 */
	public Lobster(String name) {
		super(name);
	}

	/**
	 * Lobster specific eating behavior
	 */
	@Override
	public void eat() {
		doAction("eats some fish.");
	}

	/**
	 * Lobster specific roaming behavior
	 */
	@Override
	public void roam() {
		doAction("scuttles around.");
	}

}
