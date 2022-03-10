package org.tw.wallet;

import org.tw.exceptions.InvalidAmountException;

public class Wallet {
    private float money;

    public boolean addMoney(float money) throws InvalidAmountException {

        if (money <= 0) {
            throw new InvalidAmountException();
        }
        this.money += money;
        return true;
    }
}
