/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Curs 1
 * @author Adrian ISPAS
 */
public class Main {
    public static void main(String[] args){
        
        Persoana persoana = new Persoana("Vasile","Ion",18);
        System.out.println(persoana);
        
        Persoana persoana2 = new Persoana("Petre","Popescu",17);
        System.out.println(persoana2);
        
        Student student1 = new Student("Gheorghe","Vasile",20,"FMI");
        System.out.println(student1);
        
        Student student2 = new Student("Portocala","Mandarina",22,"FMI");
        System.out.println(student2);
       
        System.out.println("--------------\n");
        System.out.println("--------------\n");
        
        FMI facultate = FMI.getInstance();
        
        facultate.adaugaStudent(student1);
        facultate.adaugaStudent(student2);
        
        facultate.getStudenti().stream().forEach((student) -> {
            System.out.println(student);
        });
        
        System.out.println("Done!");
    }
}
