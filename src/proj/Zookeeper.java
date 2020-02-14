/**
 * Zookeeper.java
 * Manager class for Zoo
 */
package proj;

/**
 * @author Adam Pollins
 *
 */
public class Zookeeper {

	/**
	 * Manager class does not need to instantiate anything
	 */
	public Zookeeper() {
		
	}
	
	void doAction(String action) {
		System.out.println("The zookeeper " + action);
	}
	
	public void wake(Zoo zoo) {
		doAction("wakes the animals.");
		for(Animal animal : zoo)
			animal.wakeUp();
	}
	
	public void rollCall(Zoo zoo) {
		doAction("calls roll.");
		for(Animal animal : zoo)
			animal.makeNoise();
	}
	
	public void feed(Zoo zoo) {
		doAction("feeds the animals.");
		for(Animal animal : zoo)
			animal.eat();
	}
	
	public void exercise(Zoo zoo) {
		doAction("exercises the animals.");
		for(Animal animal : zoo)
			animal.roam();
	}
	
	public void shutDown(Zoo zoo) {
		doAction("shuts down the zoo.");
		for(Animal animal : zoo)
			animal.sleep();
	}

}
