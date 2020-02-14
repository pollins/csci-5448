/**
 * Reptile.java
 * Second-level superclass
 */
package proj;

/**
 * @author atp62
 *
 */
public abstract class Reptile extends Animal {

	/**
	 * @param name
	 */
	public Reptile(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Reptile specific roaming behavior
	 */
	@Override
	public void roam() {
		doAction("prances about.");
		
	}

}
