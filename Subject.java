/**
 * @author pattersonhowell
 * Cook uses this interface for the methods
 */
public interface Subject {
	/**
	 * Putting observers on list
	 * @param observer Who is being added to list
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * Taking observers off list
	 * @param observer Who is being taken off list
	 */
	public void removeObserver(Observer observer);
	
	/**
	 * Telling observers of cook's recent activities
	 * @param location Where cook was at
	 * @param description What cook was doing
	 */
	public void notifyObservers(String location, String description);

}
