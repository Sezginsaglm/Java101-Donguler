import java.util.Scanner;

public class BasamakHesabi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi=input.nextInt();
        int basamakDegeri=0;



        while (sayi!=0){
            basamakDegeri+=(sayi%10);
            sayi/=10;

        }
        System.out.println(basamakDegeri);

    }
}
