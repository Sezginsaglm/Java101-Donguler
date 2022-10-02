public class AsalSayiBulma {
    public static void main(String[] args) {
        int a, b;
        boolean Sayi;

        for (a = 2; a < 100; a++) {
            Sayi = true;
            for (b = 2; b < a; b++) {
                if (a % b == 0) {
                    Sayi = false;
                    break;
                }
            }
            if (Sayi) {
                System.out.print(a+"-");
            }
        }
    }
}