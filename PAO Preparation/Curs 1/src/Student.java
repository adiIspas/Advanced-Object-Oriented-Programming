/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Curs 1
 * @author Adrian ISPAS
 */
public class Student extends Persoana {
    private String facultate = "";
    
    public Student(){
        super();
    }
    
    public Student(String nume, String prenume, int varsta, String facultate){
        super(nume,prenume,varsta);
        this.facultate = facultate;
    }
    
    public void setFacultate(String facultate){
        this.facultate = facultate;
    }
    
    public String getFacultate(){
        return this.facultate;
    }
    
    @Override
    public double calculeazaTaxa(){
        double taxa = super.calculeazaTaxa();
        taxa -= super.getVarsta();
        
        return taxa;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Facultate: " + this.facultate + "\n" + "Taxa: " + calculeazaTaxa() + "\n";
    }
}
