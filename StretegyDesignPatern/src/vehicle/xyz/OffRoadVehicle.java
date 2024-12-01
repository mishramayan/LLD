package vehicle.xyz;

import vehicle.xyz.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

	OffRoadVehicle() {
		// TODO Auto-generated constructor stub
		super( new SportsDriveStrategy() );
	}

}
