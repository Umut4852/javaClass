import java.util.Scanner;

public class Main {
    public static void mean(int[] arr) {  //array de ortalama örneği
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("ortalama: " + total / arr.length);
    }

    public static void main(String[] args) {
        Insan insan = new Insan();
        insan.adi = "umut can";
        insan.soyadi = "Güler";
        insan.yasi = 24;
        System.out.println("Insan class özellikleri: " + insan.adi + " " + insan.soyadi + " " + insan.yasi);

        ogrenci ogr = new ogrenci();
        ogr.setOgrenciAdi("Umut Can");
        ogr.setBolumu("BSM");
        ogr.setYasi(15);
        System.out.println("Öğrenci adi " + ogr.getOgrenciAdi());
        System.out.println("Öğrenci bölümü " + ogr.getBolumu());
        System.out.println("Öğrenci yaşı " + ogr.getYasi());

        avukat avkt = new avukat("Osman", "Ceza");
        avkt.avukatInfo();
        avukat avkt2 = new avukat();
        avkt2.avukatInfo();

       /*  Scanner scanner=new Scanner(System.in);  // array
        int[] arr2 = new int[3];
        System.out.println("arr2 değerlerini giriniz ...");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        mean(arr2);
*/
        kurye _kurye = new kurye(1, "Umut Can", "kurye", 15600);
        _kurye.calisanGoster();

        mudur _mudur = new mudur(1, "Ferhat", "Yönetici", 1000000,10);
        _mudur.calisanGoster();
        _mudur.maasDuzelt(1000);

        Animal animal=new Animal("hayvan ");
        Bird bird=new Bird("limon ");
        animal.speak();
        bird.speak();
        Animal animal2=new Bird("Limon ");
        animal2.speak();

        daire _daire = new daire(5); // interface
        System.out.println("Dairenin Alanı: " + _daire.getAlan());
        System.out.println("Dairenin Çevresi: " + _daire.getCevre());
    }
}