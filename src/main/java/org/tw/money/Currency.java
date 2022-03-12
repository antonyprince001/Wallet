package org.tw.money;

public enum Currency {
    INR(1),
    USD(76),

    private final float baseFactor;

    Currency(float baseFactor) {
        this.baseFactor = baseFactor;
    }

    public float convertToBaseValue(float value) {
        return value * this.baseFactor;
    }
};

