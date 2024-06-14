
   import java.util.Scanner;

        public class Main {

            // EBOB (GCD) hesaplayan fonksiyon
            public static int ebob(int a, int b) {
                // Euclid algoritması kullanılarak EBOB hesaplanıyor
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                return a;
            }

            // EKOK (LCM) hesaplayan fonksiyon
            public static int ekok(int a, int b) {
                // EKOK, iki sayının çarpımının EBOB'una bölünmesiyle bulunur
                return (a * b) / ebob(a, b);
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Kullanıcıdan iki sayı alınıyor
                System.out.print("Birinci sayıyı girin: ");
                int sayi1 = scanner.nextInt();

                System.out.print("İkinci sayıyı girin: ");
                int sayi2 = scanner.nextInt();

                // EBOB ve EKOK hesaplanıyor
                int ebobSonuc = ebob(sayi1, sayi2);
                int ekokSonuc = ekok(sayi1, sayi2);

                // Sonuçlar ekrana yazdırılıyor
                System.out.println("Girilen sayılar: " + sayi1 + " ve " + sayi2);
                System.out.println("EBOB: " + ebobSonuc);
                System.out.println("EKOK: " + ekokSonuc);

                // Kaynakları serbest bırakmak için Scanner kapatılıyor
                scanner.close();
            }
        }




