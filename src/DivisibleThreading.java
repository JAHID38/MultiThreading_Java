class Thread1 extends Thread{
    //divisible by either 3 or 5 but not by both 3&5;

    private
    String name;
    Thread1(String name){
        this.name = name;
    }
    
    public void run (){
        try{
            for (int i = 1; i < 101; i++){
                //divisible by either 3or5; not by both.
                if ((i % 3 == 0 || i % 5 == 0) && (i % 15 != 0))
                System.out.println (name +"\t" +i);
                Thread.sleep(500);
            }            
        }
        catch (InterruptedException e){
            //System.out.println (e);

        }
        System.out.println (name +"\tExiting...");
    }
}

class Thread2 extends Thread{
    //divisible by both 3 & 5;
    //it means GCD of 3,5 = 15;
    private
    String name;
    Thread2(String name){
        this.name = name;
    }
    
    public void run (){
        try{
            for (int i = 1; i < 101; i++){
                if (i % 15 == 0)
                System.out.println (name +"\t" +i);
                Thread.sleep(500);
            }            
        }
        catch (InterruptedException e){
           // System.out.println (e);
        }
        System.out.println (name +"\tExiting...");
    }
}

public class DivisibleThreading {
    public static void main (String args []){
        //optional;
        //starting main thread;
        System.out.println ("Main is being started...");
        
        Thread1 t1 = new Thread1("Thread_1");
        t1.start();
        
        Thread2 t2 = new Thread2("Thread_2");
        t2.start();        

        //this join within try-catch block is optional
        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            //System.out.println (e);
        }
        //optional;
        System.out.println ("Now Main is Finished...");
        //ending main thread;
    }
}
