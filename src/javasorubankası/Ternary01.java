package javasorubankası;

public class Ternary01 {
    public static void main(String[] args) {
        /*
        Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"
         */

        String parola= "turkmen9";

        String sifre= parola.replaceAll(" ","").length()>7? "Geçerli Parola" : "Geçersiz Parola";

        System.out.println(sifre);



    }
}
