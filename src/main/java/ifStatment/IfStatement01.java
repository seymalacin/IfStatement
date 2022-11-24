package ifStatment;

public class IfStatement01 {
    public static void main(String[] args) {


         //If it rains I will cancel the picnic
        //if statment belli kodlari belli sartlara bagli olarak calistirma yapar

        //Example 1: sayı pozitif ise ekrana pozitif yazdiriniz.
        int s = 12;

        if(s>0){
            System.out.println("positive");

        }
        //Example 2: verien charcater buyuk harf ise ekrana " buyuk harf" yazdiriniz

        char ch = 'A';
        if (ch>='A'&& ch<='Z' ){
            System.out.println("buyuk harf");


        }
         /*
            && islemi sadece boolean ile kullanilir
                true && true = true
                true && false = false
                false && true = false
                false && false = false
            && islemi mukemmelliyetcidir, true sonucunu alabilmek icin hersey true olmalidir.
            Bir tane false varsa sonuc false demektir.
        */
        //Example 3: verilen bir sayi uc basamakli ise ekrana "uc basamaklı" yazdiriniz

        int n =123;
        n = Math.abs(n);// abs negatıf sayıyı pozıtıf sayıya cevırı
        if (n>99 && n<1000){ // n>=100 && n<=999 veya n>99 && n<1000
            System.out.println("uc basamakli");

        }
         //Example 4: verien bir sayiyi cift sayi ise ekrana cift sayi yazdiriniz.

         int p =14;
        p = Math.abs(p);// bu methodu yazmasak da java 0 i bulur p yı eksı bı sayı gırersek eger

        //"=" isareti atama oparotorodor , matematikteki esittir anamina geir
        // matematikteki esittir "=" sembolu javada "==" seklindedir
        //2+3 == 5

        if (p%2 == 0){
            System.out.println("cift sayi");

        }
         //Example 5: verilen bir sayiyi 300 den kucuk veya 1200 den buyuk ıse ekrana "Harika sayi" yazdirin
        int r = 250;
         if (r<300|| r>1200){
             System.out.println("harika sayi");
         }
       /*
             || islemi sadece boolean ile kullanilir.
                  true || true = true
                  true || false= true
                  false || true= true
                  false || false= false
            Not: || isleminde false alabilmek icin herseyin false olmasi gerekir.
                 || isleminde sadece bir tane true sonucu true yapmaya yeter
         */
    }

}

