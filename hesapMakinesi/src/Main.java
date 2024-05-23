import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basit Hesap Makinesi");
        System.out.println("Yapmak istediğiniz işlemi seçin:");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");

        int secim = scanner.nextInt();

        if (secim < 1 || secim > 4) {
            System.out.println("Geçersiz seçim!");
        } else {
            System.out.print("Birinci sayıyı girin: ");
            double sayi1 = scanner.nextDouble();

            System.out.print("İkinci sayıyı girin: ");
            double sayi2 = scanner.nextDouble();

            double sonuc = 0;

            switch (secim) {
                case 1:
                    sonuc = sayi1 + sayi2;
                    break;
                case 2:
                    sonuc = sayi1 - sayi2;
                    break;
                case 3:
                    sonuc = sayi1 * sayi2;
                    break;
                case 4:
                    if (sayi2 != 0) {
                        sonuc = sayi1 / sayi2;
                    } else {
                        System.out.println("Hata: Bölme işleminde bölen 0 olamaz!");
                        return;
                    }
                    break;
            }

            System.out.println("Sonuç: " + sonuc);
        }

        scanner.close();
        /*Burada scanner.close() ifadesi,
          Scanner kaynaklarının serbest bırakılmasını sağlar.
          Özellikle bir hata durumunda return ifadesi ile
          programdan çıkıldığında bile kaynakların serbest bırakılması önemlidir.*/
    }
}
