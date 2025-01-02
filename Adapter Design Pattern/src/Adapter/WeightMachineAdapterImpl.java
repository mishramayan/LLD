package Adapter;

import Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKgs() {
        double weightInPounds = weightMachine.getWeightInPounds();

        double weightInKg = weightInPounds * 0.45;
        return weightInKg;
    }
}
