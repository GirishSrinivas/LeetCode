package com.girish.utility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PrimeNumberGeneratorTest {

    @Test
    void successPrimilatyTestBasedOnRangeOfPrimeNumbersGenerated() {
        List<Integer> primeNumbers = PrimeNumberGenerator.generatePrimeNumbers(2);
        Assertions.assertTrue(checkPrime(primeNumbers));
    }

    @Test
    void successPrimilatyTestOnHighestPossibleRangeOfPrimeNumbersGenerated() {
        List<Integer> primeNumbers = PrimeNumberGenerator.generatePrimeNumbers(1000);
        Assertions.assertTrue(checkPrime(primeNumbers));
    }

    @Test
    void primeTestWhenLowestRangeLimitSpecifiedForPrimeNumberGeneration() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> PrimeNumberGenerator.generatePrimeNumbers(1));

        String expectedMessage = "There are no Prime numbers below the number 1 and the program does not generate prime numbers above 1000 please try to enter a number between 2 - 1000";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void primeTestWhenHighestRangeLimitSpecifiedForPrimeNumberGeneration() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> PrimeNumberGenerator.generatePrimeNumbers(2000));

        String expectedMessage = "There are no Prime numbers below the number 1 and the program does not generate prime numbers above 1000 please try to enter a number between 2 - 1000";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    private boolean checkPrime(List<Integer> primeNumbers) {
        if(primeNumbers.isEmpty()) {
            return false;
        }

        for(int isPrime : primeNumbers) {
            if (isPrime <= 1) {
                return false;
            }
            for(int i = 2; i <= (int)Math.sqrt(isPrime); i++) {
                if(isPrime % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
