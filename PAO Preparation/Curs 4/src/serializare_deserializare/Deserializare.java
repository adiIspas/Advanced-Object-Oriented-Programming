/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializare_deserializare;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Curs 4
 * @author Adrian ISPAS
 */
public class Deserializare {
    public static ArrayList<Persoana> Deserializeaza(){
        ArrayList<Persoana> persoane = new ArrayList<>();
        boolean success = true;
        
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("persoane.txt"))){
            persoane = (ArrayList<Persoana>) input.readObject();
        }
        catch(IOException | ClassNotFoundException exception){
            System.out.println(exception);
            success = false;
        }
        finally{
            if(success)
                System.out.println("Deserializare terminata cu succes!\n");
            else
                System.out.println("Deserializare terminata fara succes!\n");
        }
        
        return persoane;
    }
}
