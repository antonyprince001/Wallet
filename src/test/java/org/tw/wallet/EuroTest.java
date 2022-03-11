package org.tw.wallet;

import org.junit.jupiter.api.Test;
import org.tw.exceptions.InvalidAmountException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EuroTest {

    @Test
    void shouldAssertWhenOneRupeeIsComparedToPointZeroOneTwoEuros() throws InvalidAmountException {

        Euro pointZeroOneTwoEuro = new Euro(0.012f);
        Rupee oneRupee = new Rupee(1);

        assertEquals(pointZeroOneTwoEuro.convertToRupee(), oneRupee);
    }
}

