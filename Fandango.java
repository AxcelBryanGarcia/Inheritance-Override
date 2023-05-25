public class Fandango extends Vehicle {
	
	String MainSail = "RED and White";
	
	void Floats() {
		System.out.println("The boat is floating in the sea");
	}

	@Override
	void Stop() {
		System.out.println("The boat stop at the sea");
		super.Stop();
	}
	
	
	
}
