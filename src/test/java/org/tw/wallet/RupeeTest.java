package org.tw.wallet;

import org.junit.jupiter.api.Test;
import org.tw.exceptions.InvalidAmountException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class RupeeTest {

    @Test
    void shouldReturnTenRupeeWhenSixRupeeAndFourRupeeAreAdded() throws InvalidAmountException {

        Rupee rupee = new Rupee(6);
        Rupee anotherRupee = new Rupee(4);

        Rupee resultRupee = rupee.add(anotherRupee);

        assertEquals(new Rupee(10.0f), resultRupee);
    }

    @Test
    void shouldAssertNotSameWhenOneTenRupeeIsComparedToAnotherTenRupee() throws InvalidAmountException {

        Rupee tenRupee = new Rupee(10.0f);
        Rupee anotherTenRupee = new Rupee(10.0f);

        assertNotSame(tenRupee, anotherTenRupee);
    }

    @Test
    void shouldAssertEqualWhenOneTenRupeeIsComparedToAnotherTenRupee() throws InvalidAmountException {

        Rupee tenRupee = new Rupee(10.0f);
        Rupee anotherTenRupee = new Rupee(10.0f);

        assertEquals(tenRupee, anotherTenRupee);
    }

    @Test
    void shouldAssertNotEqualWhenTenRupeeIsComparedToNull() throws InvalidAmountException {

        Rupee tenRupee = new Rupee(10.0f);

        assertNotEquals(tenRupee, null);
    }

    @Test
    void shouldAssertNotEqualWhenTenRupeeIsComparedToAnotherType() throws InvalidAmountException {

        Rupee tenRupee = new Rupee(10.0f);

        assertNotEquals(tenRupee, new Object());
    }
}
