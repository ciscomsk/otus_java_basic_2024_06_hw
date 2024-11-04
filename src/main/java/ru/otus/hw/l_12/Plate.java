package ru.otus.hw.l_12;

public class Plate {
    private final int capacity;
    private int currentAmount;

    public Plate(int capacity) {
        this.capacity = capacity;
        this.currentAmount = capacity;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    // https://github.com/ciscomsk/otus_java_basic_2023_06_hw/pull/6#discussion_r1341947110
    // ? нужна ли валидация amount
    public void fill(int amount) {
        if (currentAmount + amount > capacity) {
            currentAmount = capacity;
        } else {
            currentAmount += amount;
        }
    }

    // https://github.com/ciscomsk/otus_java_basic_2023_06_hw/pull/6#discussion_r1341947128
    // ? нужна ли валидация units
    public boolean reduceAmount(int units) {
        if (units > currentAmount) {
            return false;
        } else {
            currentAmount -= units;
            return true;
        }
    }
}
