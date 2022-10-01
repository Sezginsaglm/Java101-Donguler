import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String kullaniciAdi, sifre;
        Scanner input = new Scanner(System.in);
        int girisHakki = 3;
        int bakiye = 1500;
        int secim;

        while (girisHakki > 0) {
            System.out.print("Kullanıcı adınızı giriniz : ");
            kullaniciAdi = input.nextLine();

            System.out.print("Şifrenizi giriniz : ");
            sifre = input.nextLine();
            System.out.println("------------------------");

            if (kullaniciAdi.equals("Patika") && sifre.equals(("dev123"))) {
                System.out.println(" Merhaba,Patikabank'a hoşgeldiniz. ");
                System.out.println("--------------------------------------");

                do {
                    System.out.println("Lütfen işleminizi aşağıdaki seçeneklerde belirtiniz. ");
                    System.out.println( " Para yatırmak için 1\n " +
                                        "----------------------\n"+
                                        "Para çekmek için 2\n " +
                                        "----------------------\n"+
                                        "Bakiye sorgulama için 3\n " +
                                        "----------------------\n"+
                                        "Çıkış için 4 e basınız ");
                    secim = input.nextInt();
                    System.out.println("--------------------------");
                    switch (secim) {

                        case 1:
                            System.out.print("Yatırmak istediğiniz tutar : ");
                            int islemTutari = input.nextInt();
                            bakiye += islemTutari;
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;

                        case 2:
                            System.out.print("Çekmek istediğiniz tutar : ");
                            int islemTutari2 = input.nextInt();
                                if (islemTutari2 > bakiye) {
                                System.out.println("Yetersiz bakiye");
                                break;
                            } else {
                                bakiye -= islemTutari2;
                                System.out.println("Bakiyeniz : " + bakiye);
                                break;
                            }

                        case 3:
                            System.out.print("Mevcut bakiyeniz : " + bakiye);
                            break;
                    }
                }while (secim != 4);
                System.out.println("İyi günler.Yine bekleriz...");
                break;

            }else
                girisHakki--;
            System.out.println("Hatalı kullanıcı adı veya şifre girdiniz.Tekrar  deneyiniz.");

            if (girisHakki==0){
                System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz.");

            }else
                System.out.println("Kalan giriş hakkınız" +girisHakki);
        }
    }
}