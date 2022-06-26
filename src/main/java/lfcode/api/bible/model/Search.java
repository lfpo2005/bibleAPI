package lfcode.api.bible.model;

public class Search {

    protected String version;
    protected String search;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public Search(String version, String search) {
        this.version = version;
        this.search = search;
    }
}
