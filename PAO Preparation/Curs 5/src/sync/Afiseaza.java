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
public class Afiseaza {
    public void print(int valoare_maxima, char caracater){
        for(int i = 0; i < valoare_maxima; i++){
            System.out.print(caracater + " ");
            if(i % 100 == 0)
                System.out.println();
        }
    }
}
