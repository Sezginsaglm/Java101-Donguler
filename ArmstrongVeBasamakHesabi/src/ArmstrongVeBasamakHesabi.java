import java.util.Scanner;

public class ArmstrongVeBasamakHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,basamakSayisi=0,sayidegeri;
        System.out.print("Bir sayı giriniz : ");
        sayi=input.nextInt();
        int geciciSayi=sayi,basamakUs,sonuc=0;

        while (geciciSayi!=0){
            geciciSayi /=10;
            basamakSayisi++;
        }

        geciciSayi=sayi;

        while (geciciSayi!=0){
            sayidegeri=geciciSayi%10;
            basamakUs=1;
            for (int i=1;i<=basamakSayisi;i++){
                basamakUs*=sayidegeri;
            }
            sonuc +=basamakUs;
            geciciSayi/=10;
        }

        if (sonuc==sayi) {
            System.out.println(sayi +" sayısı bir Armstrong sayıdır.");
        }else {
            System.out.println(sayi +" sayısı bir Armstrong sayı değildir.");
        }

    }
}
