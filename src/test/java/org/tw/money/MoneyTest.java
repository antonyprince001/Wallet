package org.tw.money;

import org.junit.jupiter.api.Test;
import org.tw.exceptions.InvalidAmountException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.tw.money.Money.createRupee;


public class MoneyTest {

    @Test
    void shouldReturnTenRupeeWhenSixRupeeAndFourRupeeAreAdded() throws InvalidAmountException {

        Money rupee = createRupee(6);
        Money anotherRupee = createRupee(4);

        Money resultRupee = rupee.add(anotherRupee);

        assertEquals(createRupee(10.0f), resultRupee);
    }

    @Test
    void shouldAssertNotSameWhenOneTenRupeeIsComparedToAnotherTenRupee() throws InvalidAmountException {

        Money tenRupee = createRupee(10.0f);
        Money anotherTenRupee = createRupee(10.0f);

        assertNotSame(tenRupee, anotherTenRupee);
    }


}
