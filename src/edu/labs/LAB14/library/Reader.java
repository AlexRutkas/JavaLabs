package edu.labs.LAB14.library;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Reader implements Runnable {
    private String name;
    private List<Book> books;

    public Reader(String name) {
        this.name = name;
        this.books = Collections.synchronizedList(new LinkedList<>());
    }

    public void takeOneMoreBook(Book oneMoreBook) {
        books.add(oneMoreBook);
    }

    public int getTakenBooksCount() {
        return books.size();
    }

    @Override
    public void run() {
        if (books.isEmpty()) {
            throw new IllegalStateException("reader " + this.name + " has no books to read");
        }
        for (int i = 0; i < books.size(); i++) {
            Book oneOfTakenBook = books.get(0);
            int pagesLeft = oneOfTakenBook.getNumberOfPages();
            synchronized (oneOfTakenBook) {
                while (pagesLeft > 0) {
                    System.out.println(name + " is reading " + oneOfTakenBook.getBookName() + " Thread:" + Thread.currentThread());
                    pagesLeft--;
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                books.remove(oneOfTakenBook);
            }
        }
    }
}
