package model;

public class Richiesta {
    private Stato_richiesta stato;
    private Studente richiedente;
    private Tirocinio tirocinio;

    public Richiesta(Studente richiedente, Tirocinio tirocinio) {
        this.stato = Stato_richiesta.In_attesa;
        this.richiedente = richiedente;
        this.tirocinio = tirocinio;
    }

}