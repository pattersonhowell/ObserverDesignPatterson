/**
 * @author pattersonhowell
 * DEA and Cartel use this interface for the methods
 */
public interface Observer {
	/**
	 * Telling observers about cook's activity
	 * @param location Where cook was at
	 * @param description What cook was doing
	 */
	public void update(String location, String description);
	
	/**
	 * Displaying information collected about the cook
	 * @return log of information
	 */
	public String getLog();
}
