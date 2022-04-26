package interviewQuestions2;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*
 Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
     (0, 1, 153, 370, 371, 407, 1634)
     153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
     370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
     1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634  */

        System.out.print("Bir sayi giriniz : ");
        Scanner scan = new Scanner(System.in);
        String sayi = scan.next();
        armstrongMu(sayi);

    }

    private static void armstrongMu(String sayi) {
        String basamak[] = sayi.split("");
        int toplam = 0;

        for (int i = 0; i < basamak.length; i++) {
            toplam += Math.pow(Integer.parseInt(basamak[i]), basamak.length);
        }

        if (Integer.parseInt(sayi) == toplam) {
            System.out.println("Armstrong");
        } else System.out.println("Degil");


    }
}
