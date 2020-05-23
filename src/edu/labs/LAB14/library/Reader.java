package edu.labs.LAB14.library;

public class Reader implements Runnable {
    private String name;
    private Book book;

    public Reader(String name, Book book) {
        this.name = name;
        this.book = book;
    }


    @Override
    public void run() {
        System.out.println(name + " is reading " + book.getBookName() + " Thread:" + Thread.currentThread());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
