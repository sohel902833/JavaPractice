import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            long x = sc.nextLong();
            System.out.println(x + " can be fitted in:");
            if (x <= 127 && x >= -128) {
               System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if (x <= 32767 && x >= -32768) {
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if (x <= 2147483647 && x >= -2147483648) {
               System.out.println("* int");
                System.out.println("* long");
            } else if (!(x > Long.MAX_VALUE && x > Long.MIN_VALUE)) {
                System.out.println("* long");
            }
        }catch (Exception e){
            System.out.println(sc.next()+" can't be fitted anywhere.");
        }


    }
}
