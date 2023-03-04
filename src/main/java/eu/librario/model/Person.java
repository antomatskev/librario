package eu.librario.model;

import java.util.List;

public class Person {

    private long id;
    private String name;
    private int birthYear;
    private List<Book> books;

    public Person() {
    }

    public Person(long id, String name, int birthYear, List<Book> books) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
