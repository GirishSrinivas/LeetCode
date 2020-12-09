package com.girish.test.bruteforce;

import com.girish.bruteforce.RichestCustomerBruteForce;
import org.junit.jupiter.api.*;

public class RichestCustomerBruteforceTest {
    RichestCustomerBruteForce rcb = new RichestCustomerBruteForce();

    @BeforeAll
    public static void initAll() {
        System.out.println("Before All test cases...");
    }

    @BeforeEach
    public void init() {
        System.out.println("Before test case...");
    }

    /**
     * This test checks if the 2D array passed has null value
     */
    @Test
    public void TestMaximumWealthNullCheck() {
        System.out.println("TestMaximumWealthNullCheck()");
        int result = rcb.maximumWealth(null);
        Assertions.assertEquals(0, result, "Test Passed!");
    }

    /**
     * This test checks for NullPointerException for the second dimension of the 2D array
     */
    @Test
    public void TestMaximumWealthColNullCheck() {
        System.out.println("TestMaximumWealthColNullCheck()");
        int[][] accounts = new int[5][];
        int result = rcb.maximumWealth(accounts);
        Assertions.assertEquals(0, result, "Test Passed!");
    }

    /**
     * This condition checks for the boundary conditions
     * where the size of the 2D array is within the size 50
     */
    @Test
    public void TestMaximumWealthWithinBoundaryCheck() {
        System.out.println("TestMaximumWealthWithinBoundaryCheck()");
        int[][] accounts = new int[50][50];
        int result = rcb.maximumWealth(accounts);
        Assertions.assertEquals(1, result, "Test Passed!");
    }

    /**
     * This test checks for Boundary conditions
     * where the size of 2D array should not exceed 50
     */
    @Test
    public void TestMaximumWealthMaxBoundaryCheck() {
        System.out.println("TestMaximumWealthMaxBoundaryCheck()");
        int[][] accounts = new int[51][51];
        int result = rcb.maximumWealth(accounts);
        Assertions.assertEquals(0, result, "Test Passed!");
    }

    /**
     * This test checks for ArrayIndexOutOfBoundsException
     * where the 2D array size should not be below 1
     */
    @Test
    public void TestMaximumWealthMinBoundaryCheck() {
        System.out.println("TestMaximumWealthMinBoundaryCheck()");
        int[][] accounts = new int[0][0];
        int result = rcb.maximumWealth(accounts);
        Assertions.assertEquals(0, result, "Test Passed!");
    }

    /**
     * This test is used to check the miscellaneous boundary conditions
     * we are not using accounts = new int[0][1]; because this will
     * results in ArrayIndexOutOfBoundsException which is checked in the
     * previous test case
     */
    @Test
    public void TestMaximumWealthMiscBoundaryCheck() {
        System.out.println("TestMaximumWealthMiscBoundaryCheck()");
        int[][] accounts = new int[1][0];
        int result = rcb.maximumWealth(accounts);
        Assertions.assertEquals(0, result, "Test Passed!");
    }

    @AfterEach
    public void tearDownEach() {
        System.out.println("Teardown Test...");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.println("After all test cases...");
    }
}
