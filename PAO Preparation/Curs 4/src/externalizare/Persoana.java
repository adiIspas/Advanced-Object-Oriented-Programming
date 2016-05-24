/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package externalizare;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Curs 4
 * @author Adrian ISPAS
 */
public class Persoana implements Externalizable{
    
    private String nume = "";
    private String prenume = "";
    private String tara = "";
    private int varsta = -1;
    
    public Persoana(){}
    
    public Persoana(String nume, String prenume, String country, int varsta){
        this.nume = nume;
        this.prenume = prenume;
        this.tara = country;
        this.varsta = varsta;
    }
    
    @Override
    public String toString(){
        return "Nume: " + this.nume + "\n" + "Prenume: " 
                + this.prenume + "\n" + "Tara: " + tara + "\n"
                + "Varsta: " + this.varsta + "\n";
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(this.nume + "E");
        out.writeInt(this.varsta);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.nume = in.readUTF();
        this.varsta = in.readInt();
    }
    
}
