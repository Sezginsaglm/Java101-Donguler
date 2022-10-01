import java.util.Scanner;

public class UsBulma {
    public static void main(String[] args) {
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        a=input.nextInt();
        System.out.println("-------------------");

        System.out.print("üs olacak sayı : ");
        b=input.nextInt();
        System.out.println("-------------------");

        int toplam=1;

        for (int i=1;i<=b;i++){
            toplam*=a;
        }

        System.out.println("Cevap : "+toplam);
        System.out.println("-------------------");
    }
}
