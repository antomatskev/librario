package eu.librario.model;

public class Book {

    private long id;
    private String name;
    private String author;
    private int year;
    private Person person;

    public Book() {
    }

    public Book(long id, String name, String author, int year, Person person) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
