package vehicle.xyz;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new SportsVehicle();
		vehicle.drive();
		
		Vehicle vehicle1 = new NormalVehicle();
		vehicle1.drive();
		
		Vehicle vehicle2 = new OffRoadVehicle();
		vehicle2.drive();
		
	}

}
