package org.tw.money;

import org.tw.exceptions.InvalidAmountException;

import java.util.Objects;

public class Money {

    private final float value;
    private final Currency currency;

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

    public static Money createDollar(float value) throws InvalidAmountException {
        return new Money(value, Currency.USD);
    }

    public static Money createEuro(float value) throws InvalidAmountException {
        return new Money(value, Currency.EURO);
    }

    public Money add(Money anotherMoney) throws InvalidAmountException {
        return createRupee(currency.convertToBaseValue(this.value) + anotherMoney.currency.convertToBaseValue(anotherMoney.value));
    }

    public Money subtract(Money anotherMoney) throws InvalidAmountException {
        return createRupee(currency.convertToBaseValue(this.value) - anotherMoney.currency.convertToBaseValue(anotherMoney.value));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != Money.class) {
            return false;
        }
        Money anotherMoney = (Money) obj;
        return currency.convertToBaseValue(this.value) == anotherMoney.currency.convertToBaseValue(anotherMoney.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, currency);
    }

}
