package CALISMALAR;

import java.util.Random;

public class Odev01Medium {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum),
    aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {
        System.out.println("randomNum(65) = " + randomNum(65));


    }

    public static int randomNum(int max) {
        Random random = new Random();
        return random.nextInt(max + 1);

    }}