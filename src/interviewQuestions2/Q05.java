package interviewQuestions2;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

         /*
        Create a function that takes an array and the difference between the largest
        and the smallest numbers.
        Ask user to enter array elements.
        kullanıcının girdigi bir array'in en buyuk elemani ile
        en kucuk elemanının  farkını bulan bir method create ediniz.
        */

        System.out.println("Eleman sayisi : ");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        int arr[] = new int[sayi];

        for (int i = 0; i < sayi; i++) {
            System.out.println("Eleman giriniz : ");
            int eleman = scan.nextInt();
            arr[i] = eleman;
        }

        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int min = arr[0];

        System.out.println("Fark : " + (max - min));


    }

}


