package org.effective.chapter01.item03.serialization;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {

    // 클래스가 변경될 경우
    private static final long serialVersionUID = 1L;

    private String isbn;
    private String title;
    private String author;
    private LocalDate published;
    // 직렬화를 하고 싶지 않을 경우
    private transient int numberOfSold;



    public Book(String isbn, String title, String author, LocalDate published) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.published = published;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", published=" + published +
                ", numberOfSold=" + numberOfSold +
                '}';
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublished() {
        return published;
    }

    public int getNumberOfSold() {
        return numberOfSold;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublished(LocalDate published) {
        this.published = published;
    }

    public void setNumberOfSold(int numberOfSold) {
        this.numberOfSold = numberOfSold;
    }
}
