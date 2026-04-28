package model;

import java.time.LocalDateTime;
import java.util.*;


public class Docente extends Utente {
    private boolean is_coordinatore;
    private List<Tirocinio> listaTirocini;
    private List<Seduta> sedute_pubblicate;
    private List<Tesi> tesi_valutate;

    public Docente(String nome, String cognome, String email, String password, String username) {
        super(nome, cognome, email, password, username);
        this.is_coordinatore = false;
        this.listaTirocini = new ArrayList<Tirocinio>();
        this.sedute_pubblicate = new ArrayList<Seduta>();
        this.tesi_valutate = new ArrayList<Tesi>();
    }

}
