package org.tw.wallet;

import org.junit.jupiter.api.Test;
import org.tw.exceptions.InvalidAmountException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WalletTest {

    @Test
    void shouldAddRupeeOfValueTenIntoWallet() throws InvalidAmountException {

        Wallet wallet = new Wallet();
        Rupee rupee = new Rupee(10.0f);

        wallet.add(rupee);
        float balance = wallet.getBalance();

        assertThat(balance, is(10.0f));
    }

    @Test
    void shouldNotAddRupeeAndThrowExceptionIfRupeeIsNegativeOrZero() {

        Wallet wallet = new Wallet();

        assertThrows(InvalidAmountException.class, () -> wallet.add(new Rupee(-10)));
    }
}
