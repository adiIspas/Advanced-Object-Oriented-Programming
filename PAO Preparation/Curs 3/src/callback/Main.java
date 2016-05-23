/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callback;

/**
 * Curs 3
 * @author Adrian ISPAS
 */
public class Main {
    public static void main(String[] args){
        
        Suma A = new Suma(1,5,new FunctiaA());
        Suma B = new Suma(1,5,new FunctiaB());
        Suma C = new Suma(1,5,new FunctieGenerica(){
                                @Override
                                public int calculeaza(int x) {
                                    return x * x * x;
                                }

                            });
        
        System.out.println("A: " + A.Calculeaza());
        System.out.println("B: " + B.Calculeaza());
        System.out.println("C: " + C.Calculeaza());
        
    }
}
