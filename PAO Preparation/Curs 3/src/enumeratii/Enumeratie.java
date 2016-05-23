package enumeratii;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Curs 3
 * @author Adrian ISPAS
 */
public enum Enumeratie {
    
    Georgiana("FPSE",20),
    Maria("ASE",21),
    Diana("FMI",21);
    
    private String facultate = "";
    private int varsta = 0;
    
    private Enumeratie(String facultate, int varsta){
        this.facultate = facultate;
        this.varsta = varsta;
    }
    
    public String getFacultate(){
        return this.facultate;
    }
    
    public int getVarsta(){
        return this.varsta;
    }  
}
