import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1; // Başlangıçta negatif bir sayı olarak ayarlandı

        // Kullanıcıdan pozitif bir sayı alana kadar tekrar tekrar sor
        while (number < 0) {
            System.out.print("Lütfen pozitif bir tam sayı girin: ");
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number < 0) {
                    System.out.println("Negatif bir değer girdiniz! Lütfen pozitif bir tam sayı girin.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Geçersiz giriş! Lütfen bir tam sayı girin.");
            }
        }

        // Sayının asal olup olmadığını kontrol et ve sonucu yazdır
        if (isPrime(number)) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }

        scanner.close();
    }

    // Bir sayının asal olup olmadığını kontrol eden fonksiyon
    private static boolean isPrime(int number) {
        // 2'den küçük sayılar asal sayı değildir (0 ve 1 dahil)
        if (number < 2) {
            return false;
        }
        // 2 ve 3 zaten asal sayıdır
        if (number == 2 || number == 3) {
            return true;
        }
        // 2'den büyük ve çift sayılar asal değildir
        if (number % 2 == 0) {
            return false;
        }
        // Sayının köküne kadar olan tek sayılarla bölünebilirliğini kontrol et
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        // Yukarıdaki koşullardan hiçbirine uymuyorsa, sayı asaldır
        return true;
    }
}
