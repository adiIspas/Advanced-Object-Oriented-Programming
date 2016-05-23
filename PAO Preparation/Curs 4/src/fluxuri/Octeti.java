/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fluxuri;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Curs 4
 * @author Adrian ISPAS
 */
public class Octeti {
    public static void ReadWrite(){
        boolean success = true;
        try(FileInputStream input = new FileInputStream("fisier_octeti.txt");
            FileOutputStream output = new FileOutputStream("fisier_octeti_copie.txt")){
            
            int dimensiune = input.available();
            byte[] buffer = new byte[dimensiune];
            
            input.read(buffer);
            output.write(buffer);
            
        }
        catch(IOException exception){
            System.out.println(exception);
            success = false;
            
        }
        finally{
            if(success)
                System.out.println("ReadWrite Octeti finalizat cu succes!");
            else
                System.out.println("ReadWrite Octeti finalizat fara succes!");
        }
    }
}
