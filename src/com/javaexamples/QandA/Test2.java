package com.javaexamples.QandA;

/*
Problem: Word Frequency Counter

Description: Write a Java program that reads a text file and counts the frequency of each word in
the file. The program should then print out each word along with its frequency, sorted by the
frequency in descending order. If two words have the same frequency, they should be sorted alphabetically.

Requirements:
1) Ignore case when counting word frequencies (e.g., "Word" and "word" should be considered the same).
2) Ignore punctuation and special characters.
3) The program should handle large text files efficiently.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        String fileName = "src/com/javaexamples/QandA/Resources/input.txt"; // Replace with your file path
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z\\s]", "");
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort the map by value (frequency) and then by key (word)
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCountMap.entrySet());
        sortedList.sort((entry1, entry2) -> {
            int freqCompare = entry2.getValue().compareTo(entry1.getValue());
            if (freqCompare == 0) {
                return entry1.getKey().compareTo(entry2.getKey());
            }
            return freqCompare;
        });

        // Print the sorted word frequencies
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
