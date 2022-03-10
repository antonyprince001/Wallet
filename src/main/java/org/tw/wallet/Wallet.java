package org.tw.wallet;

import org.tw.exceptions.InvalidAmountException;

public class Wallet {
    private Rupee balance;

    public Wallet() throws InvalidAmountException {
        this.balance = new Rupee(0.0f);
    }

    public void add(Rupee rupee) throws InvalidAmountException {

        this.balance = this.balance.add(rupee);
    }

    public float getBalance() {
        return this.balance.getValue();
    }
}
