package ru.otus.hw.l_13;

import java.util.List;

abstract class MechanicalTransport implements Movable {
    protected int fuelAmount;
    protected int fuelConsumption;

    public MechanicalTransport(int fuelAmount, int fuelConsumption) {
        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    protected abstract String getVehicleType();

    protected abstract List<TerritoryTypes> getAvailableTerritories();

    @Override
    public boolean move(int distance, TerritoryTypes territory) {
        String transportType = getVehicleType();

        if (!getAvailableTerritories().contains(territory)) {
            System.out.println(transportType + " can only drive on " + TerritoryTypes.PLAIN);
            return false;
        }

        if (fuelAmount == 0) {
            System.out.println("No fuel");
            return false;
        }

        int fuelLoss = distance * fuelConsumption;
        if (fuelLoss > fuelAmount) {
            float distanceBeforeFuelOut = (float) fuelAmount / fuelConsumption;
            fuelAmount = 0;
            System.out.println("You drove " + transportType + " a distance of " + distanceBeforeFuelOut + "km out of " + distance + "km. Fuel has run out");
            return false;
        }

        fuelAmount -= fuelLoss;
        System.out.println("You drove " + transportType + " a distance of " + distance + "km. Remaining fuel: " + fuelAmount);
        return true;
    }
}
