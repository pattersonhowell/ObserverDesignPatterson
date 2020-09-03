import java.util.ArrayList;
/**
 * @author pattersonhowell
 * This class is the foundation for the work of the DEA who is an observer
 */
public class DEA implements Observer {
	
	private Subject cook;
	private ArrayList<String> locations;
	private String notes = "";
	
	/**
	 * Creating an observer (DEA) and adding him/her to the observer list
	 * @param cook The cook has observers on him
	 */
	public DEA(Subject cook) {
		this.cook = cook;
		locations = new ArrayList<String>();
		cook.registerObserver(this);
	}
	
	/**
	 * Adding new location of cook to list of his locations
	 * Storing cook's activites at each location
	 */
	public void update(String location, String description) {
		locations.add(location);
		notes += "\n" + description;
	}
	
	/**
	 * Displaying the information the DEA has collected about the cook
	 */
	public String getLog() {
		System.out.println("Locations:");
		for(String str : locations) {
			System.out.println(str);
		}
		System.out.println();
		
		System.out.print("Notes:");
		return notes;
	}
	

}
