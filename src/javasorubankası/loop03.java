package javasorubankası;

public class loop03 {
    public static void main(String[] args) {
        /*
         Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
         aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.
         */

        String string="123325";

        StringBuilder reversedString = new StringBuilder(string).reverse();

        if (string.equals(reversedString.toString())){
            System.out.println("Polindromdur");
        }else System.out.println("Polindrom değildir");








    }
}
