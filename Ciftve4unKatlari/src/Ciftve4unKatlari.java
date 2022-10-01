import java.util.Scanner;

public class Ciftve4unKatlari {
    public static void main(String[] args) {
        int a,toplam=0;
        Scanner input=new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz : ");
            a=input.nextInt();
            boolean kosul1=(a%2==0);
            boolean kosul2=(a%4==0);

            if (kosul1&&kosul2){
                toplam+=a;
            }
        } while (a%2==0);

        System.out.println("Toplam : "+toplam);

    }
}
