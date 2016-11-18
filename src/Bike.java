
public class Bike {
	
	private String bikeName;
	
	/**
	 * Constructor for bike object.
	 * @param bikeName
	 */
	public Bike(String bikeName)
	{
		this.bikeName = bikeName;
	}
	
	/**
	 * Getter for bike name. Bike b = new Bike(String); b.getBikeName();
	 * @return Returns the bike name;
	 */
	public String getBikeName()
	{
		return bikeName;
	}
	
	/**
	 * Setter for bike name. b.setBikeName(String);
	 * @param bikeName The name you wish to set the bike to.
	 */
	public void setBikeName(String bikeName)
	{
		this.bikeName = bikeName;
	}

}
