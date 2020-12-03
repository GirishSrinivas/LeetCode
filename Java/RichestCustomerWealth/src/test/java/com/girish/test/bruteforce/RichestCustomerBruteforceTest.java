package com.girish.test.bruteforce;

import com.girish.bruteforce.RichestCustomerBruteForce;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RichestCustomerBruteforceTest {
    RichestCustomerBruteForce rcb = new RichestCustomerBruteForce();;

    @Test
    public void TestMaximumWealthNullCheck() {
        int[][] accounts = null;
        int result = rcb.maximumWealth(accounts);
        Assertions.assertEquals(0, result, "Test Passed!");
    }

}
