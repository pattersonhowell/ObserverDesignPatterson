import java.util.ArrayList;
/**
 * @author pattersonhowell
 * This class is the basis for the Cook (subject) on the run and his observers watching
 */
public class Cook implements Subject {
	private ArrayList<Observer> observers;
	private String name;

	/**
	 * Creating a cook and list of observers
	 * @param name Assigns the name to the cook
	 */
	public Cook(String name) {
		this.name = name;
		observers = new ArrayList<Observer>();
	}
	
	/**
	 * Adding observers to list
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	/**
	 * Taking observers off list
	 */
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	/**
	 * Telling observers new information about the cook's activities
	 */
	public void notifyObservers(String location, String description) {
		for(Observer observer : observers) {
			observer.update(location, description);
		}
	}
	
	/**
	 * Documenting a sighting of the cook
	 * @param location Where the cook is 
	 * @param description What the cook is doing
	 */
	public void enterSighting(String location, String description) {
		notifyObservers(location, description);
	}
	
	/**
	 * Finding the name of cook
	 * @return shows the cook's name
	 */
	public String getName() {
		return this.name;
	}
}
	
	
