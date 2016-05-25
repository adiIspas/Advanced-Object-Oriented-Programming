/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subiectul_II;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Model Examen
 * @author Adrian ISPAS
 */
public class Ruleaza extends Thread {
    
    Afiseaza P = null;
    String fisier = null;
    
    public Ruleaza(){
        
    }
    
    public Ruleaza(Afiseaza P, String fisier){
        this.P = P;
        this.fisier = fisier;
    }

    @Override
    public void run() {
        try {
           // synchronized(P){
                P.Print(this.fisier);
           // }
        } catch (IOException ex) {
            Logger.getLogger(Ruleaza.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
