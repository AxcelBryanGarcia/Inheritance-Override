
public class Plane extends Vehicle {
	String Lenght = "2400 km";
	
	void Fly() {
		System.out.println("The plain is flying");
	}

	@Override
	void Stop() {
		System.out.println("The plain stop at the airport");
		super.Stop();
	}
	
}
