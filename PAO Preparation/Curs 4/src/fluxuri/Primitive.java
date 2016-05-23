/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fluxuri;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Curs 4
 * @author Adrian ISPAS
 */
public class Primitive {
    public static void ReadWrite(){
        boolean success = true;
        try(DataInputStream input = new DataInputStream(new FileInputStream("fisier_primitive.bin"));
                DataOutputStream output = new DataOutputStream(new FileOutputStream("fisier_primitive_copie.bin"))){
            
            int dimensiune = input.readInt();
            double[] valori = new double[dimensiune];
            
            for(int i = 0; i < valori.length; i++){
                valori[i] = input.readInt();
                System.out.print(valori[i] + " ");
            }
            System.out.println();
            
            for(int i = 0; i < valori.length; i++)
                output.writeDouble(valori[i]);
                
        }
        catch (IOException exception)
        {
            System.out.println(exception);
            success = false;
        }
        finally{
            if(success)
                System.out.println("ReadWrite Primitive finalizat cu succes!");
            else
                System.out.println("ReadWrite Primitive finalizat fara succes!");
        }
    }
}