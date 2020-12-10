package com.girish.removeVowels;

import java.util.ArrayList;

public class RemoveVowelsFromString {
    public String removeVowels (String s) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        if (s != null && s.length() <= 1000) {
            for (int i = 0; i < s.length(); i++) {
                char letter = s.charAt(i);
                if (!vowels.contains(letter)) {
                    stringBuilder.append(letter);
                }
            }
        }
        return stringBuilder.toString();
    }
}
