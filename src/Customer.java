import java.util.ArrayList;

public class Customer {
	
	private ArrayList<Bike> bikes = new ArrayList<Bike>();
	
	public Customer(ArrayList<Bike> bikes)
	{
		this.bikes = bikes;
		System.out.println("Done.");
	}
	
	public Customer()
	{
		
	}
	
	public Bike getBike(int i)
	{
		return bikes.get(i);
	}
	
	public void addBike(Bike b)
	{
		bikes.add(b);
	}
	
	public void clearBikes()
	{
		bikes.clear();
	}
	
	public ArrayList<Bike> getBikes()
	{
		return bikes;
	}
	
	public void setBikes(ArrayList<Bike> bikes)
	{
		this.bikes = bikes;
	}
	
	

}
