/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sync;

import thread.*;

/**
 * Curs 5
 * @author Adrian ISPAS
 */
public class Main {
    public static void main(String[] args){
        
        int valoare_maxima = 1000;
        Afiseaza P = new Afiseaza();
        
        FirDeExecutareT fir1 = new FirDeExecutareT(valoare_maxima,'T',P);
        FirDeExecutareT fir2 = new FirDeExecutareT(valoare_maxima,'B',P);
        
        fir1.start();
        fir2.start();
        
        try {
         fir1.join();
         fir2.join();
        } 
        catch( Exception e) {
               System.out.println("Interrupted");
        }
        
        for(int i = 0; i < valoare_maxima; i++){
            System.out.print("M ");
            if(i % 100 == 0)
                System.out.println();
        }
        
    }
}
