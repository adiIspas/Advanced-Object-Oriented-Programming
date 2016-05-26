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
abstract class Angajat implements Serializable{
    protected String nume;
    protected String firma;
    protected double salariuBaza;
    protected int vechime;
    
    public Angajat(String nume, String firma, double salariuBaza, int vechime){
        this.nume = nume;
        this.firma = firma;
        this.salariuBaza = salariuBaza;
        this.vechime = vechime;
    }
    
    public abstract double calculSalariuBrut();
    
    @Override
    public String toString(){
        return "\nNume: " + this.nume + "\nFirma: " + this.firma + "\nVechime: "
                + this.vechime + "\nSalariu brut: " + this.salariuBaza;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public double getSalariuBaza() {
        return salariuBaza;
    }

    public void setSalariuBaza(double salariuBaza) {
        this.salariuBaza = salariuBaza;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }
    
    
}
