/**
 * Ostrich.java
 * Subclass
 */
package proj;

/**
 * @author Adam Pollins
 *
 */
public class Ostrich extends Reptile {
	// a bird is a reptile, look it up
	/**
	 * @param name
	 */
	public Ostrich(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNoise() {
		doAction("hoots.");
	}

	@Override
	public void eat() {
		doAction("eats some seeds.");
	}

}
