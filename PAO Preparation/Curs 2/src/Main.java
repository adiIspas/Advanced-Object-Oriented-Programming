/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Curs 2
 * @author Adrian ISPAS
 */
public class Main {
    public static void main(String[] args){
        A a = new B();
        
        a.MNestatica();
        a.MStatica();
        
        System.out.println("-----------------");
        
        B b = new B();
        b.MNestatica();
        b.MStatica();
    }
}
