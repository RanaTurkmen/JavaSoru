package javasorubankası;

public class loop02 {
    public static void main(String[] args) {
         /*
         Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
         Örneğin; accessories ´ ces
         */
        String isim ="accessories";
        String sum = "";
        for (int i = 0; i < isim.length() ; i++) {

            if (isim.indexOf(isim.charAt(i))!=isim.lastIndexOf(isim.charAt(i))){
                if (!sum.contains(isim.substring(i,i+1))) {
                    sum += isim.substring(i, i + 1) + " ";
                }
            }
        }

        System.out.println(sum);
    }
}
