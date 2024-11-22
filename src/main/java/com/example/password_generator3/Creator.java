package com.example.password_generator3;

import java.util.Scanner;

public class Creator {
    private Letters letters;
    public static Scanner keyboard;


    public Creator(boolean IncludeUpper, boolean IncludeLower, boolean IncludeNum, boolean IncludeSym) {
        letters = new Letters(IncludeUpper, IncludeLower, IncludeNum, IncludeSym);
    }


    public Password GeneratePassword(int length) {
        final StringBuilder pass = new StringBuilder("");

        final int alphabetLength = letters.getAlphabet().length();

        int max = alphabetLength - 1;
        int min = 0;
        int range = max - min + 1;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * range) + min;
            pass.append(letters.getAlphabet().charAt(index));
        }

        return new Password(pass.toString());
    }




}