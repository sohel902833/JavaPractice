
package threadingpractice;

import java.util.List;
import java.util.ArrayList;

class Student{
    
    String name;
    int roll,registration;

    public Student(String name, int roll, int registration) {
        this.name = name;
        this.roll = roll;
        this.registration = registration;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", roll=" + roll + ", registration=" + registration + '}';
    }
}
   
 class AA implements Runnable{
         
     List<Student> studentList=new ArrayList<>();
     
        @Override
        public void run() {
             Thread t1=new Thread(()->{
                for(Student s: studentList){
                    System.out.println(s);
                     try{Thread.sleep(500);}catch(Exception e){}   
              
                }
            });
            Thread t2=new Thread(()->{  
                for(int i=0; i<4; i++){
                   Student s1=new Student("From Class A",i+1,i+902);
                   studentList.add(s1);
                   try{Thread.sleep(500);}catch(Exception e){}   
              
                } 
            });
            
            
            
            t2.start();
            try{Thread.sleep(10);}catch(Exception e){}   
            t1.start();
            
        }
    }
 class BB implements Runnable{
     
     List<Student> studentList=new ArrayList<>();
     
       @Override
        public void run() {
            Thread t1=new Thread(()->{
                for(Student s: studentList){
                    System.out.println(s);
                      try{Thread.sleep(500);}catch(Exception e){}   
                }
            });
            Thread t2=new Thread(()->{  
                for(int i=0; i<4; i++){
                   Student s1=new Student("From Class B",i+1,i+902);
                   studentList.add(s1);
                } 
            });
            t2.start();
            try{Thread.sleep(10);}catch(Exception e){}   
            t1.start();
         
        }     
    }
    



public class ThreadDemo { 
    public static void main(String[] args) {
        
        AA obj1=new AA();
        BB obj2=new BB();
        
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        
        t1.start();
        try{Thread.sleep(10);}catch(Exception e){}   
        t2.start();
        

        
    }
    
}
