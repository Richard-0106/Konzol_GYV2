package uml;
//

import java.util.Random;
//

public class LogikaiJatek1 extends Jatek {
//
//    private Babu[][] tabla;
//    private int[] sorrend;
//    private int babuDb;
//    private Random rnd = new Random();
//
//    public LogikaiJatek(int babuDb) {
//        this.tabla = new Babu[4][5];
//        this.sorrend = new int[10];
//        if (babuDb < 2) {
//            babuDb = 2;
//        } else if (babuDb > 15) {
//            babuDb = 15;
//        }
//        this.babuDb = babuDb;
//    }
//
//    public void babuFeltoltes() {
//        String babuSzinek[] = {"fekete", "piros"};
//        String szin;
//        int ero;
//        int tablaHely1;
//        int tablahely2;
//        for (int i = 0; i < babuDb; i++) {
//            szin = babuSzinek[rnd.nextInt(2)];
//            ero = rnd.nextInt(9) + 1;
//            Babu babu = new Babu(szin, ero);
//
//            tablaHely1 = rnd.nextInt(4);
//            tablahely2 = rnd.nextInt(5);
//            while (tabla[tablaHely1][tablahely2] != null) {
//                tablaHely1 = rnd.nextInt(4);
//                tablahely2 = rnd.nextInt(5);
//            }
//            tabla[tablaHely1][tablahely2] = babu;
//        }
//    }
//
//    public void sorrend() {
//        int szam;
//        for (int i = 0; i < sorrend.length; i++) {
//            szam = rnd.nextInt(15) + 1;
//            while (szerepel(szam)) {
//                szam = rnd.nextInt(15) + 1;
//            }
//            sorrend[i] = szam;
//        }
//    }
//
//    public String sorrendKiIr() {
//        String sorrendString = "";
//        for (int i = 0; i < sorrend.length; i++) {
//            sorrendString += sorrend[i] + " ";
//        }
//        return sorrendString;
//    }
//
//    public String tablaKiIr() {
//        int szamlalo = 0;
//        String tablaString = "";
//        for (Babu[] babus : tabla) {
//            for (Babu babu : babus) {
//                if (babu != null) {
//                    tablaString += (" " + babu.getSzin() + babu.getEro() + " ");
//                } else {
//                    tablaString += (" -- ");
//                }
//                if (szamlalo % babus.length == babus.length - 1) {
//                    tablaString += ("\n");
//                }
//                szamlalo++;
//            }
//        }
//        return tablaString;
//    }
//
//    public boolean szerepel(int szam) {
//        boolean szerepel = false;
//        int i = 0;
//        while (i < sorrend.length && szam != sorrend[i]) {
//            i++;
//        }
//        return i < sorrend.length;
//    }
//
//    public LogikaiJatek() {
//        this(3);
//    }
//
//    public void van8FelettEro() {
//        int i = 0;
//        int j = 0;
//        boolean van = false;
//        while (i < tabla.length && !van) {
//            while (j < tabla[i].length && !van) {
//                if (tabla[i][j] != null && tabla[i][j].getEro() > 8) {
//                    van = true;
//                }
//                j++;
//            }
//            i++;
//            j = 0;
//        }
//        System.out.print("8 feletti: ");
//        System.out.printf(van ? "Van" : "Nincs");
//        System.out.println("\n");
//    }
//

    @Override
    public void kezd() {
        System.out.println("Kezdés");
    }

    public void ment() {
        System.out.println("Mentés");
    }

    public void vege() {
        System.out.println("Vége");
    }
//
//    @Override
//    public String toString() {
//        return sorrendKiIr() + "\n" + tablaKiIr();
//    }

//van egy kétdimenziós tömbünk 4,5 amiben Bábukat tarolunk.
//a bábuk számát a jaték létrehozás során adjuk meg, ha nem adjuk meg 3 bábut rak bele alapértelmetetten
//van egy tömbünk 10 hosszu (sorrend) ebben 1-től 15-ig számokat tárolunk el, de ne ismétlődhetnek
    private Babu[][] tabla;
    private int babuDb;
    private Random rnd = new Random();
    private int[] sorrend;

    public LogikaiJatek1(int babuDb) {
        this.babuDb = babuDb;
        this.tabla = new Babu[4][5];
        this.sorrend = new int[10];

    }

    public LogikaiJatek1() {
        this(3);
    }

    public void sorrend() {
        int szam;
        for (int i = 0; i < sorrend.length; i++) {
            szam = rnd.nextInt(15) + 1;
            while (szerepelt(szam)) {
                szam = rnd.nextInt(15) + 1;
            }
            sorrend[i] = szam;
        }
    }

    public String kiirsorrend() {
        String s = "";
        for (int i = 0; i < sorrend.length; i++) {
            s += sorrend[i] + " ";
        }
        return s;
    }

    public boolean szerepelt(int szam) {
        int i = 0;
        while (i < sorrend.length && sorrend[i] != szam) {
            i++;
        }
        return i < sorrend.length;
    }
public void sorrend2(){
    int szam;
    for (int i = 0; i < sorrend.length; i++) {
        szam=rnd.nextInt(15)+1;
        while(szerepelte(szam)){
        szam=rnd.nextInt(15)+1;
        }
        sorrend[i]=szam;
    }
}
public boolean szerepelte(int szam){
    int i=0;
    while(i<sorrend.length && sorrend[i]!=szam){
    i++;
    }
    return i<sorrend.length;
}
public String sorrend2kiir(){
    String s="";
    for (int i = 0; i < sorrend.length; i++) {
        s+=sorrend[i]+" ";
    }
    return s;
}
    public void van7nelNagyobb() {
        int i=0;
        boolean van=false;
        int j=0;
        while(i<tabla.length &&!van){
            j=0;
            while(j<tabla[i].length && !van){
                if(tabla[i][j]!=null && tabla[i][j].getEro()>8 ){
                    van = true;
                }
                j++;
            }
            i++;
            
        }
    }

    public void babuletrehozas() {
        String[] szinek = {"piros", "fekte"};
        int hely1 = rnd.nextInt(4);
        int hely2 = rnd.nextInt(5);
        int ero = rnd.nextInt(9) + 1;
        int szin = rnd.nextInt(2);
        for (int i = 0; i < babuDb; i++) {
            hely1 = rnd.nextInt(4);
            hely2 = rnd.nextInt(5);
            ero = rnd.nextInt(9) + 1;
            szin = rnd.nextInt(2);
            while (tabla[hely1][hely2] != null) {
                hely1 = rnd.nextInt(4);
                hely2 = rnd.nextInt(5);
            }
            tabla[hely1][hely2] = new Babu(szinek[szin], ero);
        }
        
        
    }

    public String Kiir() {
        String s = "";
        String jel = " __ ";
        for (Babu[] babus : tabla) {
            for (Babu babu : babus) {
                if (babu != null) {
                    s += " " + babu.getSzin() + babu.getEro() + " ";
                } else {
                    s += jel;
                }
            }
            s += "\n";
        }
        return s;
    }
}
