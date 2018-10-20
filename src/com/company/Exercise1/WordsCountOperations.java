package com.company.Exercise1;

public class WordsCountOperations {
    protected static int wordsCount(String[] words, int len) {
        int counter = 0;
        for (String word : words) {
            if (word.length() == len) {
                counter += 1;
            }
        }
        System.out.println(counter);
        return counter;
    }
}
