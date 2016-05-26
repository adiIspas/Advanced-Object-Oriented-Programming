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
    public static void main(String[] args) throws InterruptedException{
        
        int valoare_maxima = 10;
        Afiseaza P = new Afiseaza();
        
        FirDeExecutareT fir1 = new FirDeExecutareT(valoare_maxima,'T',P);
        FirDeExecutareT fir2 = new FirDeExecutareT(valoare_maxima,'B',P);
        FirDeExecutareT fir3 = new FirDeExecutareT(valoare_maxima,'C',P);
        
        fir1.start();
        fir1.join();
        fir2.start();
        fir2.join();
        fir3.start();
        fir3.join();
    }
}
