package lfcode.api.bible.model;

public class BibleModel extends Book {

    public String chapter;
    public String number;
    public String text;

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

    public BibleModel(Abbrev abbrev, String name, String author, String chapters, String testament, String group, String version, String chapter, String number, String text) {
        super(abbrev, name, author, chapters, testament, group, version);
        this.chapter = chapter;
        this.number = number;
        this.text = text;
    }
}
