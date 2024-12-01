package vehicle.xyz;

import vehicle.xyz.Strategy.DriveStrategy;

public class Vehicle {

	DriveStrategy driveObject;
	
	//constructor injection
	Vehicle(DriveStrategy driveObj){
		this.driveObject = driveObj;
	}
	
	public void drive() {
		System.out.println("Some code...");
		driveObject.drive();
	}

}
