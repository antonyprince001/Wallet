package org.tw.wallet;

import org.junit.jupiter.api.Test;
import org.tw.exceptions.InvalidAmountException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EuroTest {

    @Test
    void shouldAssertWhenOneRupeeIsComparedToEquivalentEuros() throws InvalidAmountException {

        Euro euro = new Euro(0.012f);
        Rupee oneRupee = new Rupee(1);

        assertEquals(euro.convertToRupee(), oneRupee);
    }
}

