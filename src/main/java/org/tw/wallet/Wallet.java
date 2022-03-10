package org.tw.wallet;

public class Wallet {
    private float money;

    public boolean addMoney(float money) {
        this.money += money;
        return true;
    }
}
