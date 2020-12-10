package com.girish.bruteforce;

public class RichestCustomerBruteForce {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        if(accounts != null) {
            if (accounts.length > 0 && accounts[0] != null) {
                if (accounts.length <= 50
                        && (accounts[0].length > 0
                            && accounts[0].length <= 50)) {
                    for (int[] account : accounts) {
                        int sum = 0;
                        for (int wealth : account) {
                            sum += wealth;
                        }
                        maxWealth = (maxWealth >= sum) ? maxWealth : sum;
                    }
                }
            }
        }
        return maxWealth;
    }
}
