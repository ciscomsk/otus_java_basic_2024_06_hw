package ru.otus.hw.l_13;

import java.util.List;

public class Car extends MechanicalTransport {
    public Car(int fuelAmount, int fuelConsumption) {
        super(fuelAmount, fuelConsumption);
    }

    @Override
    protected String getVehicleType() {
        return "car";
    }

    @Override
    protected List<TerritoryTypes> getAvailableTerritories() {
        return List.of(TerritoryTypes.PLAIN);
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelAmount=" + fuelAmount +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
