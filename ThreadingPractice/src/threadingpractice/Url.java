package threadingpractice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Url {
      static int count=1;
    public static void main(String[] args) {
             Scanner input=new Scanner(System.in);
            String url;
         
            System.out.println("Enter Your Url");
            url=input.nextLine();

        Timer myTimer = new Timer ();
        TimerTask myTask = new TimerTask () {
            @Override
            public void run () {
              try {
                System.out.println("\""+url+"\" Opened in new Tab "+count+" time");
                Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome "+url});
                count++;
              } catch (IOException ex) {
                 Logger.getLogger(Url.class.getName()).log(Level.SEVERE, null, ex);
             } 
         }
        };
      myTimer.scheduleAtFixedRate(myTask , 0l, 8000); 
    }
   }
    
    
 
   
