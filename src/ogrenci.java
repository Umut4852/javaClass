public class ogrenci {
    private String adi;
    private String bolumu;
    private int yasi;

    public void setOgrenciAdi(String _adi) {
        adi = _adi;
    }

    public String getOgrenciAdi() {
        return adi;
    }

    public String getBolumu() {
        return bolumu;
    }

    public void setBolumu(String bolumu) {
        this.bolumu = bolumu;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        if(18<=yasi)
        {
            this.yasi=yasi;
        }
       else{
            System.out.println("Yaşı 17 den büyük olmalı");
        }
    }
}
