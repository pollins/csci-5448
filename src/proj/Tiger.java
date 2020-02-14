/**
 * Tiger.java
 * Subclass
 */
package proj;

/**
 * @author Adam Pollins
 *
 */
public class Tiger extends Feline {

	/**
	 * @param name
	 */
	public Tiger(String name) {
		super(name);
	}
	
	/**
	 * Specific noise behavior for Tiger
	 */
	void actuallyMakeNoise() {
		doAction("growls.");
	}

	/**
	 * Specific eating behavior for Tiger
	 */
	@Override
	public void eat() {
		
	}

}
