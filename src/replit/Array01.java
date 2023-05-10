package replit;

import java.util.ArrayList;
import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        /*
        Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.

not: Test datadaki değerleri kullanınız.

Test Data:

[1232, 1134,2345,1022]

[Java, Python, PHP, C#, C Programming, C++]

Beklenen Çıktı:
`
[1022,1134,1232,2345]

[C Programming, C#, C++, Java, PHP, Python]
         */

        Integer arr[] = {1232, 1134,2345,1022};
        System.out.println(Arrays.toString(arr));
        String arr2[] = {"C Programming", "C#", "C++", "Java", "PHP", "Python"};
        System.out.println(Arrays.toString(arr2));


    }
}
