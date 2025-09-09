package dp.adapter;

public class Main {
    public static void main(String[] args) {
        double weighingScaleReading = 25.0;
        WeighingMachine imperialWeighingMachine = new WeighingMachineImpl(weighingScaleReading);
        WeighingScaleInKg weightMachineAdapter = new WeighingScaleInKgImpl(imperialWeighingMachine);
        System.out.println("Weight in KG: " + weightMachineAdapter.getWeightInKg());
    }
}
