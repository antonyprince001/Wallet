package org.tw.wallet;

import org.junit.jupiter.api.Test;
import org.tw.exceptions.InvalidAmountException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class USDollarTest {

    @Test
    void shouldAssertEqualWhenSeventySixRupeeIsComparedToOneUSD() throws InvalidAmountException {

        USDollar oneUSDollar = new USDollar(1);
        Rupee seventySixRupee = new Rupee(76);

        assertEquals(oneUSDollar.convertToRupee(), seventySixRupee);

    }
}
