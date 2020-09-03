import java.util.ArrayList;
/**
 * @author pattersonhowell
 * This class is the basis of the work of the Cartel who is an observer
 */
public class Cartel implements Observer {

	private Subject cook;
	private ArrayList<Sighting> sightings;
	
	/**
	 * Creating a new observer and adding him/her to the list of observers
	 * @param cook The cook has observers on him
	 */
	public Cartel(Subject cook) {
		this.cook = cook;
		sightings = new ArrayList<Sighting>();
		cook.registerObserver(this);
	}
	
	/**
	 * Adding cook's whereabouts and activities to the list of sightings
	 */
	public void update(String location, String description) {
		sightings.add(new Sighting(location, description));
	}
	
	/**
	 * Displaying the Cartel's information about what the cook has been up to
	 */
	public String getLog() {
		for(Sighting str : sightings) {
			System.out.println(str.getLocation() + " (" + str.getDetails() + ")");
		}
		return "";
	}
}
