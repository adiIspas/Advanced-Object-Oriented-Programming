/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptii;

import java.util.Scanner;

/**
 * Curs 4
 * @author Adrian ISPAS
 */
public class Main {
    public static void main(String[] args){
        int numar_1 = 0;
        int numar_2 = 0;
        int rezultat = -1;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Numar 1: ");
        numar_1 = input.nextInt();
        
        System.out.print("Numar 2: ");
        numar_2 = input.nextInt();
        
        try{
            rezultat = numar_1 / numar_2;
        }
        catch(ArithmeticException e){
            System.out.println("Impartire la 0\n" + e);
        }
        finally{
            System.out.println("Am intrat in finally");
        }

        System.out.println(rezultat);
        
    }
}
