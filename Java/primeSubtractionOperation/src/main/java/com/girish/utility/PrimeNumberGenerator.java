package com.girish.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class PrimeNumberGenerator {
    private static final Logger log = LogManager.getLogger();
    static List<Integer> primeNumbers = new ArrayList<>();

    private PrimeNumberGenerator() {}

    public static List<Integer> generatePrimeNumbers(int limit) throws IllegalArgumentException {
        log.info("Entered input limit for generating prime numbers is: {}", limit);
        log.info("NOTE: Given range to generate prime numbers are between 1 - 1000!");
        log.info("Checking limit range....");
        if (limit <= 1 || limit > 1000) {
            log.error("Limit range failed!");
            String errorMsg = "There are no Prime numbers below the number 1 and the program does not generate prime numbers above 1000 please try to enter a number between 2 - 1000";
            throw new IllegalArgumentException(errorMsg);
        } else {
            log.info("Limit range passed!");
            log.info("Generating Prime Numbers for limit {}...", limit);

            if(limit == 2) {
                primeNumbers.add(2);
                log.info("Prime numbers for limit: {} is: {}", limit, primeNumbers);
                return primeNumbers;
            }

            boolean[] isPrime = new boolean[limit];

            Arrays.fill(isPrime, 2, isPrime.length, true);

            for (int i = 2; i <= ((int) Math.sqrt(limit)); i++) {
                if (isPrime[i]) {
                    for (int j = i*i; j < limit; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            primeNumbers = IntStream.range(0,isPrime.length)
                    .filter(i -> isPrime[i])
                    .boxed()
                    .collect(Collectors.toList());
            log.info("Prime numbers for limit: {} is: {}", limit, primeNumbers);
        }

        return primeNumbers;
    }

}
