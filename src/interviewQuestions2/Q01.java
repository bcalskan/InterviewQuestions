package interviewQuestions2;

import java.util.Scanner;

public class Q01 {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
      gösteren program yazınız */

    public static void main(String[] args) {
        System.out.print("Bir sayi giriniz : ");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        armstrong(sayi);
        sayiyaKadar(sayi);

    }

    private static void armstrong(int sayi) {
        int toplam = 0;
        int rakam = 0;
        int girilenSayi = sayi;

        while (sayi > 0) {
                rakam = sayi % 10;
                toplam += Math.pow(rakam, 3);
                sayi /= 10;
        }
       // System.out.println("Toplam : " + toplam);
        if (toplam == girilenSayi) {
            System.out.println("Armstrong");
        } else System.out.println("Armstrong degil.");

    }

    private static void sayiyaKadar(int sayi) {
        for (int i = 1; i <= sayi; i++) {
            armstrong(i);
        }
    }


}//main

