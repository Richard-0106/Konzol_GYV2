package uml;

public class Babu {

    private int ero;
    private String szin;

    public Babu(String szin) {
        this(szin, 1);
    }

    public Babu(String szin, int ero) {
        if (ero < 1) {
            ero = 1;
        } else if (ero > 9) {
            ero = 9;
        }
        this.ero = ero;
        this.szin = szin;
    }

    public int getEro() {
        return ero;
    }

    public String getSzin() {
        return szin;
    }

}
