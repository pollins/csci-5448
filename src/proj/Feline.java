/**
 * Feline.java
 * Second-level superclass
 */
package proj;

import java.util.Random;

/**
 * @author Adam Pollins
 *
 */
public abstract class Feline extends Animal {
	
	/**
	 * @param name
	 */
	public Feline(String name) {
		super(name);
	}
	
	/**
	 * Performs a random action of either sleep(), makeNoise(), or roam()
	 */
	void act() {
		Random rand = new Random();
		int val = rand.nextInt(3);
		if(val == 0) {
			super.sleep();
		}
		else if(val == 1) {
			actuallyRoam();
		}
		else if(val == 2) {
			actuallyMakeNoise();
		}
			
	}

	/**
	 * All Felines make noise, but this is defined per subclass.
	 */
	abstract void actuallyMakeNoise();

	/**
	 * This defines the roaming behavior if called by act().
	 */
	void actuallyRoam() {
		doAction("runs around.");
	}

	public void roam() {
		act();
	}

	public void makeNoise() {
		act();
	}

	public void sleep() {
		act();
	}

}
