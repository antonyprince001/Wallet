package org.tw.wallet;

import org.junit.jupiter.api.Test;
import org.tw.exceptions.InvalidAmountException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WalletTest {

    @Test
    void shouldAddRupeeOfValueTenIntoWallet() throws InvalidAmountException {

        Wallet wallet = new Wallet();
        Rupee rupee = new Rupee(10.0f);

        wallet.add(rupee);
        Rupee balance = wallet.getBalance();

        assertEquals(new Rupee(10.0f), balance);
    }

    @Test
    void shouldNotAddRupeeAndThrowExceptionIfRupeeIsNegative() throws InvalidAmountException {

        Wallet wallet = new Wallet();

        assertThrows(InvalidAmountException.class, () -> wallet.add(new Rupee(-10)));
    }
}
