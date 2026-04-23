package model;

public class Tesi {

    private String titolo;
    private boolean stato;
    private String fileTesi; //la stringa contenente il path


    public Tesi(String titolo, String fileTesi) {
        this.titolo = titolo;
        this.fileTesi = fileTesi;
        this.stato = false;
    }

}
