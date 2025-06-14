package dp.strategy;

import dp.strategy.strategies.DriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
