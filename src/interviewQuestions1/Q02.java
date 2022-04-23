package interviewQuestions1;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String kelime = scan.next();

        System.out.print("Bir sayi giriniz : ");
        int sayi = scan.nextInt();

        System.out.println(method(kelime, sayi));

    }

    private static String method(String kelime, int sayi) {
        String str = "";
        char ilkHarf = kelime.charAt(0); //e
        char sonHarf = kelime.charAt(kelime.length() - 1); //a

        for (int i = 0; i < sayi; i++) {
            str += (ilkHarf + "" + sonHarf);
        }
        return str;
    }//method sonu

}//main sonu



