class A extends Thread{
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("Hi");
         try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}

class B extends Thread{
    public void run(){
  for(int i=0; i<=5; i++){
            System.out.println("Hello");
        try{Thread.sleep(500);}catch(Exception e){}
        }
    }
  
}


class Main{

public static void main(String[] args){
        System.out.println("hellow World");

        A obj1=new A();
        B obj2=new B();


        obj1.start();
        obj2.start();


    }
}

