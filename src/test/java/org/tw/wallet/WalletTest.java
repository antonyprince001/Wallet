package org.tw.wallet;

import org.junit.jupiter.api.Test;
import org.tw.exceptions.InvalidAmountException;
import org.tw.money.Money;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.tw.money.Money.createRupee;

public class WalletTest {

    @Test
    void shouldAddRupeeOfValueTenIntoWallet() throws InvalidAmountException {

        Wallet wallet = new Wallet();
        Money tenRupee = createRupee(10.0f);

        wallet.add(tenRupee);
        Money balance = wallet.getBalance();

        assertEquals(tenRupee, balance);
    }

    @Test
    void shouldNotAddRupeeAndThrowExceptionIfRupeeIsNegative() throws InvalidAmountException {

        Wallet wallet = new Wallet();

        assertThrows(InvalidAmountException.class, () -> wallet.add(createRupee(-10)));
    }
}
