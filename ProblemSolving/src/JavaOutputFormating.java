import java.util.Scanner;

public class JavaOutputFormating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s1=sc.nextLine();
        Scanner line = new Scanner( s1);
        line=line.useDelimiter(" ");

        String language = line.next();
        int mark = line.nextInt();;

        System.out.printf("%s%03d\n",String.format("%0$-15s", language),mark); }
}
