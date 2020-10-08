package edu.labs.LAB14.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Library {
    //private static ExecutorService library = Executors.newFixedThreadPool(5); //5 books in the library

    public static void main(String[] args) {
        List<Book> books = getListOfBooks();

        Reader reader1 = new Reader("Lyosha");
        reader1.takeOneMoreBook(books.get(0));
        reader1.takeOneMoreBook(books.get(1));
        reader1.takeOneMoreBook(books.get(2));
        reader1.takeOneMoreBook(books.get(3));

        Reader reader2 = new Reader("Misha");
        reader2.takeOneMoreBook(books.get(0));
        reader2.takeOneMoreBook(books.get(1));
        reader2.takeOneMoreBook(books.get(4));

        Thread thread1 = new Thread(reader1);
        Thread thread2 = new Thread(reader2);

        thread1.start();
        thread2.start();
    }

    private static List<Book> getListOfBooks() {
        List<Book> books = Collections.synchronizedList(new ArrayList<>());
        books.add(new Book("Java Head First", 11));
        books.add(new Book("Кобзар", 17));
        books.add(new Book("Біблія", 13));
        books.add(new Book("Література 7 класс", 21));
        books.add(new Book("Енциклопедія", 23));
        books.add(new Book("Java Philosophy", 10));
        return books;
    }

//    private static void example1() {
//        List<Book> books = getListOfBooks();
//
//        long start = System.currentTimeMillis();
//
//        for (int i = 0; i < 43; i++) {
//            String readerName = "reader" + i;
//            int numOfBook = new Random().nextInt(5);
//            Reader reader = new Reader(readerName);
//            library.submit(reader);
//        }
//        long finish = System.currentTimeMillis();
//
//        library.shutdown();
//    }
}
