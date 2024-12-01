package vehicle.xyz;

import vehicle.xyz.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

	public SportsVehicle() {
		// TODO Auto-generated constructor stub
		super( new SportsDriveStrategy() );
	}

}
