import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girmesini isteyin
        System.out.print("Lütfen bir sayı girin: ");
        int sayi = scanner.nextInt();

        // Negatif sayı kontrolü
        if (sayi < 0) {
            System.out.println("Hata: Negatif bir sayının faktöriyeli hesaplanamaz!");
        } else {
            /* long veri tipi kullanımı:
             Faktöriyel hesaplamalarında çok büyük sayılar oluşabilir.
             long veri tipi 64 bit genişliğinde bir tam sayı veri tipidir ve
            -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasındaki
             tam sayı değerlerini saklayabilir. Bu, büyük faktöriyel değerlerinin
             güvenli bir şekilde saklanmasını sağlar ve taşma (overflow) hatalarını önler.
             */
            long faktoriyel = 1;

            // 0 veya 1'in faktöriyeli 1'dir
            for (int i = 1; i <= sayi; i++) {
                faktoriyel *= i;
            }

            // Sonucu ekrana yazdırın
            System.out.println(sayi + "! = " + faktoriyel);
        }

        // Scanner kaynağını serbest bırakın
        scanner.close();
    }
}
