/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subiectul_I;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Model Examen
 * @author Adrian Ispas
 */
public class Main {
    public static void main(String[] args){
        ArrayList<Economist> economisti = new ArrayList<>();
        
        int vechime;
        int treapta;
        double salariu;
        String nume;
        String firma;
        String telefon;
        
        int numarEconomisti = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Cati economisti doriti sa introduceti? ");
        System.out.print("Numar: ");
        numarEconomisti = input.nextInt();
        
        for(int i = 0; i < numarEconomisti; i++){
            System.out.println("Economistul numarul " + (i + 1));
            
            System.out.print("Nume: ");
            nume = input.next();
            
            System.out.print("Firma: ");
            firma = input.next();
            
            System.out.print("Salariu: ");
            salariu = input.nextDouble();
            
            System.out.print("Vechime: ");
            vechime = input.nextInt();
            
            System.out.print("Treapta: ");
            treapta = input.nextInt();
            
            System.out.print("Telefon: ");
            telefon = input.next();
            
            economisti.add(new Economist(nume,firma,salariu,vechime,treapta,telefon));
            
            System.out.println("A fost citit economistul " + (i + 1) + "!\n-----------");
        }
        
        System.out.println("Afisare economistii:");
        
        Collections.sort(economisti);
        
        economisti.stream().forEach((economist) -> {
            System.out.println(economist + "\n---------------");
        });
    }
}
