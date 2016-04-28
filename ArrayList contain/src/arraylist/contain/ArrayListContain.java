/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist.contain;

import java.util.ArrayList;

/**
 *
 * @author NOI25
 */

class Obiect {
        int x;
        int y;
        
        Obiect(int x, int y){
            this.x = x;
            this.y = y;
        }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.x;
        hash = 97 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Obiect other = (Obiect) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
        
       
    }

public class ArrayListContain {

    public static void main(String[] args) {
        ArrayList<Obiect> lista = new ArrayList<>();
        
        Obiect ob1 = new Obiect(1,2);
        
        lista.add(ob1);
        
        Obiect ob2 = new Obiect(1,2);
        
        
        
        if(lista.contains(ob2) == false)
            lista.add(ob2);
        else
            System.out.println("contine ob2 deja");
    }
    
}
