package instancesingleton;

class Singleton{
    private Singleton(){}
    private Singleton(Singleton other){}
    
    private static Singleton instance = new Singleton();
    
    private String name;
    
    public static Singleton getInstance(){
        if(instance == null)
            return new Singleton();
        else
            return instance;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
}

public class InstanceSingleton {
    
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        
        obj1.setName("ala");
        obj2.setName("bala");
        
        System.out.print(obj1.getName() + " | " + obj2.getName());
    }
    
}
