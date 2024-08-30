package com.javaexamples.QandA;

import java.util.Scanner;

/*
* Write a program that takes a word from the user and prints it in reverse.
*/

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = scanner.nextLine();

        if (!word.isEmpty()) {
            for (int i = word.length() -1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
        }

        scanner.close();
    }
}
