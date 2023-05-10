package javasorubankası;

public class sm10 {
    public static void main(String[] args) {
        /*
    10) Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
olmadığını kontrol etmek için kod yazınız.
Örnek:‘Ali Can’ için konsolda false yazmalıdır
     */
        String str =" Ali  Can ";
        int s1=str.trim().replaceAll("[a-zA-Z0-9]","").length();
        //System.out.println(s);

        System.out.println(s1==1);


        String s = "Tom Hanks";
        String trimlenmis = s.trim();
        String hicBoslukYok = trimlenmis.replaceAll("\\s", "");
        Boolean ortadaTekBoslukVarMi = trimlenmis.length() - hicBoslukYok.length()==1;
        System.out.println("ortada tek bosluk var " + ortadaTekBoslukVarMi);

        }
    }

