package org.tw.wallet;

import org.junit.jupiter.api.Test;
import org.tw.exceptions.InvalidAmountException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RupeeTest {

    @Test
    void shouldReturnTenRupeeWhenSixRupeeAndFourRupeeAreAdded() throws InvalidAmountException {

        Rupee rupee = new Rupee(6);
        Rupee anotherRupee = new Rupee(4);

        Rupee resultRupee = rupee.add(anotherRupee);

        assertThat(resultRupee.getValue(), is(10.0f));
    }

}
