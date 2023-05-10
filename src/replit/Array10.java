package replit;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

```
Test Data:
```

```
sentence -> "Java is fun"
```

```
reversed **-> "**fun is Java**"**
```

         */
        String str ="Java is fun";
        String arr[]=str.split(" ");
        String str1="";
        for (int i = arr.length-1; i >=0 ; i--) {
            str1=str1+" " + arr[i];
        }
        System.out.println(str1);


    }

    }

