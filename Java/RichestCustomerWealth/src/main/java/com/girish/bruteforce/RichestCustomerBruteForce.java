package com.girish.bruteforce;

public class RichestCustomerBruteForce {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int m;
        int n;

        if(accounts != null) {
            if (accounts.length > 0 && accounts[0] != null) {
                m = accounts.length;
                n = accounts[0].length;
                if (m <= 50 && (n > 0 && n <= 50)) {
                    System.out.println("Logic in action...");
                    maxWealth = 1;
                }
            }
        }
        return maxWealth;
    }
}
