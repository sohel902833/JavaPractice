import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        sc.close();
        if (n.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
