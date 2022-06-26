package lfcode.api.bible.model;

public class Book {

    public Abbrev abbrev;
    public String name;
    public String author;

    public String chapters;

    public String testament;

    public String group;

    public String version;

    public String getChapters() {
        return chapters;
    }

    public void setChapters(String chapters) {
        this.chapters = chapters;
    }

    public String getTestament() {
        return testament;
    }

    public void setTestament(String testament) {
        this.testament = testament;
    }

    public Abbrev getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(Abbrev abbrev) {
        this.abbrev = abbrev;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Book(Abbrev abbrev, String name, String author, String chapters, String testament, String group, String version) {
        this.abbrev = abbrev;
        this.name = name;
        this.author = author;
        this.chapters = chapters;
        this.testament = testament;
        this.group = group;
        this.version = version;
    }
}
