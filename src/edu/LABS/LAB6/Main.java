package edu.labs.LAB6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // 1

        Author author = new Author("Greta");
        System.out.println("Author: " + author.getStr());

        Week week = new Week(4);
        System.out.println("Day: " + week.getStr());

        Number number = new Number(new Random().nextInt(100));
        System.out.println("Random number: " + number.getStr());

        // 2

        System.out.println("Number in words: " + number.getStr(5));

        Word word = new Word();
        String someWord = word.getStr(5);
        System.out.println("Word: " + someWord);

        System.out.println("Reversed word" + word.getStr(someWord));

        LettersExtract letters = new LettersExtract();
        System.out.println("String without numbers: " + letters.getStr("f7ss67fz6saf"));

        Palindrom palindrom = new Palindrom();
        System.out.println(palindrom.getStr("Anna"));
    }
}
