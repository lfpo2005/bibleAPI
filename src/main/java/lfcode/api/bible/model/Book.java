package lfcode.api.bible.model;

public class Book {

    public Abbrev abbrev;
    public String name;
    public String author;
    public String group;
    public String version;

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

    public Book(Abbrev abbrev, String name, String author, String group, String version) {
        this.abbrev = abbrev;
        this.name = name;
        this.author = author;
        this.group = group;
        this.version = version;
    }
}
