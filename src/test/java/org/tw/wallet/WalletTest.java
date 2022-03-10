package org.tw.wallet;

import org.junit.jupiter.api.Test;
import org.tw.exceptions.InvalidAmountException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WalletTest {

    @Test
    void shouldReturnTrueIfTenRupeesAddedIntoWallet() throws InvalidAmountException {

        Wallet wallet = new Wallet();

        boolean status = wallet.addMoney(10);

        assertThat(status, is(true));
    }

    @Test
    void shouldNotAddMoneyAndThrowExceptionIfMoneyIsNegativeOrZero() {

        Wallet wallet = new Wallet();

        assertThrows(InvalidAmountException.class, () -> {
            wallet.addMoney(-10);
        });
    }
}
