/**
 * Reptile.java
 * Second-level superclass
 */
package proj;

/**
 * @author Adam Pollins
 *
 */
public abstract class Reptile extends Animal {

	/**
	 * @param name
	 */
	public Reptile(String name) {
		super(name);
	}
	
	/**
	 * Reptile specific roaming behavior
	 */
	@Override
	public void roam() {
		doAction("prances about.");
		
	}

}
