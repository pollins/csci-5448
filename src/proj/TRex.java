/**
 * TRex.java
 * Subclass
 */
package proj;

/**
 * @author Adam Pollins
 */
public class TRex extends Reptile {

	/**
	 * @param name
	 */
	public TRex(String name) {
		super(name);
	}
	
	/**
	 * Class specific noise behavior
	 */
	@Override
	public void makeNoise() {
		doAction("roars deafeningly.");
	}

	/**
	 * Class specific eating behavior
	 */
	@Override
	public void eat() {
		doAction("eats a steak.");
	}

}
