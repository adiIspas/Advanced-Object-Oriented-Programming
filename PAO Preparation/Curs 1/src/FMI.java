
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NOI25
 */
public class FMI implements Facultate {
    String nume = "";
    ArrayList<Student> studenti = new ArrayList<>();
    
    private static FMI fmi = new FMI("Facultate de Matamatica si Informatica");
    
    private FMI(){}
    
    private FMI(FMI other){}
    
    private FMI(String nume){
        this.nume = nume;
    }

    public static FMI getInstance(){
        if(FMI.fmi == null){
            FMI.fmi = new FMI("Facultate de Matamatica si Informatica");
        }
        
        return FMI.fmi;
    }
    
    public void adaugaStudent(Student student){
        this.studenti.add(student);
    }
    
    @Override
    public ArrayList<Student> getStudenti() {
        return new ArrayList<>(this.studenti);
    }
}
