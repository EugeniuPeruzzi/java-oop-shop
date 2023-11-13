package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private float prezzo;
    private float iva;

    // Costruttore
    public Prodotto(String nome, String descrizione, float prezzo, float iva) {
        setCodice(codice);
        setNome(nome);
        setDescrizione(descrizione);
        setPrezzo(prezzo);
        setIva(iva);

    }
    
    Random rnd = new Random();

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

    public float getPrezzo() {
        return prezzo;
    }

    public float getIva() {
        return iva;
    }
    
    public float getPrezzoIvato() {
    	return prezzo+(prezzo * iva / 100);
    }
    
    public String getCodeName() {
    	return codice + "-" + nome;
    }
    
    public String getCodeFormat() {
    	return String.format("%08d", getCodice());
    }
    

    // Metodi Setter
    private void setCodice(int codice) {
        this.codice = rnd.nextInt(1, 1000);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
    
    
    
	@Override
	public String toString() {
		
		return "Studente:\n"
				+ "codice: " + getCodice() + "\n"
				+ "nome: " + getNome() + "\n"
				+ "descrizione: " + getDescrizione() + "\n"
				+ "prezzo: " + getPrezzo() + "$\n"
				+ "iva: " + getIva() + "%\n"
				+ "prezzo ivato: " + getPrezzoIvato() + "$\n"
				+ "codice piu nome: " + getCodeName() + "\n"
				+ "codice formatato: " + getCodeFormat() + "\n";


	}
}

