package org.tw.wallet;

import org.tw.exceptions.InvalidAmountException;

public class Wallet {
    private float balance;

    public Wallet() {
        this.balance = 0.0f;
    }

    public void add(float rupee) throws InvalidAmountException {

        if (rupee <= 0) {
            throw new InvalidAmountException();
        }
        this.balance = this.balance + rupee;
    }

    public float getBalance() {
        return balance;
    }
}
