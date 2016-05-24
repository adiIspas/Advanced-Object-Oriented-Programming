/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package externalizare;

import SP.*;
import externalizare.Persoana;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Curs 4
 * @author Adrian ISPAS
 */
public class ESerializare {
    public static void Serializeaza(ArrayList<Persoana> persoane){
        boolean success = true;
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("persoane_externalizare.txt"))){
            out.writeObject(persoane);
        }
        catch(IOException exception){
            System.out.println(exception);
            success = false;
        }
        finally{
            if(success)
                System.out.println("Serializare terminata cu succes!\n");
            else
                System.out.println("Serializare terminata fara succes!\n");
        }
    }
}
