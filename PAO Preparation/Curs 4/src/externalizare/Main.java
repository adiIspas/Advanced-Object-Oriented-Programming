/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package externalizare;

import java.util.ArrayList;

/**
 * Curs 4
 * @author Adrian ISPAS
 */
public class Main {
    public static void main(String[] args){
        
        ArrayList<Persoana> persoane = new ArrayList<>();
        ArrayList<Persoana> persoane2 = new ArrayList<>();
        
        Persoana persoana_1 = new Persoana("Ion1","Vasile1","Romania",20);
        persoane.add(persoana_1);
        Persoana persoana_2 = new Persoana("Ion2","Vasile2","Romania",21);
        persoane.add(persoana_2);
        Persoana persoana_3 = new Persoana("Ion3","Vasile3","Romania",22);
        persoane.add(persoana_3);
        
        ESerializare.Serializeaza(persoane);        
        
        persoane.clear();
        
        persoane2 = EDeserializare.Deserializeaza();
        
        for(Persoana persoana : persoane2){
            System.out.println(persoana);
        }
    }
}
