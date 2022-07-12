package lfcode.api.bible.model;

import lfcode.api.bible.enums.Abbrev;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class Book {


    protected String name;
    protected String author;
    protected String chapters;
    protected String testament;
    protected String group;
    protected String version;
    @Enumerated(EnumType.STRING)
    protected Abbrev abbrev;

}
