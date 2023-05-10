package replit;

import java.util.ArrayList;
import java.util.Arrays;

public class Array07 {
    public static void main(String[] args) {
        /*
        Array i ARRAYLIST e çeviren Java Kodunu yazınız.

Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

```
Beklenen Çıktı:
```

```
[Python, JAVA, PHP, Perl, C#, C++]
```
         */
        String arr[] ={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        ArrayList<String> arr2 = new ArrayList<>();

        for (String w:arr) {
            arr2.add(w);
        }
        System.out.println(arr2);

        // ikinci yol ArrayList<String> arr2 = new ArrayList<>(Arrays.asList(arr));



    }
}
