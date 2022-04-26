package interviewQuestions2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
        0-1-1-2-3-5-8-13-21-34....
        */

        /*
        Dizinin üç ve üçün katlarındaki terimleri 2’ye, dört ve dördün katlarındaki terimleri 3’e, beş ve beşin katlarındaki terimleri 5’e bölünür.
        Dizinin herhangi ardışık on teriminin toplamı her zaman 11’in katıdır.
        Dizinin ikinci teriminden sonraki her ardışık iki terimi aralarında asaldır.
        Dizinin herhangi ardışık iki teriminin kareleri toplamı yine bu dizinin bir terimidir.
         */

        System.out.print("Sayi cinsinden bir sinir belirleyiniz : ");
        Scanner scan = new Scanner(System.in);
        int sinir = scan.nextInt();

        int fib[] = new int[sinir];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= sinir-1; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
        System.out.println(Arrays.toString(fib));


    }
}


