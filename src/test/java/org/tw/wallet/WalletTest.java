package org.tw.wallet;

import org.junit.jupiter.api.Test;
import org.tw.exceptions.InvalidAmountException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WalletTest {

    @Test
    void shouldAddTenRupeesIntoWallet() throws InvalidAmountException {

        Wallet wallet = new Wallet();

        wallet.add(10);
        float balance = wallet.getBalance();

        assertThat(balance, is(10.0f));
    }

    @Test
    void shouldNotAddMoneyAndThrowExceptionIfMoneyIsNegativeOrZero() {

        Wallet wallet = new Wallet();

        assertThrows(InvalidAmountException.class, () -> wallet.add(-10));
    }
}
