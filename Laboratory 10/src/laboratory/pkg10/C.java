/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratory.pkg10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author NOI25
 */
public class C implements Callable{

    int x;
    C(int x){
        this.x = x;
    }
    @Override
    public Object call() throws Exception {
        Thread.sleep(1000);
       for(int i = 0; i < 100_000; i++){
           ++x;
        }
   
       return x;   
    }
    
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        C c = new C(7);
        
        ExecutorService ex = Executors.newFixedThreadPool(7);
        
        Future<Integer> f = ex.submit(c);
        
        //if(f.isDone())
            System.out.println(f.get());
        
        ex.shutdown();
       
        AtomicInteger x = new AtomicInteger(0);
        
        x.getAndIncrement();
       
        
    }
}
