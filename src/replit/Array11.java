package replit;

import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        /*
        Kullanıcının gireceği iki **binary** sayıyı toplayan  Java kodunu yazınız.

Test Data:
birinci binary number: 100010
ikinci  binary number: 110010
Beklenen Çıktı:
1010100
   */

        Scanner input=new Scanner(System.in);
        System.out.println("İki sayi girin");

        // İlk binary sayıyı okuyun
        String binary1 = input.nextLine();

        // İkinci binary sayıyı okuyun
        String binary2 = input.nextLine();

        // Binary sayıları integer'a dönüştürün
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);


        // Sayıları toplayın
        int sum = decimal1 + decimal2;

        // Sonucu binary olarak yazdırın
        String binarySum = Integer.toBinaryString(sum);
        System.out.println("Toplam: " + binarySum);

    }
}
