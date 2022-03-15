package org.tw.wallet;

import org.tw.exceptions.InvalidAmountException;
import org.tw.money.Currency;
import org.tw.money.Money;

import static org.tw.money.Money.createRupee;

public class Wallet {
    private Money balance;

    public Wallet() throws InvalidAmountException {
        this.balance = createRupee(0);
    }

    public void add(Money money) throws InvalidAmountException {
        this.balance = this.balance.add(money);
    }

    public Money getBalance(Currency currency) throws InvalidAmountException {
        return this.balance.convertTo(currency);
    }

    public void retrieve(Money money) throws InvalidAmountException {
        this.balance = this.balance.subtract(money);
    }
}
