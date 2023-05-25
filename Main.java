
public class Main {

	public static void main(String[] args) {
		Car obj = new Car();
		
		obj.drive();
		obj.Stop();
		
		System.out.println("Toyota Vios Specification:");
		System.out.println("Speed: " + obj.Speed);
		System.out.println("Color: " + obj.Color);
		System.out.println("Price: " + obj.Price);
		System.out.println("Name: " + obj.Name);
		System.out.println("Type of tire: " + obj.TireType);
		obj.drive();
		obj.Stop();
		
		System.out.println("________________________________");
			
		Fandango Boat = new Fandango();
		
		Boat.Color = "BLACK";
		Boat.Price = "40 Million";
		Boat.Speed = "150 kph";
		
		
		System.out.println("Main Sail Color: " + Boat.MainSail);
		System.out.println("Fandango Yacht Color: " + Boat.Color);
		System.out.println("Yacht Speed: " + Boat.Speed);
		System.out.println("Yacht Price: " + Boat.Price);
		
		Boat.Floats();
		Boat.Stop();
		
		System.out.println("_________________________________");
		
		Plane U2SpyPlane = new Plane();
		U2SpyPlane.Color = "WHITE";
		U2SpyPlane.Price = "100 Million";
		U2SpyPlane.Speed = "200 Kph";
		
		System.out.println("U2 - Spy Plane Color" + U2SpyPlane.Color);
		System.out.println("U2 - Spy Plane Price" + U2SpyPlane.Price);
		System.out.println("U2 - Spy Plane Speed" + U2SpyPlane.Speed);
		System.out.println("U2 - Spy Plane WingLenght" + U2SpyPlane.Lenght);
		
		U2SpyPlane.Fly();
		U2SpyPlane.Stop();
	}

}
