import java.util.Scanner;

public class Lops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int sum=0,temp=1,rowSum=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int k=1; k<=n; k++){
                for(int j=1; j<=k; j++){
                    sum=sum+temp;
                    temp=sum;
                    rowSum=rowSum+(sum*b);

                }
                System.out.print((a+rowSum)+" ");
                sum=0;
                temp=1;
                rowSum=0;
            }
            System.out.println();
        }

        in.close();
    }
}
