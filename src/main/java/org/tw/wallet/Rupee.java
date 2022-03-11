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

    public Rupee add(Rupee rupee) throws InvalidAmountException {
        return new Rupee(this.value + rupee.value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != Rupee.class)) {
            return false;
        }
        Rupee anotherRupee = (Rupee) obj;
        return this.value == anotherRupee.value;
    }
}
