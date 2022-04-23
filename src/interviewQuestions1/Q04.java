package interviewQuestions1;


import java.util.Scanner;

public class Q04 {
    static Scanner scan = new Scanner(System.in);
    static int girisHakki = 3;

    public static void main(String[] args) {
        //string olan pin kodunuzu kontrol eden bir kod yaziniz

        String dogruPin = "dogrupin";
        String pin = "";
        int girisHakki = 3;

        method1(dogruPin, pin);
    }

    private static void method1(String dogruPin, String pin) {
        while (true) {
            System.out.print("Sifrenizi giriniz : ");
            pin = scan.nextLine();

            if (pin.equals(dogruPin)) {
                System.out.println("Sifre dogru.");
                break;
            } else {
                System.out.println("Yanlis giris yaptiniz.");
                girisHakki--;
                System.out.println("Kalan deneme hakkiniz : " + (girisHakki));
                method1(dogruPin, pin);
            }

            if (girisHakki == 0) {
                System.out.println("Giris hakkiniz kalmadi.");
                break;
            }

        }
    }

}

