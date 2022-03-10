package org.tw.wallet;

import org.tw.exceptions.InvalidAmountException;

public class Rupee {
    private final float value;

    public Rupee(float value) throws InvalidAmountException {
        if (value < 0) {
            throw new InvalidAmountException();
        }
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public Rupee add(Rupee rupee) throws InvalidAmountException {
        return new Rupee(this.value + rupee.getValue());
    }
}
