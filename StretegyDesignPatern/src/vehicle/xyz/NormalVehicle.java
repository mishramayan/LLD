package vehicle.xyz;

import vehicle.xyz.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle {

	NormalVehicle() {
		// TODO Auto-generated constructor stub
		super( new NormalDriveStrategy() );
	}

}
