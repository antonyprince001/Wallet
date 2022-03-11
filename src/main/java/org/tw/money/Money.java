package org.tw.money;

import org.tw.exceptions.InvalidAmountException;
import org.tw.wallet.Rupee;

import java.util.Objects;

public class Money {


    private final float value;
    private final Currency currency;

    private enum Currency {INR, USD, EURO}

    ;

    private Money(float value, Currency currency) throws InvalidAmountException {
        if (value < 0) {
            throw new InvalidAmountException();
        }
        this.value = value;
        this.currency = currency;
    }

    public static Money createRupee(float value) throws InvalidAmountException {

        return new Money(value, Currency.INR);
    }

    public Money add(Money anotherMoney) throws InvalidAmountException {
        return createRupee(value + anotherMoney.value);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        Money anotherMoney = (Money) obj;
        return value == anotherMoney.value;
    }

}
