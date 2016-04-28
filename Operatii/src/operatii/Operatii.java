/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatii;

/**
 *
 * @author NOI25
 */
public class Operatii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        Operatii op = new Operatii();
        System.out.println(op.aduna(a,b));
    }
    
    public int aduna(int a, int b){
        return a + b;
    }
    
    public int scade(int a, int b){
        return a + b;
    }
    
}
