package Test;
class SampleDemo implements Runnable{
    Thread t;
    String threadName;
    SampleDemo(String threadName){
      this.threadName=threadName;
    }

    public void run() {
        while (true)
            System.out.println(threadName);
    }
    public void start(){
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        SampleDemo A=new SampleDemo("A");
        SampleDemo B=new SampleDemo("B");
        B.start();
        A.start();
    }
}

/*a;lsdkfk***** */
/*a;slkdfksdf/*;alskjfdkjs*/
