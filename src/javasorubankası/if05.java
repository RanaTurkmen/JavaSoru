package javasorubankası;

public class if05 {
    public static void main(String[] args) {
        /*
        Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"
         */

        int k1=4;
        int k2=4;
        int k3=4;

        if (k1==k2 && k2==k3){
            System.out.println("Eşkenar Üçgen");
        }else if (k1==k2 || k2==k3 || k1==k3){
            System.out.println("İkizkenar Üçgen");
        }else System.out.println("Çeşit Kenar Üçgen");



    }
}
