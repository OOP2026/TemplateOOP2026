package model;

import java.time.LocalDateTime;

public class Seduta {
    LocalDateTime data_ora;
    String sede;
    int numero_posti;


    public Seduta(LocalDateTime data_ora, String sede,int numero_posti) {
        this.data_ora = data_ora;
        this.sede = sede;
        this.numero_posti = numero_posti;
    }


}
