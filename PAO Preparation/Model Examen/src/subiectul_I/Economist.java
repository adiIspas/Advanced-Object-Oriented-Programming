/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subiectul_I;

import java.io.Serializable;

/**
 * Model Examen 
 * @author Adrian ISPAS
 */
public class Economist extends Angajat implements Serializable, Comparable{

    int treapta;
    transient String telefon;
    
    public Economist(String nume, String firma, double salariuBaza, int vechime, int treapta, String telefon){
        super(nume,firma,salariuBaza,vechime);
        
        this.treapta = treapta;
        this.telefon = telefon;
    }
    
    public double calculeazaSporVechime(){
        if(this.vechime >= 5 && this.vechime <= 10)
            return 5/100 * salariuBaza;
        
        if(this.vechime > 10)
            return 20/100 * salariuBaza;
        
        return 0;
    }
    
    @Override
    public double calculSalariuBrut() {
        double salariuBrut = this.salariuBaza + calculeazaSporVechime();
        
        if(this.treapta == 1)
            salariuBrut += 200;
        
        if(this.treapta == 2)
            salariuBrut += 500;
        
        return salariuBrut;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTreapta: " + treapta + "\nTelefon: " + telefon;
    }
    
    @Override
    public int compareTo(Object obj) {
        Economist economist = (Economist)obj;
        
        if(this.vechime != economist.vechime)
            return economist.vechime - this.vechime;
              
        return economist.treapta - this.treapta;
    }

    public int getTreapta() {
        return treapta;
    }

    public void setTreapta(int treapta) {
        this.treapta = treapta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
