import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        int n,r;
        Scanner input = new Scanner(System.in);

        System.out.print("Küme kaç elemandan oluşur : ");
        n = input.nextInt();
        System.out.println("-------------------");

        System.out.print("Kaç elemandan oluşan gruplar oluşturulacaktır : ");
        r = input.nextInt();
        System.out.println("-------------------");

        int nTotal=1,rTotal=1,nrTotal=1;

        for (int i=1;i<=n;i++){
            nTotal*=i;
        }

        for (int i=1;i<=r;i++){
            rTotal*=i;
        }

        for (int i=1;i<=(n-r);i++){
            nrTotal*=i;
        }

        int nrKombinasyon=nTotal/(rTotal*nrTotal);

        System.out.println("Kombinasyon sonucunuz : "+nrKombinasyon);
        System.out.println("-------------------");


    }
}
