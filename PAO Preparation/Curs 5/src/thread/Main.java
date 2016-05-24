/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 * Curs 5
 * @author Adrian ISPAS
 */
public class Main {
    public static void main(String[] args){
        
        int valoare_maxima = 1000;
        
        FirDeExecutareT fir1 = new FirDeExecutareT(valoare_maxima,'T');
        FirDeExecutareT fir2 = new FirDeExecutareT(valoare_maxima,'B');
        
        fir1.start();
        fir2.start();
        
        for(int i = 0; i < valoare_maxima; i++){
            System.out.print("M ");
            if(i % 100 == 0)
                System.out.println();
        }
        
    }
}
