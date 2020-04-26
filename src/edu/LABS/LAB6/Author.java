package edu.labs.LAB6;

public class Author implements IStr {
    private String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String getStr() {
        return this.authorName;
    }
}
