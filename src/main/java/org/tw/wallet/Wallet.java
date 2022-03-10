package org.tw.wallet;

public class Wallet {
    private float balance;

    public Wallet() {
        this.balance = 0.0f;
    }

    public void add(Rupee rupee) {

        this.balance = this.balance + rupee.getValue();
    }

    public float getBalance() {
        return this.balance;
    }
}
