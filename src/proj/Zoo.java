/**
 * Zoo.java
 * Class with main method
 */
package proj;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Adam Pollins
 *
 */
public class Zoo implements Iterable<Animal> {
	
	private LinkedList<Animal> animals;
	
	/**
	 * Populates the zoo with animals and has the Zookeeper carry out their duties
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		// add all animals
		zoo.add(new Cat("Charles"));
		zoo.add(new Cat("Chuck"));
		zoo.add(new Dragonfly("Dave"));
		zoo.add(new Dragonfly("Donna"));
		zoo.add(new Lion("Lance"));
		zoo.add(new Lion("Lily"));
		zoo.add(new Lobster("Larry"));
		zoo.add(new Lobster("Lenny"));
		zoo.add(new Ostrich("Oscar"));
		zoo.add(new Ostrich("Olive"));
		zoo.add(new Tiger("Terry"));
		zoo.add(new Tiger("Tammy"));
		zoo.add(new TRex("Tony"));
		zoo.add(new TRex("Toni"));
		
		// all zookeeper actions
		Zookeeper zookeeper = new Zookeeper();
		zookeeper.wake(zoo);
		zookeeper.rollCall(zoo);
		zookeeper.feed(zoo);
		zookeeper.exercise(zoo);
		zookeeper.shutDown(zoo);
	}
	
	/**
	 * Zoo constructor
	 */
	public Zoo() {
		animals = new LinkedList<Animal>();
	}
	
	public boolean add(Animal animal) {
		return animals.add(animal);
	}

	/**
	 * @return the Iterator for the animals in the zoo
	 */
	@Override
	public Iterator<Animal> iterator() {
		return animals.iterator();
	}

}
