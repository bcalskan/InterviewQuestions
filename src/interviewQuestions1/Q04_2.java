package interviewQuestions1;

import java.util.Scanner;

public class Q04_2 {

    static int pin = 0;
    static Scanner scan = new Scanner(System.in);
    static int dogruPin = 1234;
    static int girisHakki = 3;

    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {


        while (true) {
            try {
                System.out.println("pin giriniz");
                pin = scan.nextInt();
                break;
            } catch (Exception e) {
                String str = scan.nextLine();
                System.out.println("numerik value gir");
            }
        }

        giris(pin, dogruPin);
    } //main

    public static void giris(int pin, int dogruPin) {


        while (true) {

            if (pin == (dogruPin)) {
                System.out.println("dogru pin");
                break;
            } else {
                scan.nextLine();
                System.out.println("yanlis giris");
                girisHakki--;
                System.out.println("kalan hak : " + girisHakki);
                if (girisHakki == 0) {
                    System.out.println("giris hakki doldu");
                    break;
                }
                giris(pin, dogruPin);
            }


        }


    }//giris
}