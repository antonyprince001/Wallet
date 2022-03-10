package org.tw.wallet;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class WalletTest {

    @Test
    void shouldReturnTrueIfTenRupeesAddedIntoWallet() {

        Wallet wallet = new Wallet();

        boolean status = wallet.addMoney(10);

        assertThat(status, is(true));
    }
}
