package com.girish.prime_subtraction_operation;

import com.girish.utility.PrimeNumberGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeSubtractionOperationServiceImpl implements PrimeSubtractionOperationService{
    private static final Logger LOG = LogManager.getLogger();
    @Override
    public boolean primeSubOperation(int[] numbs) {
        if (null == numbs || numbs.length == 0) {
            LOG.error("The input array is either null or empty!");
            return false;
        }
        List<Integer> primeNumbers = PrimeNumberGenerator.generatePrimeNumbers(1000);
        for (int i = 0; i < numbs.length; i++) {
            LOG.info("Selecting index: {}", i);
            LOG.info("Checking if the array is strictly sorted in increasing order...");
            if(checkSortingOrder(numbs)) {
                LOG.info("SUCCESS!... The array is strictly sorted in increasing order!");
                return true;
            }
            int number = numbs[i];
            LOG.info("Array value for index {} is: {}", i, number);
            List<Integer> primes = primeNumbers.stream().filter(n -> n < number).sorted(Collections.reverseOrder()).collect(Collectors.toList());
            LOG.info("List of Primes for number {} is: {}", number, primes);
            if(!primes.isEmpty()) {
                if(i ==0) {
                    LOG.info("updated array after prime subtraction is: {}", numbs);
                    numbs[i] = numbs[i] - primes.get(0);
                    continue;
                }
                for (int prime : primes) {
                    if ((numbs[i - 1] < numbs[i] - prime)) {
                        numbs[i] = numbs[i] - prime;
                        LOG.info("updated array after prime subtraction is: {}", numbs);
                        break;
                    }
                }
            }
        }
        LOG.error("FAIL!... The array is NOT strictly sorted in increasing order!");
        return false;
    }

    private boolean checkSortingOrder(int[] numbs) {
        for (int i = 0; i < numbs.length - 1; i++) {
            if (numbs[i] >= numbs[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
