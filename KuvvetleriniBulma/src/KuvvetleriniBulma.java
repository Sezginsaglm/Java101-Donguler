import java.util.Scanner;

public class KuvvetleriniBulma {

    public static void main(String[] args) {

        int x,a;
        Scanner inp=new Scanner(System.in);

        System.out.print(" Bir limit sayi giriniz: ");
        x=inp.nextInt();

        if (x>0){
            for (a=1;a<=x;a*=4){
                System.out.println("4'un kuvveti: "+a);
            }
            System.out.println("-------------------");
            for (a=1;a<=x;a*=5){
                System.out.println("5'in kuvveti: "+a);

            }
            System.out.println("-------------------");
        }else {
            System.out.println(" Hatalı bir sayı girdiniz.");
            System.out.println(" ------------------------ ");
        }
    }
}