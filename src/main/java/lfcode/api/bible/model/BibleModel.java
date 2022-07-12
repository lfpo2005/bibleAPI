package lfcode.api.bible.model;

import lombok.Data;

@Data
public class BibleModel extends Book  {

    protected String chapter;
    protected String number;
    protected String text;

}
