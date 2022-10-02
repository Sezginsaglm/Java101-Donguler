import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1;
        int x2 ;


        System.out.print("Lütfen x1 değerini giriniz : ");
        x1 = input.nextInt();

        System.out.print("Lütfen x2 değerini giriniz : ");
        x2 = input.nextInt();
        int ebob;
        int i=x1;
        while(i>=1){
            i--;
            if(x1%i==0 && x2%i==0){
                break;
            }

        }
        ebob=i;
        System.out.println("**");

        int j = 1;
        while(j<=(x1*x2)){
            j++;
            if(j%x1==0 && j%x2==0){
                break;
            }

        }

        System.out.println("Sayıların ebobu = "+ebob +"\nSayıların ekoku = "+j);

    }

}