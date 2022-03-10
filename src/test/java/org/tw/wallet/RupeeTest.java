package org.tw.wallet;

import org.junit.jupiter.api.Test;
import org.tw.exceptions.InvalidAmountException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class RupeeTest {

    @Test
    void shouldReturnTenRupeeWhenSixRupeeAndFourRupeeAreAdded() throws InvalidAmountException {

        Rupee rupee = new Rupee(6);
        Rupee anotherRupee = new Rupee(4);

        Rupee resultRupee = rupee.add(anotherRupee);

        assertThat(resultRupee.getValue(), is(10.0f));
    }

    @Test
    void shouldAssertNotSameWhenOneTenRupeeIsComparedToAnotherTenRupee() throws InvalidAmountException {

        Rupee tenRupee = new Rupee(10.0f);
        Rupee anotherTenRupee = new Rupee(10.0f);

        assertNotSame(tenRupee,anotherTenRupee);
    }


}
