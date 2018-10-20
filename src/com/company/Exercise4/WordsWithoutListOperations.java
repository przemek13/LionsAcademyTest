package com.company.Exercise4;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutListOperations {

    protected static List wordsWithoutList(String[] words, int len) {
        List<String> rightLengthWords = new ArrayList<String>();
        for (String word : words)
            if (word.length() != len) {
                rightLengthWords.add(word);
            }
        System.out.println(rightLengthWords);
        return rightLengthWords;
    }
}
