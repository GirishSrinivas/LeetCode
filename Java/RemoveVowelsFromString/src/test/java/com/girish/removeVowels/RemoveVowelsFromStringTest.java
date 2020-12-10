package com.girish.removeVowels;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveVowelsFromStringTest {
    RemoveVowelsFromString rvfs = new RemoveVowelsFromString();

    @Test
    void removeVowelsNullCheck() {
        System.out.println("removeVowelsNullCheck()");
        String actualString = rvfs.removeVowels(null);
        String expectedString = "";
        Assertions.assertEquals(expectedString, actualString);
    }

    @Test
    void removeVowelsOutOfBoundCheck() {
        System.out.println("removeVowelsNullCheck()");
        String inputString = "Sq6gYTYpmmcMWy8pRG6FuDoGErBUCKADSwSihQmFBhOqviH2cq1cqNxtcOuMq0Uv722c735cNruliuLTaJe6x" +
                             "tZToRfCBFK4Ndf4VITpnmrWzsDx78xZmg5dqGeoOSqs4xHJpQV1EAbAEMg6VEaSzXRkAyArmEoShikYJinZT2" +
                             "CGJJDbJDDVFqxyrQI33IWeANZ6dAJ0ptIlPjm5I8z9t04BE72herijolt0878QEHgKAxjRIlK5UJnmafO3XVC" +
                             "wB78eYfVGMFSCLnSZZgJZOr6n204RBwrbKYI37NlG99UaV30Un6O832NpAyBMoDnxYSoyq98p5GzoppxscwPe" +
                             "JXJ1mm59Qo19rbyfymsfWtfJiY5WCBzvzAYuIhuiznYth9qeITHYXbpKpia7YFWgtKDr9D4kGOd2KPe6sz4Cn" +
                             "XFlFB2OWOCgpRUMJsRCyGUjTNF38HAKe6abODDj7OQVRr8uRJJI3bx8LHfQTAdW0aZs4fKDa8h4nOhKin3VwV" +
                             "n9iDpqbliB0xtgBJp5RkC1eBKFndRQmAS0mLwX1wBpSjIVtbxNHqxwMLhjg8RKJzOdISIa78PHe5d7V6BSi34" +
                             "ujaWVZLADpT8MhAr1IKRSbejRU1eCUu38uRzE0QqkrxBNQ4MNJZ4JwREqZjEgPtdJ2qHINxbErWR7Q5c1Or8L" +
                             "3cheBbZKsEWfY8dsXCkHzcfShKrf9AJMKkhNKCGSqKvz1ZSRfVwzZPfiOdCR9XgUzLmPD04IbsX6jfm3gvQnb" +
                             "si3mfFz8kF5seqBRbIgq17GbcOMjYWSsUM2edasTCQPhwBaEXn1gUbBCcStU76d00xEXIzmpsY07OpwdMyrw6" +
                             "VQv4TR4UCR9JsSI5fVlxvEhlcetehRbPbrIROVvvHpiv5TWI1ruXmpL9aAqnPJEqyaILuptMK4HZdzw39zJXA" +
                             "367zqSqdmB95CV1LXg0mkgYv6k4TA0KZ0EQN3iERafroUqVOAZU92cUzdhAqeS5tRG";
        String actualString = rvfs.removeVowels(inputString);
        String expectedString = "";
        Assertions.assertEquals(expectedString, actualString);
    }

    @Test
    public void removeVowelsString() {
        System.out.println("removeVowelsString()");
        String inputString = "welcome to geeksforgeeks";
        String actualString = rvfs.removeVowels(inputString);
        String expectedString = "wlcm t gksfrgks";
        Assertions.assertEquals(expectedString, actualString);
    }
}