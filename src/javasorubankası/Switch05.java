package javasorubankası;

public class Switch05 {
    public static void main(String[] args) {
        /*
         Belirli bir yılın belirli bir ayındaki gün sayısını görüntülemek için bir kod yazınız.
Örnek: 2000 yılının Şubat ayında gün sayısı 29.
         */

        int yil =2000;
        int ay= 2;

        switch (ay){
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("31 ceker");
                break;
            case 2:
                if (yil%4==0 && (yil % 100 != 0) || (yil % 400 == 0)){
                    System.out.println("Şubat ayında gün sayısı 29.");
                }else System.out.println("Şubat ayında gün sayısı 28.");
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                System.out.println("30 ceker");
                break;
            default:
                System.out.println("gecersiz");

        }







    }
}
