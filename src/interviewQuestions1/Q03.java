package interviewQuestions1;

import java.util.Scanner;

public class Q03 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        Ask user enter a positive number and check if it is prime or not
        Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
        */

        System.out.print("Pozitif bir tam sayi giriniz : ");
        int sayi = 0;


        while (true) {
            try {
                sayi = scan.nextInt();
                if (sayi <= 1) {
                    throw new ArithmeticException();
                } else break;

            } catch (ArithmeticException e) {
                System.out.println("1´den büyük bir sayi giriniz.");
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("Sayi giriniz.");
            }
        }


        boolean asalMi = true;
        if (sayi >= 2) {
            for (int i = 0; i < sayi; i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) System.out.println("Girdiginiz sayi asaldir.");
            else System.out.println("Girdiginiz sayi asal degildir.");

        }

    }


}

