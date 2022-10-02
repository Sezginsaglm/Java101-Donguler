import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,x=0;

        System.out.print("Sorgulanacak sayıyı giriniz : ");
        a=input.nextInt();

        for (int i=(a-1);i>=1;i--){

            if (a%i==0){
                x+=i;
            }
        }

        if (x==a){
            System.out.println("Sayınız bir mükemmel sayıdır. ");
        }else {
            System.out.println("Sayınız bir mükemmel sayı değildir. ");
        }
    }
}