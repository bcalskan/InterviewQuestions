package OkulProjesı;

import java.util.Scanner;

public class Depo {
    static Scanner scan = new Scanner(System.in);


    public static void anaMenü() throws InterruptedException {


        String secim = "";
        do {
            System.out.println("\t========= YILDIZ KOLEJI =========\n" +
                    "\t========= ANA MENÜ =========\n" +
                    "\t\t1-OKUL BILGILERI\n" +
                    "\t\t2-ÖGRETMEN MENÜ\n" +
                    "\t\t3-ÖGRENCI MENÜ\n" +
                    "\t\tQ-CIKIS");
            System.out.print("Tercih etmek istediginiz islemi seciniz : ");
            secim = scan.nextLine();

            switch (secim) {
                case "1":
                    okulBilgileriniYazdir();
                    break;
                case "2":
                    Ögretmen.ögretmenBilgileriniYazdir();
                    break;
                case "3":
                    Ögrenci.ögrenciBilgileriniYazdir();
                    break;
                case "Q":
                case "q":
                    cikisYap();
                    //case "q":
                    break;
                default:
                    System.out.println("Hatali giris yapildi.");
            }


        } while (!secim.equalsIgnoreCase("Q"));


    }//anaMenü

    public static void cikisYap() throws InterruptedException {
        System.out.println("Sistemden cikis yapiliyor...");
        Thread.sleep(3000);
        System.out.println("Cikis islemi gerceklestirildi.");
    }

    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("\t========= ANKARA ÜNIVERSITESI =========\n" + "\nAdres : " + Okul.adres + "\nTelefon Numarasi : " + Okul.telefonNumarasi);
        Thread.sleep(2000);
    }
}
