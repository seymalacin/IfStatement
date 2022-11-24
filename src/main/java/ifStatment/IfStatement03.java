package ifStatment;

import java.util.Scanner;

public class IfStatement03 {

    /*
      Iki tane String'in birbirine esit olup olmadigini anlamak icin "==" degil, "equals()" kullaniniz.
      Iki tane String'in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir
          i)equals() ==> Buyuk harf ve kucuk harfi onemser. "A" ile "a" farklidir
          ii)equalsIgnoreCase() ==> Buyuk harf kucuk harfi onemsemez. "A" ile "a" aynidir.
  */

    public static void main(String[] args) {


        //Example 1: kullanicidan gun isimlerini aliniz, o gunu hafta sonu mu hafta içi mi oldugunu kullaniciya soyleyiniz
        //           Pazartesi==>Hafta içi   Pazar==>Hafta sonu

        Scanner input = new Scanner(System.in);
        System.out.println("bir gun ismi giriniz");
        String gun = input.next();

        if (gun.equalsIgnoreCase("pazar")) {
            System.out.println("hafta sonu");

        } else if (gun.equalsIgnoreCase("pazartesi")) {
            System.out.println("hafta içi");

        } else if (gun.equalsIgnoreCase("sali")) {
            System.out.println("hafta ici");

        } else if (gun.equalsIgnoreCase("carsamba")) {
            System.out.println("hafta ici");

        } else if (gun.equalsIgnoreCase("persembe")) {
            System.out.println("hafta ici");

        } else if (gun.equalsIgnoreCase("cuma")) {
            System.out.println("hafta ici");

        } else if (gun.equalsIgnoreCase("cumartesi")) {
            System.out.println("hafta sonu");

        }else {
            System.out.println("gecerli bir gun ismi giriniz");

        }
        //2.yol:
        if(gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta sonu...");
        }else if(gun.equalsIgnoreCase("Pazartesi") ||
                 gun.equalsIgnoreCase("Sali") ||
                 gun.equalsIgnoreCase("Carsamba") ||
                 gun.equalsIgnoreCase("Persembe") ||
                 gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta ici...");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");
        }
        //3.yol:
        boolean haftaSonu = gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");


        boolean haftaİci = gun.equalsIgnoreCase("Pazartesi") ||
                           gun.equalsIgnoreCase("Sali") ||
                           gun.equalsIgnoreCase("Carsamba") ||
                           gun.equalsIgnoreCase("Persembe") ||
                          gun.equalsIgnoreCase("Cuma");
        if (haftaSonu) {
            System.out.println("hafta sonu");
        } else if (haftaİci) {
            System.out.println("hafta içi");
        }else {
            System.out.println("geceri bir gun ismi giriniz");

    }


    }


    }

