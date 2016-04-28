
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;


class Stagiu {
    private String nume;
    private String companie;
    private boolean vazut;
    
    public String getNume() {
        return nume;
    }

    public String getCompanie() {
        return companie;
    }

    public boolean isVazut() {
        return vazut;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public void setVazut(boolean vazut) {
        this.vazut = vazut;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Stagiu) {
            Stagiu stagiu = (Stagiu) obj;
            
            if((stagiu.companie.equals(((Stagiu) obj).companie)) 
                    && (stagiu.nume.equals(((Stagiu) obj).nume))
                    && (stagiu.vazut == ((Stagiu) obj).vazut))
                return true;
        }
        return false;
  }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nume);
        hash = 83 * hash + Objects.hashCode(this.companie);
        hash = 83 * hash + (this.vazut ? 1 : 0);
        return hash;
    }
}

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc;
        sc = new Scanner(System.in);
        
        String str = sc.next();
        System.out.println(str);
        
        Stagiu stagiu1 = new Stagiu();
        stagiu1.setCompanie("AC");
        stagiu1.setNume("AN");
        stagiu1.setVazut(true);
        
        Stagiu stagiu2 = new Stagiu();
        stagiu2.setCompanie("BC");
        stagiu2.setNume("BN");
        stagiu2.setVazut(false);
        
        Stagiu stagiu3 = new Stagiu();
        stagiu3.setCompanie("AC");
        stagiu3.setNume("AN");
        stagiu3.setVazut(true);
        
        HashSet<Stagiu> stagii;
        stagii = new HashSet<>();
        
        stagii.add(stagiu1);
        stagii.add(stagiu2);
        stagii.add(stagiu3);

        System.out.println(stagii + "\nDone!");
    }
    
}
