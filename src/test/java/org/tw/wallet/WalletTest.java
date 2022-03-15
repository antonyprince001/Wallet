package org.tw.wallet;

import org.junit.jupiter.api.Test;
import org.tw.exceptions.InvalidAmountException;
import org.tw.money.Currency;
import org.tw.money.Money;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.tw.money.Money.createDollar;
import static org.tw.money.Money.createRupee;

public class WalletTest {

    @Test
    void shouldAddTenRupeeIntoWallet() throws InvalidAmountException {

        Wallet wallet = new Wallet();
        Money tenRupee = createRupee(10.0f);

        wallet.add(tenRupee);
        Money balance = wallet.getBalance(Currency.INR);

        assertEquals(tenRupee, balance);
    }

    @Test
    void shouldNotAddRupeeIntoWalletIfRupeeIsNegative() throws InvalidAmountException {

        Wallet wallet = new Wallet();

        assertThrows(InvalidAmountException.class, () -> wallet.add(createRupee(-10)));
    }


    @Test
    void shouldRetrieveTenRupeeFromWallet() throws InvalidAmountException {

        Wallet wallet = new Wallet();
        Money oneRupee = createRupee(1);
        Money oneDollar = createDollar(1);
        Money tenRupee = createRupee(10);
        wallet.add(oneRupee);
        wallet.add(oneDollar);
        Money initialBalance = wallet.getBalance(Currency.INR);

        wallet.retrieve(tenRupee);
        Money updatedBalance = wallet.getBalance(Currency.INR);

        assertEquals(initialBalance.subtract(updatedBalance), createRupee(10));
    }

    @Test
    void shouldReturnTotalMoneyInWalletInCurrencyTypeRupee() throws InvalidAmountException {

        Wallet wallet = new Wallet();
        Money fiftyRupee = createRupee(50);
        Money oneDollar = createDollar(1);
        wallet.add(fiftyRupee);
        wallet.add(oneDollar);

        Money balance = wallet.getBalance(Currency.INR);

        assertEquals(balance, createRupee(126));
    }

    @Test
    void shouldReturnTotalMoneyInCurrencyTypeDollar() throws InvalidAmountException {

        Wallet wallet = new Wallet();
        Money firstRupee = createRupee(78.85f);
        Money oneDollar = createDollar(1);
        Money secondRupee = createRupee(149.15f);
        wallet.add(firstRupee);
        wallet.add(oneDollar);
        wallet.add(secondRupee);

        Money balance = wallet.getBalance(Currency.USD);

        assertEquals(balance, createDollar(4));
    }
}
