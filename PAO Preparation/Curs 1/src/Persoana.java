/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Curs 1
 * @author Adrian ISPAS
 */
public class Persoana {
    private String nume = "";
    private String prenume = "";
    private int varsta = 0;
    private boolean minor = false;
    
    public Persoana(){}
    
    public Persoana(String nume, String prenume, int varsta){
        
        Persoana dummyPerson = new Persoana(varsta);
        
        if(!dummyPerson.minor){
            this.nume = nume;
            this.prenume = prenume;
            this.varsta = varsta;
        }
    }
    
    private Persoana(int varsta){
        if(varsta < 18){
            this.minor = true;
        }
    }
    
    public void setNume(String nume){
        this.nume = nume;
    }
    
    public String getNume(){
        return this.nume;
    }
    
    public void setPrenume(String prenume){
        this.prenume = prenume;
    }
    
    public String getPrenume(){
        return this.prenume;
    }
    
    public void setVarsta(int varsta){
        this.varsta = varsta;
    }
    
    public int getVarsta(){
        return this.varsta;
    }
    
    public double calculeazaTaxa(){
        double taxa = this.varsta * 1.8 + 10;
        
        return taxa;
    }
    
    @Override
    public String toString(){
        return "Nume: " + this.nume + "\n" + "Prenume: " + this.prenume + "\n" + "Varsta: " + this.varsta + "\n" + "Taxa: " + calculeazaTaxa() + "\n";
    }
}
