package dp.strategy;

public class StrategyDesignMain {
    public static void main(String[] args) {
        Vehicle goodsVehicle = new GoodsVehicle();
        Vehicle sportsVehicle = new SportsVehicle();

        goodsVehicle.drive();
        sportsVehicle.drive();
    }
}
