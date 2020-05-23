package edu.labs.LAB14.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Library {
    private static ExecutorService library = Executors.newFixedThreadPool(5); //5 books in the library

    public static void main(String[] args) {
        List<Book> books = Collections.synchronizedList(new ArrayList<>());
        books.add(new Book("Java Head First"));
        books.add(new Book("Кобзар"));
        books.add(new Book("Біблія"));
        books.add(new Book("Література 7 класс"));
        books.add(new Book("Енциклопедія"));

        long start = System.currentTimeMillis();

        for (int i = 0; i < 43; i++) {
            String readerName = "reader" + i;
            int numOfBook = new Random().nextInt(5);
            Reader reader = new Reader(readerName, books.get(numOfBook));
            library.submit(reader);
        }
        long finish = System.currentTimeMillis();

        library.shutdown();

    }
}
