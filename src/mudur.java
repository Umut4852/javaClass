public class mudur extends calisan{
    private int yetkiSayisi;
    public mudur(int id, String isim, String gorevi, double maas,int yetkiSayisi) {
        super(id, isim, gorevi, yetkiSayisi);
        this.yetkiSayisi=yetkiSayisi;
    }
    public void maasDuzelt(double miktar){
        System.out.println("Çalışanlara "+miktar+"TL zam yapıldı");
    }


    @Override
    public void calisanGoster() {
        System.out.println("Bilgiler...");
        System.out.println("id: "+getId());
        System.out.println("ismi: "+getIsim());
        System.out.println("Görevi: "+getGorevi());
        System.out.println("Maaşı: "+getMaas());
        System.out.println("Çalışan sayısı: "+this.yetkiSayisi);
    }
}
