package com.girish.bruteforce;

public class RichestCustomerBruteForce {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        if(accounts == null) {
            return maxWealth;
        } else {
            int m = accounts.length;
            int n = accounts[0].length;

            if(m > 50 && (n == 0 || n > 50)) {
                return maxWealth;
            } else {
                System.out.println("Logic in action...");
                maxWealth = 1;
            }
        }
        return maxWealth;
    }
}
