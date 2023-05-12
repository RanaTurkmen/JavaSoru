package javasorubankası;

public class Ternary02 {
    public static void main(String[] args) {
        /*
        Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "
         */

        int k1 =3;
        int k2=4;
        int k3=5;

        String ucgen= k1==k2 && k2==k3 ? "Eşkenar Üçgen" : (k1==k2||k2==k3 ||k1==k3)? "İkizkenar Üçgen" : "Çeşit Kenar Üçgen ";
        System.out.println(ucgen);
    }
}
