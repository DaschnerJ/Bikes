import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		Bike a = new Bike("a");
		Bike b = new Bike("b");
		Bike c = new Bike("a");
		
		ArrayList<Bike> bikes = new ArrayList<Bike>();
		
		bikes.add(a);
		bikes.add(b);
		bikes.add(c);
		
		Customer Don = new Customer();
		
		Don.setBikes(bikes);


	}

}
