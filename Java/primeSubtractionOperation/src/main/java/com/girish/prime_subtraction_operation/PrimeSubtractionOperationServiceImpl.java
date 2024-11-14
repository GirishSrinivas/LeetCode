package com.girish.prime_subtraction_operation;

import com.girish.utility.PrimeNumberGenerator;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeSubtractionOperationServiceImpl implements PrimeSubtractionOperationService{
    @Override
    public boolean primeSubOperation(int[] numbs) {
        List<Integer> primeNumbers = PrimeNumberGenerator.generatePrimeNumbers(1000);
        for (int i = 0; i < numbs.length; i++) {
            int number = numbs[i];
            List<Integer> primes = primeNumbers.stream()
                    .filter(n -> n < number).sorted(Collections.reverseOrder()).collect(Collectors.toList());
            if(i == 0) {
                numbs[i] = number - primes.get(0);
            } else {
                boolean isGreater = false;
                for (int prime : primes) {
                    if (numbs[i - 1] < number - prime) {
                        numbs[i] = number - prime;
                        isGreater = true;
                        break;
                    }
                }
                if(!isGreater) {
                    return false;
                }
            }
        }
        return true;
    }
}
