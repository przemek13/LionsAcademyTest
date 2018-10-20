package com.company.Exercise2;

public class WordsFrontOperations {
    protected static String[] wordsFront(String[] words, int n) {
        String[] trimmedWords = new String[n];
        for (int i = 0; i < n; i++) {
            trimmedWords[i] = words[i];
            System.out.print(trimmedWords[i]);
        }
        return trimmedWords;
    }
}
