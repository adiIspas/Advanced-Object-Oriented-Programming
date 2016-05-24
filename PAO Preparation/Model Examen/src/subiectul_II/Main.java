/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subiectul_II;

import java.io.FileNotFoundException;

/**
 * Model Examen
 * @author Adrian ISPAS
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException{
       
       Afiseaza P = new Afiseaza();
        
       Ruleaza t1 = new Ruleaza(P,"exemplu_1.txt");
       Ruleaza t2 = new Ruleaza(P,"exemplu_2.txt");
       Ruleaza t3 = new Ruleaza(P,"exemplu_3.txt");
       
       t1.start();
       t2.start();
       t3.start();
       
       try {
         t1.join();
         t2.join();
         t3.join();
        } 
        catch( Exception e) {
               System.out.println("Interrupted");
        }
    }
}
