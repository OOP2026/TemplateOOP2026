package model;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;


public class Tirocinio {
    private String nome;
    private int durata; //numero di ore
    private LocalDateTime data_inizio;
    private List<String> argomenti = new ArrayList<>();
    private int n_posti;
    private int n_cfu;

    public Tirocinio(String nome, int durata, LocalDateTime data_inizio, List<String> argomenti, int n_posti, int n_cfu) {
        this.nome = nome;
        this.durata = durata;
        this.data_inizio = data_inizio;
        // Se la lista passata è null, inizializza una lista vuota per evitare NullPointerException
        this.argomenti = (argomenti != null) ? argomenti : new ArrayList<>();
        this.n_posti = n_posti;
        this.n_cfu = n_cfu;
    }
}
