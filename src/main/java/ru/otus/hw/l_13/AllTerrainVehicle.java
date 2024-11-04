package ru.otus.hw.l_13;

import java.util.List;

public class AllTerrainVehicle extends MechanicalTransport {
    public AllTerrainVehicle(int fuelAmount, int fuelConsumption) {
        super(fuelAmount, fuelConsumption);
    }

    @Override
    protected String getVehicleType() {
        return "all-terrain vehicle";
    }

    @Override
    protected List<TerritoryTypes> getAvailableTerritories() {
        return List.of(TerritoryTypes.DENSE_FOREST, TerritoryTypes.PLAIN, TerritoryTypes.SWAMP);
    }

    @Override
    public String toString() {
        return "AllTerrainVehicle{" +
                "fuelAmount=" + fuelAmount +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
