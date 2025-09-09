package dp.adapter;

public class WeighingScaleInKgImpl implements WeighingScaleInKg {
    WeighingMachine weighingMachine;

    public WeighingScaleInKgImpl(WeighingMachine weighingMachine) {
        this.weighingMachine = weighingMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = weighingMachine.getWeightInPounds();
        return weightInPound * 0.45;
    }
}
