package org.lessons.java.shop;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    // Costruttore
    public Prodotto(int codice, String nome, String descrizione, double prezzo, double iva) {
        setCodice(codice);
        setNome(nome);
        setDescrizione(descrizione);
        setPrezzo(prezzo);
        setIva(prezzo);

    }

    // Metodi Getter
    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getIva() {
        return iva;
    }

    // Metodi Setter
    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
}

