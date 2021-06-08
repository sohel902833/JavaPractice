
package threadingpractice;

import java.util.logging.Level;
import java.util.logging.Logger;


class A extends Thread{ 
   public void run(){
       for (int i=0; i<=5; i++){
           System.out.println("Hello");
            try { Thread.sleep(500); } catch (Exception e) {}
       }
   
   } 
    
}


class B extends Thread{
   public void run(){
       for (int i=0; i<=5; i++){
           System.out.println("Hi");
           try { Thread.sleep(500); } catch (Exception e) {}
       }
   
   } 
}

public class ThreadingPractice {
    public static void main(String[] args) {
        
        
        A t1=new A();
        B t2=new B();
        
         t1.start();
        try { Thread.sleep(10); } catch (Exception e) {}
        t2.start();
        

        
        
        
        
        
        
        
        
   }
    
}
          


