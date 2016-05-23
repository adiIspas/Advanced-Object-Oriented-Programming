/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializare_deserializare;

import java.io.Serializable;

/**
 * Curs 4
 * @author Adrian ISPAS
 */
public class Persoana implements Serializable{
    
    private String nume = "";
    private String prenume = "";
    private static String tara = "";
    private transient int varsta = -1;
    
    public Persoana(){}
    
    public Persoana(String nume, String prenume, String country, int varsta){
        this.nume = nume;
        this.prenume = prenume;
        tara = country;
        this.varsta = varsta;
    }
    
    @Override
    public String toString(){
        return "Nume: " + this.nume + "\n" + "Prenume: " 
                + this.prenume + "\n" + "Tara: " + tara + "\n"
                + "Varsta: " + this.varsta + "\n";
    }
    
}
