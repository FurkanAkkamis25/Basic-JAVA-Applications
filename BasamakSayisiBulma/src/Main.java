import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Negatif sayıları pozitif olarak ele almak için mutlak değeri alıyoruz.
        sayi = Math.abs(sayi);

        int basamakSayisi = 0;

        // Eğer sayı 0 ise, basamak sayısı 1 olmalı
        if (sayi == 0) {
            basamakSayisi = 1;
        } else {
            while (sayi > 0) {
                sayi /= 10;
                basamakSayisi++;
            }
        }

        System.out.println("Girilen sayının basamak sayısı: " + basamakSayisi);
    }
}
