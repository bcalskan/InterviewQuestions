package OkulProjesı;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import static OkulProjesı.Depo.scan;

public class Ögretmen {
    static Map<String, String> ögretmenlerMap = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void fakeÖgretmenEkle() {
        ögretmenlerMap.put("123456987411", "Ebru, Can, 1980, Matematik");
        ögretmenlerMap.put("123456987412", "Meryem, Yan, 1981, Fizik");
        ögretmenlerMap.put("123456987413", "Berk, Can, 1982, Kimya");
        ögretmenlerMap.put("123456987414", "Mehmet, San, 1983, Kimya");
        ögretmenlerMap.put("123456987415", "Atilay, Yan, 1984, Matematik");
    }//fakeÖgretmenEkle

    public static void ögretmenBilgileriniYazdir() throws InterruptedException {

        String ögretmenSecim = "";
        do {
            System.out.println("\t============= ANKARA ÜNIVERSITESI =============\n" +
                    "\t=========== OGRETMEN MENU ============\n" +
                    "1- Ogretmenler Listesi Yazdir\n" +
                    "2- Soyisimden Ogretmen Bulma\n" +
                    "3- Branstan Ogretmen Bulma\n" +
                    "4- Bilgilerini Girerek Ogretmen Ekleme\n" +
                    "5- Kimlik No Ile Kayit Silme\n" +
                    "A- ANAMENU\n" +
                    "Q- ÇIKIŞ\n");

            System.out.print("Tercih etmek istediginiz islemi seciniz : ");
            ögretmenSecim = scanner.nextLine();

            switch (ögretmenSecim) {
                case "1":
                    ögretmenListesiYazdir();
                    break;

                case "2":
                    soyIsimdenÖgretmenBul();
                    break;

                case "3":
                    branstanÖgretmenBul();
                    break;

                case "4":
                    ögretmenEkle();
                    break;

                case "5":
                    kayitSil();
                    break;

                case "A":
                    Depo.anaMenü();
                    break;

                case "Q":
                case "q":
                    Depo.cikisYap();
                    break;

                default:
                    System.out.println("Hatali giris yapildi.");

            }

        } while (!ögretmenSecim.equalsIgnoreCase("Q"));

    }

    private static void kayitSil() throws InterruptedException {
        System.out.print("Kaydini silmek istediginiz ögretmenin TC numarasini giriniz : ");
        String kayitSilTC = scan.nextLine();

        String silinecekValue = ögretmenlerMap.get(kayitSilTC);
        String sonucValue = ögretmenlerMap.remove(kayitSilTC); //true

        while (true) {
            try {
                boolean sonuc = sonucValue.equals(silinecekValue); //true

                if (sonuc == true) {
                    System.out.println("Kayit siliniyor...");
                    Thread.sleep(1000);
                    System.out.println("Kayit silme islemi gerceklestirildi.");
                    break;
                } else throw new Exception();

            } catch (Exception e) {
                System.out.println("Lütfen bekleyiniz...");
                Thread.sleep(1000);
                System.out.println("Girilen TC numarasina sahip ögretmen bulunamadi.");
                break;
            }
        }//while
    }

    private static void ögretmenEkle() throws InterruptedException {
        System.out.print("Eklemek istediginiz ögretmenin TC numarasini giriniz : ");
        String yeniTcNo = scan.nextLine();
        System.out.print("Eklemek istediginiz ögretmenin ismini giriniz : ");
        String yeniIsim = scan.nextLine();
        System.out.print("Eklemek istediginiz ögretmenin soyismini giriniz : ");
        String yeniSoyIsim = scan.nextLine();
        System.out.print("Eklemek istediginiz ögretmenin dogum yilini giriniz : ");
        String yeniDogumYili = scan.nextLine();
        System.out.print("Eklemek istediginiz ögretmenin bransini giriniz : ");
        String yeniBrans = scan.nextLine();

        String eklenecekValue = yeniIsim + ", " + yeniSoyIsim + ", " + yeniDogumYili + ", " + yeniBrans;
        ögretmenlerMap.put(yeniTcNo, eklenecekValue);

        System.out.println("Ekleme yapiliyor...");
        Thread.sleep(3000);
        System.out.println("Ekleme basariyla gerceklesti.");
        Thread.sleep(2000);
    }

    private static void branstanÖgretmenBul() throws InterruptedException {
        System.out.print("Aradaginiz ögretmenin bransini giriniz : ");
        String bransBul = scanner.nextLine();

        System.out.println("\t============= ANKARA ÜNIVERSITESI =============\n" +
                "\t===== BRANS ILE ÖGRETMEN ARAMA =====\n"
                + "TCNO         ISIM       SOYISIM   D.YILI  BRANS");

        Set<Map.Entry<String, String>> ögretmenEntrySet = ögretmenlerMap.entrySet();

        for (Map.Entry<String, String> each : ögretmenEntrySet) {
            String eachKey = each.getKey();
            String eachValues = each.getValue();

            String eachValueArr[] = eachValues.split(", ");

            if (bransBul.equalsIgnoreCase(eachValueArr[3])) {
                System.out.printf("%11s %-6s %6s     %4s %8s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);
            }

        }//for

        Thread.sleep(1000);
        System.out.println("Secim paneline yönlendiriliyorsunuz...");
        Thread.sleep(3000);
    }

    private static void soyIsimdenÖgretmenBul() throws InterruptedException {
        System.out.print("Aradaiginiz ögretmenin soyismini giriniz : ");
        String soyIsimBul = scanner.nextLine();

        System.out.println("\t============= ANKARA ÜNIVERSITESI =============\n" +
                "\t===== SOYISIM ILE ÖGRETMEN ARAMA =====\n"
                + "TCNO         ISIM       SOYISIM   D.YILI  BRANS");

        Set<Map.Entry<String, String>> ögretmenEntrySet = ögretmenlerMap.entrySet();

        for (Map.Entry<String, String> each : ögretmenEntrySet) {
            String eachKey = each.getKey();
            String eachValues = each.getValue();

            String eachValueArr[] = eachValues.split(", ");

            if (soyIsimBul.equalsIgnoreCase(eachValueArr[1])) {
                System.out.printf("%11s %-6s %6s     %4s %8s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);
            }

        }//for

        Thread.sleep(1000);
        System.out.println("Secim paneline yönlendiriliyorsunuz...");
        Thread.sleep(3000);


    }

    public static void ögretmenListesiYazdir() throws InterruptedException {

        System.out.println("\t============= ANKARA ÜNIVERSITESI =============\n" +
                "\t============= ÖGRETMEN LISTESI =============\n"
                + "TCNO        ISIM   SOYISIM   D.YILI  BRANS");

        Set<Map.Entry<String, String>> ögretmenEntrySet = ögretmenlerMap.entrySet();

        for (Map.Entry<String, String> each : ögretmenEntrySet) {
            String eachKey = each.getKey();
            String eachValues = each.getValue();

            String eachValueArr[] = eachValues.split(", ");
            System.out.printf("%11s %-6s %6s %4s %8s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);

        }//for

        Thread.sleep(1000);
        System.out.println("Secim paneline yönlendiriliyorsunuz...");
        Thread.sleep(3000);
    }

}



