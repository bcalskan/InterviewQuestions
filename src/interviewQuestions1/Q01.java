package interviewQuestions1;

import java.util.*;

public class Q01 {
    public static void main(String[] args) {

        /*Kullanicidan bir string alin
          Stringde var olan characterin sayisini ekrana yazdirin
          örnek : alacan ==> a=3, l=1, c=1, n=1,
                  abaaa ==> a=3; b=1;
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String str = scan.next();
        String arr[] = str.split("");


        int sayac = 0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1].equalsIgnoreCase(arr[i])) {
                sayac++;
            } else {
                System.out.println(arr[i-1]+" karakteri "+(sayac+1));
                sayac = 0;
            }

            if (i==arr.length - 1) {
                System.out.println(arr[i]+" karakteri "+(sayac+1));
            }
        }


//        System.out.println(Arrays.asList(arr));
//
//        Map<String, Integer> kelimeMap = new HashMap<String, Integer>();
//
//        for (String each : arr) {
//            if (kelimeMap.containsKey(each)) {
//                kelimeMap.put(each, kelimeMap.get(each) + 1);
//            } else kelimeMap.put(each, 1);
//        }
//        System.out.println(kelimeMap);


    }
}
