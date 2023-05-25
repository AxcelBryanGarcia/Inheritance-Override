
public class Car extends Vehicle {
	String Name = "Toyota Vios";
	String TireType = "Michelin";
	
	
	void drive() {
		System.out.println("Car Moves");
	}

	@Override
	void Stop() {
		//super.Stop();
		System.out.println("Hand Breaks");
	}
	
	
}
