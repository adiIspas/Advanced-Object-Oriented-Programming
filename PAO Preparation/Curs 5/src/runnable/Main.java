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
public class Main {
    public static void main(String[] args) throws InterruptedException{
        
        int valoare_maxima = 1000;
        
        FirDeExecutareR f1 = new FirDeExecutareR(valoare_maxima,'C');
        FirDeExecutareR f2 = new FirDeExecutareR(valoare_maxima,'A');
        
        Thread fir1 = new Thread(f1);
        Thread fir2 = new Thread(f2);
        
        fir1.start();
        fir2.start();
        
        for(int i = 0; i < valoare_maxima; i++){
            System.out.print("M ");
            if(i % 100 == 0)
                System.out.println();
        }
    }
}
