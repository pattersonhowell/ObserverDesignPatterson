/**
 * @author pattersonhowell
 * This class is the base of documenting a sighting of the cook
 */
public class Sighting {

	private String location;
	private String details;
	
	/**
	 * Creating a sighting
	 * @param location Where cook was
	 * @param details What cook was doing
	 */
	public Sighting(String location, String details) {
		this.location = location;
		this.details = details;
	}
	
	/**
	 * Finding cook's location
	 * @return Where cook was
	 */
	public String getLocation() {
		return this.location;
	}
	
	/**
	 * Finding what cook was doing
	 * @return cook's activity
	 */
	public String getDetails() {
		return this.details;
	}
	
}
