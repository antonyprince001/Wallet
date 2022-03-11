package org.tw.money;

import org.junit.jupiter.api.Test;
import org.tw.exceptions.InvalidAmountException;

import static org.junit.jupiter.api.Assertions.*;
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

    @Test
    void shouldAssertEqualWhenOneTenRupeeIsComparedToAnotherTenRupee() throws InvalidAmountException {

        Money tenRupee = createRupee(10.0f);
        Money anotherTenRupee = createRupee(10.0f);

        assertEquals(tenRupee, anotherTenRupee);
    }

    @Test
    void shouldAssertNotEqualWhenTenRupeeIsComparedToNull() throws InvalidAmountException {

        Money tenRupee = createRupee(10.0f);

        assertNotEquals(tenRupee, null);
    }

    @Test
    void shouldAssertNotEqualWhenTenRupeeIsComparedToAnotherType() throws InvalidAmountException {

        Money tenRupee = createRupee(10.0f);

        assertNotEquals(tenRupee, new Object());
    }

    @Test
    void shouldAssertEqualWhenTenRupeeIsComparedWithAdditionOfSevenRupeeAndThreeRupee() throws InvalidAmountException {

        Money tenRupee = createRupee(10.0f);
        Money sevenRupee = createRupee(7.0f);
        Money threeRupee = createRupee(3.0f);

        assertEquals(tenRupee, sevenRupee.add(threeRupee));
    }


}
