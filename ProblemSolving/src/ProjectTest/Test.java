package ProjectTest;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int amount=1300;
        int riderBalance=amount*5/100;
        int sellerBalance=amount-riderBalance;
        System.out.println("Rider: "+(riderBalance+549));
        System.out.println("Seller: "+(sellerBalance+2480));
        System.out.println("Amount: "+amount);
    }
}
