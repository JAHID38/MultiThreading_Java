/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shahed
 */
class MyThread extends Thread{

    private
    String s;
    MyThread (String name){
       s = name;
       
        start();
    }
    public void run(){
        
        try{
            for (int i=5; i>0; i--){
                System.out.println(i);
                Thread.sleep(500);
            }
        }
        catch(Exception e){
            //System.out.println (e);
            
        }
    }
}
public class MainThread {
    public static void main (String args []){
        
        new MyThread("Thread-1");
        System.out.println (Thread.currentThread());

    }
}
