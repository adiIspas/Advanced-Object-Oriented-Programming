/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callback;

/**
 * Curs 3
 * @author Adrian ISPAS
 */
public class Suma {
    
    int numar_1 = 0;
    int numar_2 = 0;
    FunctieGenerica functieGenerica = null;
    
    public Suma(int numar_1, int numar_2, FunctieGenerica functieGenerica){
        this.numar_1 = numar_1;
        this.numar_2 = numar_2;
        this.functieGenerica = functieGenerica;
    }
    
    public int Calculeaza(){
        int s = 0;
        
        for(int i = numar_1; i <= numar_2; i++){
            s += functieGenerica.calculeaza(i);
        }
        
        return s;
    }
}
