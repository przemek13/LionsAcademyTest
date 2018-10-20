package com.company.Exercise1;

public class WordsCountDemo {

    public static void main(String[] args) {
        WordsCountOperations.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1);
        WordsCountOperations.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 3);
        WordsCountOperations.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 4);
    }
}
