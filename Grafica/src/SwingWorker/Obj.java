/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingWorker;

/**
 *
 * @author NOI25
 */
public class Obj {
    int i;
    
    public Obj(int i){
        this.i = i;
    }
    
    @Override
    public String toString(){
        return " " + Math.random() * i * 10 % 10 + " " + Math.random() * i * 7 % 10 + " " + Math.random() * i * 25 % 10;
    }
}
