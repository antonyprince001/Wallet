package org.tw.wallet;

import org.tw.exceptions.InvalidAmountException;

public class USDollar {
    private static final float CONVERSION_RATE_USD_RUPEE = 76;
    private final float value;

    public USDollar(float value) throws InvalidAmountException {
        if (value < 0) {
            throw new InvalidAmountException();
        }
        this.value = value;
    }

    public Rupee convertToRupee() throws InvalidAmountException {
        return new Rupee(this.value * CONVERSION_RATE_USD_RUPEE);
    }

}
