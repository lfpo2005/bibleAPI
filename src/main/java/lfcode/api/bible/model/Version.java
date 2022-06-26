package lfcode.api.bible.model;

public class Version {

    protected String version;

    protected String verses;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVerses() {
        return verses;
    }

    public void setVerses(String verses) {
        this.verses = verses;
    }

    public Version(String version, String verses) {
        this.version = version;
        this.verses = verses;
    }
}
