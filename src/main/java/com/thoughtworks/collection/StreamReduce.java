package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public StreamReduce() {
    }

    public int getLastOdd(List<Integer> numbers) {
        return numbers
                .stream()
                .reduce(0, (firstNum, secNum) -> secNum % 2 != 0 ? secNum : firstNum);
    }


    public String getLongest(List<String> words) {
        return words
                .stream()
                .reduce("", (firstWord, secondWord) -> secondWord.length() > firstWord.length()
                        ? secondWord : firstWord);
    }

    public int getTotalLength(List<String> words) {
        return words
                .stream()
                .map(String::length)
                .reduce(0, Integer::sum);
    }
}
