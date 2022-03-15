package org.tw.money;

public enum Currency {
    INR(1),
    USD(76),
    EURO(1 / 0.012f);

    private final float baseFactor;

    Currency(float baseFactor) {
        this.baseFactor = baseFactor;
    }

    public float convertToBaseValue(float value) {
        return value * this.baseFactor;
    }

    public float convertToPreferredValue(float value) {
        return value / this.baseFactor;
    }
};

