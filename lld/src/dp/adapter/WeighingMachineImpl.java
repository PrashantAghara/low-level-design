package dp.adapter;

public class WeighingMachineImpl implements WeighingMachine {
    double weightInPound;

    public WeighingMachineImpl(double weightInPound) {
        this.weightInPound = weightInPound;
    }

    @Override
    public double getWeightInPounds() {
        return weightInPound;
    }
}
