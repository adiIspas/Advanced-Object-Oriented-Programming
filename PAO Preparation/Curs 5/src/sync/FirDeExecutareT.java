/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sync;

/**
 * Curs 5
 * @author Adrian ISPAS
 */
public class FirDeExecutareT extends Thread{

    int valoare_maxima = 0;
    char caracter = 0;
    Afiseaza P;
    
    public FirDeExecutareT(int valoare_maxima, char caracter, Afiseaza P){
        this.valoare_maxima = valoare_maxima;
        this.caracter = caracter;
        this.P = P;
    }
    
    @Override
    public void run() {
        synchronized(P){
            P.print(this.valoare_maxima, this.caracter);
        }
    }
}
