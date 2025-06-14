package dp.strategy;

import dp.strategy.strategies.DriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
