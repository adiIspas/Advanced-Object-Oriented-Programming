/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnable;

/**
 * Curs 5
 * @author Adrian ISPAS
 */
public class FirDeExecutareR implements Runnable{
    
    int valoare_maxima = 0;
    char caracter = 0;
    
    public FirDeExecutareR(int valoare_maxima, char caracter){
        this.valoare_maxima = valoare_maxima;
        this.caracter = caracter;
    }
    
    @Override
    public void run() {
        for(int i = 0; i < this.valoare_maxima; i++){
            System.out.print(this.caracter + " ");
            if(i % 100 == 0)
                System.out.println();
        }
    }
    
}
