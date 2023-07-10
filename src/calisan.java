public class calisan {
    private int id;
    private String isim;
    private String gorevi;
    private double maas;

    public calisan(int id,String isim,String gorevi,double maas){
        this.id=id;
        this.isim=isim;
        this.gorevi=gorevi;
        this.maas=maas;
    }
    public void calisanGoster(){
        System.out.println("id: "+this.id);
        System.out.println("ismi: "+this.isim);
        System.out.println("Görevi: "+this.gorevi);
        System.out.println("Maaşı: "+this.maas);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }
}
