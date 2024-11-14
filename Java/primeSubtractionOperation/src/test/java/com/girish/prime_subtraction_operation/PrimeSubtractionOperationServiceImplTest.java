package com.girish.prime_subtraction_operation;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeSubtractionOperationServiceImplTest {

    static PrimeSubtractionOperationService primeSubtractionOperationService;

    @BeforeAll
    static void initAll(){
        primeSubtractionOperationService = new PrimeSubtractionOperationServiceImpl();
    }

    @Test
    void primeSubOperationTestTrue_1() {
        assertTrue(primeSubtractionOperationService.primeSubOperation(new int[] {4,9,6,10}));
    }

    @Test
    void primeSubOperationTestFalse_1() {
        assertFalse(primeSubtractionOperationService.primeSubOperation(new int[] {5,8,3}));
    }

    @Test
    void primeSubOperationTestTrue_2() {
        assertTrue(primeSubtractionOperationService.primeSubOperation(new int[] {6,8,11,12}));
    }

    @Test
    void primeSubOperationTestFalse_2() {
        assertFalse(primeSubtractionOperationService.primeSubOperation(new int[] {2,2}));
    }

    @Test
    void primeSubOperationTestTrue_3() {
        assertTrue(primeSubtractionOperationService.primeSubOperation(new int[] {998,2}));
    }

    @Test
    void primeSubOperationTestTrue_4() {
        assertTrue(primeSubtractionOperationService.primeSubOperation(new int[] {5,5,4}));
    }

    @Test
    void primeSubOperationTestFalse_3() {
        assertFalse(primeSubtractionOperationService.primeSubOperation(new int[] {990,5}));
    }

    @Test
    void primeSubOperationTestTrue_5() {
        assertTrue(primeSubtractionOperationService.primeSubOperation(new int[] {5}));
    }

    @Test
    void primeSubOperationTestFalse_4() {
        assertFalse(primeSubtractionOperationService.primeSubOperation(null));
    }

    @Test
    void primeSubOperationTestFalse_5() {
        assertFalse(primeSubtractionOperationService.primeSubOperation(new int[]{}));
    }
}