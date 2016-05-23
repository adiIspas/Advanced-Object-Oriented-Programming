/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fluxuri;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Curs 4
 * @author Adrian ISPAS
 */
public class Caractere {
    
    public static void ReadWrite(){
        boolean success = true;
        
        try(FileReader input = new FileReader("fisier_caractere.txt");
            FileWriter output = new FileWriter("fisier_caractere_copie.txt")){
            
            int ch;
            while((ch = input.read()) != -1){
                output.write(ch);
            }
            
        }
        catch(IOException exception){
            System.out.println(exception);
            success = false;
        }
        finally{
            if(success)
                System.out.println("ReadWrite Caractere finalizat cu succes!");
            else
                System.out.println("ReadWrite Caractere finalizat fara succes!");
        }
    }
    
}
