package lfcode.api.bible.model;
public class Abbrev {

    private String pt;
    private String en;

    /**
     * No args constructor for use in serialization
     *
     */
    public Abbrev() {
    }

    /**
     *
     * @param pt
     * @param en
     */
    public Abbrev(String pt, String en) {
        super();
        this.pt = pt;
        this.en = en;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.pt == null)? 0 :this.pt.hashCode()));
        result = ((result* 31)+((this.en == null)? 0 :this.en.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Abbrev) == false) {
            return false;
        }
        Abbrev rhs = ((Abbrev) other);
        return (((this.pt == rhs.pt)||((this.pt!= null)&&this.pt.equals(rhs.pt)))&&((this.en == rhs.en)||((this.en!= null)&&this.en.equals(rhs.en))));
    }

}