package org.tw.money;

import org.junit.jupiter.api.Test;
import org.tw.exceptions.InvalidAmountException;

import static org.junit.jupiter.api.Assertions.*;
import static org.tw.money.Money.*;


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

    @Test
    void shouldAssertEqualWhenSeventySixRupeesComparedToOneDollar() throws InvalidAmountException {

        Money oneDollar = createDollar(1);
        Money seventySixRupee = createRupee(76);

        assertEquals(oneDollar, seventySixRupee);
    }

    @Test
    void shouldAssertEqualWhenOneRupeeIsComparedToPointZeroOneTwoEuro() throws InvalidAmountException {

        Money oneRupee = createRupee(1);
        Money pointZeroOneTwoEuro = createEuro(0.012f);

        assertEquals(oneRupee, pointZeroOneTwoEuro);
    }

    @Test
    void shouldReturnSeventySevenRupeeWhenOneDollarAndOneRupeeIsAdded() throws InvalidAmountException {

        Money oneRupee = createRupee(1);
        Money oneDollar = createDollar(1);

        Money resultRupee = oneDollar.add(oneRupee);

        assertEquals(createRupee(77), resultRupee);
    }

    @Test
    void shouldReturnSeventyFiveRupeeWhenOneRupeeIsSubtractedFromOneDollar() throws InvalidAmountException {

        Money oneRupee = createRupee(1);
        Money oneDollar = createDollar(1);

        Money resultRupee = oneDollar.subtract(oneRupee);

        assertEquals(createRupee(75), resultRupee);
    }

    @Test
    void shouldConvertSeventySixRupeeToOneDollar() throws InvalidAmountException {
        Money seventySixRupee = createRupee(76);
        Money oneDollar = createDollar(1);

        Money convertedToDollar = seventySixRupee.convertTo(Currency.USD);

        assertEquals(oneDollar,convertedToDollar);
    }
}
