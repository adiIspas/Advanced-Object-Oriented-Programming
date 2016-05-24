/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subiectul_II;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Model Examen
 * @author Adrian ISPAS
 */
public class Afiseaza {

    public void Print(String fisier) throws IOException{
        int c = 0;
        int numarCuvinte = 0;
        FileReader input = new FileReader(fisier);
        String text = "";
        
        while((c = input.read()) != -1){
            text += (char)c;
        }
        
        Scanner sc = new Scanner(text);
        while(sc.hasNext()){
            sc.next();
            numarCuvinte++;
        }
        
        System.out.println("Fisierul " + fisier + " are " + numarCuvinte + " cuvinte.\n");
    }
}
