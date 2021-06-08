import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();

        if(n%2==0){
            if(n>=2 && n<=5){
                System.out.println("In Range 2-5");
                System.out.println("Not Weird");
            }else if(n>=6 && n<=20){
                System.out.println("In Range 6-20");
                System.out.print("Weird");
            }else{
                System.out.println("In Range >20");
                System.out.print("Not Weird");
            }
        }else{
           System.out.println("Weird");
        }






    }
}
