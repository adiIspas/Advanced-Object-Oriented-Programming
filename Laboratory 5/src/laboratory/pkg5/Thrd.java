/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratory.pkg5;

/**
 *
 * @author NOI25
 */
//public class Thrd extends Thread{
//    
//    private int id ;
//    Thrd(int id){
//        this.id = id ;
//    }
//
//    public void run (){
//        for(int i = 1 ; i<=10 ; i++){
//            System.out.println(id+" "+i);
//        }
//    }

//public static void main(String[] args) {
//    Thrd t1= new Thrd(1);
//    Thrd t2 = new Thrd(2);
//    t1.start();
//    System.out.println("S-a pornit");
//    t2.start();
//    System.out.println("GATA");
//}

//public class Thrd implements Runnable{
//    
//    private int id ;
//    Thrd(int id){
//        this.id = id ;
//    }
//
//    public void run (){
//        for(int i = 1 ; i<=10 ; i++){
//            System.out.println(id+" "+i);
//        }
//    }
//    
//public static void main(String[] args) {
//    
//    Thrd ob1= new Thrd(1);
//    java.lang.Thread t1  = new Thrd(ob1);
//    Thrd ob2 = new Thrd(2);
//    java.lang.Thread t2 = new Thrd(ob2);
//    t1.start();
//    System.out.println("S-a pornit");
//    System.out.println("GATA");
//}
//
//    
//}


public class Thrd implements Runnable{
    
    private int id ;
    private Thread thread;
    Thrd(int id){
            this.id = id ;
    }
    public void run (){
            share();
//		for(int i = 1 ; i<=10 ; i++){
//			System.out.println(id+" "+i);
//		} 
    }

    public void executa(){
            if(thread==null){
                    thread = new Thread(this);
            }
            thread.start();
    }

    public synchronized void share(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
        
public static void main(String[] args) throws InterruptedException {

    Thrd o = new Thrd(1);
    Thrd t = new Thrd(5);
    Thread t1 = new Thread(o);
    System.out.println("incepe");
    t1.start();
//    t1.join();
    System.out.println("gata");
    
    Thread t2 = new Thread(o);
    System.out.println("incepe");
    t2.start();
//    t1.join();
    System.out.println("gata");
}

    
}