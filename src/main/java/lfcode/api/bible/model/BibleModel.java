package lfcode.api.bible.model;

public class BibleModel {
    public Book book;
    public String chapter;
    public String number;
    public String text;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public BibleModel(Book book, String chapter, String number, String text) {
        this.book = book;
        this.chapter = chapter;
        this.number = number;
        this.text = text;
    }
}
