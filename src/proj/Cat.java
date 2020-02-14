/**
 * Cat.java
 * Subclass
 */
package proj;

/**
 * @author Adam Pollins
 *
 */
public class Cat extends Feline {

	/**
	 * @param name
	 */
	public Cat(String name) {
		super(name);
	}
	
	/**
	 * Specific noise behavior for Cat
	 */
	void actuallyMakeNoise() {
		doAction("hisses.");
	}

	@Override
	public void eat() {
		doAction("eats some cat food.");
	}

}
