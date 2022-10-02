import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N,Sayi,Min=1,Max=1;

        System.out.print("Kaç tane sayı gireceksiniz : ");
        N=input.nextInt();

        for (int i = 1; i <= N; i++){
            System.out.print(i+". Sayıyı giriniz : ");
            Sayi=input.nextInt();

            if (i==1){
                Min=Sayi;
                Max=Sayi;

            }

            if (Sayi>Max){
                Max=Sayi;

            }

            if (Sayi<Min){
                Min=Sayi;
            }
        }
        System.out.println("---------------------");
        System.out.println("En büyük sayı : " +Max);
        System.out.println("En küçük sayı : " +Min);
    }
}
