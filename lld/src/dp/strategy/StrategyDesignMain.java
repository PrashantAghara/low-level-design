package dp.strategy;

import dp.strategy.strategies.NormalDriveStrategy;
import dp.strategy.strategies.SportsDriveStrategy;

public class StrategyDesignMain {
    public static void main(String[] args) {
        Vehicle goodsVehicle = new GoodsVehicle(new NormalDriveStrategy());
        Vehicle sportsVehicle = new SportsVehicle(new SportsDriveStrategy());

        goodsVehicle.drive();
        sportsVehicle.drive();
    }
}
