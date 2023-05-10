package javasorubankası;

public class if02 {
    public static void main(String[] args) {
        /*
        Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
Not: Çözümdeki koşulların sıralarına dikkat ediniz
         */

        String sifre ="turkmen.";

        if ( sifre.length()==8){
            System.out.println("Geçerli Şifre");
        } else if ( sifre.contains(" ") ) {
            System.out.println("Şifrede boşluk karakteri kullanmayınız");
        } else if (sifre.length()!=8 &&  !sifre.contains(" ") ){
            System.out.println("Geçersiz Şifre");
        }





    }
}
