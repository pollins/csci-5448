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
	 * Manager class does not need to declare any attributes
	 */
	public Zookeeper() {
		
	}
	
	/**
	 * Helper method for printing the actions of the Zookeeper
	 * @param action
	 */
	void doAction(String action) {
		System.out.println("The zookeeper " + action);
	}
	
	/**
	 * Wake all the animals in the zoo
	 * @param zoo
	 */
	public void wake(Zoo zoo) {
		doAction("wakes the animals.");
		for(Animal animal : zoo)
			animal.wakeUp();
	}
	
	/**
	 * Call roll for all the animals
	 * @param zoo
	 */
	public void rollCall(Zoo zoo) {
		doAction("calls roll.");
		for(Animal animal : zoo)
			animal.makeNoise();
	}
	
	/**
	 * Feed all the animals
	 * @param zoo
	 */
	public void feed(Zoo zoo) {
		doAction("feeds the animals.");
		for(Animal animal : zoo)
			animal.eat();
	}
	
	/**
	 * Exercise all the animals
	 * @param zoo
	 */
	public void exercise(Zoo zoo) {
		doAction("exercises the animals.");
		for(Animal animal : zoo)
			animal.roam();
	}
	
	/**
	 * Shut down the zoo
	 * @param zoo
	 */
	public void shutDown(Zoo zoo) {
		doAction("shuts down the zoo.");
		for(Animal animal : zoo)
			animal.sleep();
	}

}
