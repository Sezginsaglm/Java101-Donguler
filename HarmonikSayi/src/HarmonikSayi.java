import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        int n=input.nextInt();
        double sonuc=0.0;

        for (double i =1;i<=n;i++){
            sonuc+=(1/i);
        }

        System.out.println("Sonuç :"+sonuc);
    }
}
