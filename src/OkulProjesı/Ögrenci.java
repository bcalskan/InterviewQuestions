package OkulProjesı;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ögrenci {

    static Map<String, String> ögrencilerMap = new HashMap<>();
    static Scanner scan = new Scanner(System.in);

    public static void fakeÖgrenciEkle() {
        ögrencilerMap.put("275786464614", "Vefa, Can, 12, A");
        ögrencilerMap.put("798452313456", "Kaan, Yan, 11, D");
        ögrencilerMap.put("234647546487", "Buse, Can, 9, F");
        ögrencilerMap.put("113544889788", "Asli, San, 12, A");
        ögrencilerMap.put("114787546575", "Alper, Yan, 8, C");
    }//fakeÖgrenciEkle

    public static void ögrenciBilgileriniYazdir() throws InterruptedException {

        String ögrenciSecim = "";

        do {
            System.out.println("\t============= ANKARA ÜNIVERSITESI =============\n" +
                    "\t=========== ÖGRENCI MENU ============\n" +
                    "1- Ogrenci Listesi Yazdir\n" +
                    "2- Soyisimden Ogrenci Bulma\n" +
                    "3- Sinif ve Sube Ile Ogrenci Bulma\n" +
                    "4- Bilgilerini Girerek Ogrenci Ekleme\n" +
                    "5- Kimlik No Ile Kayit Silme\n" +
                    "A- ANAMENU\n" +
                    "Q- CIKIS");

            System.out.print("Lütfen yapmak istediginiz islemi seciniz : ");
            ögrenciSecim = scan.nextLine();

            switch (ögrenciSecim) {

                case "1":
                    ögrenciListesiniYazdir();
                    break;
                case "2":
                    soyIsimdenÖgrenciBul();
                    break;
                case "3":
                    sinifVeSubedenÖgrenciBul();
                    break;
                case "4":
                    ögrenciEkle();
                    break;
                case "5":
                    kayitSilÖgrenci();
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

        } while (!ögrenciSecim.equalsIgnoreCase("Q"));


    }

    public static void kayitSilÖgrenci() throws InterruptedException {
        System.out.print("Kaydini silmek istediginiz ögrencinin TC numarasini giriniz : ");
        String kayitSilÖgrenci = scan.nextLine();

        String silinecekValue = ögrencilerMap.get(kayitSilÖgrenci);
        String sonucValue = ögrencilerMap.remove(kayitSilÖgrenci);

        while (true) {
            try {
                boolean sonuc = silinecekValue.equalsIgnoreCase(sonucValue);
                if (sonuc) {
                    System.out.println("Kayit siliniyor...");
                    Thread.sleep(3000);
                    System.out.println("Kayit silme islemi gerceklestirildi.");
                    break;
                } else throw new Exception();
            } catch (Exception e) {
                System.out.println("Lütfen bekleyiniz...");
                Thread.sleep(3000);
                System.out.println("Girilen TC numarasina sahip ögrenci bulunamadi.");
                break;
            }
        }

    }

    public static void ögrenciEkle() throws InterruptedException {
        System.out.print("Eklemek istediginiz ögrencinin TC numarasini giriniz : ");
        String yeniTcNo = scan.nextLine();
        System.out.print("Eklemek istediginiz ögrencinin ismini giriniz : ");
        String yeniIsim = scan.nextLine();
        System.out.print("Eklemek istediginiz ögrencinin soyismini giriniz : ");
        String yeniSoyIsim = scan.nextLine();
        System.out.print("Eklemek istediginiz ögrencinin sinifini giriniz : ");
        String yeniSinif = scan.nextLine();
        System.out.print("Eklemek istediginiz ögrencinin subesini giriniz : ");
        String yeniSube = scan.nextLine();

        String eklenecekValue = yeniIsim + ", " + yeniSoyIsim + ", " + yeniSinif + ", " + yeniSube;
        ögrencilerMap.put(yeniTcNo, eklenecekValue);
        System.out.println("Ekleme yapiliyor...");
        Thread.sleep(3000);
        System.out.println("Ekleme basariyla gerceklesti.");
        System.out.println("Secim paneline yönlendiriliyorsunuz...");
        Thread.sleep(2000);

    }

    public static void sinifVeSubedenÖgrenciBul() throws InterruptedException {
        System.out.print("Aradiginiz ögrencinin sinifini giriniz : ");
        String sinifBul = scan.nextLine();
        System.out.print("Aradiginiz ögrencinin subesini giriniz : ");
        String subeBul = scan.nextLine();
        Set<Map.Entry<String, String>> ögrenciEntrySet = ögrencilerMap.entrySet();

        System.out.println("\t============= ANKARA ÜNIVERSITESI =============\n" +
                "\t============= ÖGRETMEN LISTESI =============\n"
                + "TCNO         ISIM  SOYISIM   SINIF  SUBE");

        for (Map.Entry<String, String> each : ögrenciEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(", ");

            if (sinifBul.equalsIgnoreCase(eachValueArr[2]) && subeBul.equalsIgnoreCase(eachValueArr[3])) {
                System.out.printf("%-11s %-6s  %-8s %-4s   %s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);
                System.out.println("\t*** Ögrenci bulundu. ***\t");
            }

        }

        Thread.sleep(1000);
        System.out.println("Secim paneline yönlendiriliyorsunuz...");
        Thread.sleep(3000);

    }

    public static void soyIsimdenÖgrenciBul() throws InterruptedException {

        System.out.print("Aradiginiz ögrencinin soyismini giriniz : ");
        String soyIsimBul = scan.nextLine();
        Set<Map.Entry<String, String>> ögrenciEntrySet = ögrencilerMap.entrySet();

        System.out.println("\t============= ANKARA ÜNIVERSITESI =============\n" +
                "\t============= ÖGRENCI SOYISMI LISTESI =============\n"
                + "TCNO         ISIM  SOYISIM   SINIF  SUBE");

        for (Map.Entry<String, String> each : ögrenciEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(", ");

            if (soyIsimBul.equalsIgnoreCase(eachValueArr[1])) {
                System.out.printf("%-11s %-6s  %-8s %-4s   %s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);
            }
        }//for
        Thread.sleep(1000);
        System.out.println("Secim paneline yönlendiriliyorsunuz...");
        Thread.sleep(3000);

    }

    public static void ögrenciListesiniYazdir() throws InterruptedException {

        System.out.println("\t============= ANKARA ÜNIVERSITE =============\n" +
                "\t============= ÖGRENCI LISTESI =============\n"
                + "TCNO         ISIM  SOYISIM   SINIF  SUBE");

        Set<Map.Entry<String, String>> ögrenciEntrySet = ögrencilerMap.entrySet();

        for (Map.Entry<String, String> each : ögrenciEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(", ");
            System.out.printf("%-11s %-6s  %-8s %-4s   %s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);
        }//for

        Thread.sleep(1000);
        System.out.println("Secim paneline yönlendiriliyorsunuz...");
        Thread.sleep(3000);

    }
}
