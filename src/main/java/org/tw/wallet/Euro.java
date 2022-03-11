package org.tw.wallet;

import org.tw.exceptions.InvalidAmountException;

public class Euro {
    public static final float CONVERSION_RATE_EURO_RUPEE = 0.012f;
    private float value;

    public Euro(float value) throws InvalidAmountException {
        if (value < 0) {
            throw new InvalidAmountException();
        }
        this.value = value;
    }

    public Rupee convertToRupee() throws InvalidAmountException {
        return new Rupee(this.value / CONVERSION_RATE_EURO_RUPEE);
    }
}
