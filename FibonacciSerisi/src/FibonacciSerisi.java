
   import java.util.Scanner;
   /*Java döngüler ile fibonacci serisi bulan program yazıyoruz.
     Fibonacci serisinin eleman sayısını kullanıcıdan alın.*/

    public class FibonacciSerisi {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.print("Lütfen eleman sayısını giriniz : ");

            int sayi = scan.nextInt();

            int n1 = 0, n2 = 1;
            System.out.print(n1 +" " +n2 + " ");
            
            for(int i = 1;i <= (sayi - 2);i++){
                int sonuc = n1 + n2;
                System.out.print(sonuc + " ");
                n1 = n2;
                n2 = sonuc;
            }

        }
    }
