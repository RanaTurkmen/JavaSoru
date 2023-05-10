package javasorubankası;

import java.time.LocalDate;

public class DT03 {
    public static void main(String[] args) {
        /*
    3) Ali'nin doğum tarihi 4 Haziran 1997'dir. Ali'nin doğum tarihinden 2 yıl, 3 ay ve 12 gün
sonraki tam tarihi bulmak için kodu yazınız.
     */
        LocalDate ali =LocalDate.of(1997,6,4);
        LocalDate tarih = ali.plusYears(2).plusMonths(3).plusDays(12);
        System.out.println(tarih);


    }
}
