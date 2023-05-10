package javasorubankası;

public class sm11 {
    public static void main(String[] args) {
        /*
        Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod
yazınız

‘ Ali ’ için kodunuz konsolda false yazmalıdır
 ‘Ali’ için kodunuz konsolda true yazmalıdır
         */

     // String s =" Ali ";
     // System.out.println(s.replaceAll("[^\\s]","").length()>0);

     // String str =" Ali ";
     // boolean b1= str.replaceAll("[A-Za-z0-9]", "").length()==0;
     // System.out.println(b1);

        String s1 = " Tom ";
        String trimlenmis = s1.trim();
        Boolean sonuc = s1.equals(trimlenmis);
        System.out.println("basinda ve sonunda bosluk var mi : " + !sonuc);

        String myString = " Ali ";

        if (myString.trim().equals(myString)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
