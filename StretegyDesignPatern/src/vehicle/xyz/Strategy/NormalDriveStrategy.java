package vehicle.xyz.Strategy;

public class NormalDriveStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Normal driving mode.");
	}
}
