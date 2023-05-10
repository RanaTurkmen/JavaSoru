package javasorubankası;



public class Switch04 {
    public static void main(String[] args) {
        /*
        Cinsiyet "Erkek" ise "Erkek" yazdırınız.
Cinsiyet "Kadın" ise "Kız" yazdırınız.
Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
Not : Bu seçenekler dışındakilerini yoksayınız.
         */
        String cinsiyet ="kadın";
        boolean s=cinsiyet.equalsIgnoreCase("Kadın");
        switch (cinsiyet){
            case "Kadın" :
                System.out.println("Kız");
                break;
            case "Erkek" :
                System.out.println("Erkek");
                break;
            default:
                System.out.println("Diğerleri");
        }

    }
}
