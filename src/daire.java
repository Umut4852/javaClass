public class daire implements Uzay {
    private double yaricap;

    public daire(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double getAlan() {
        return Math.PI * yaricap * yaricap;
    }

    @Override
    public double getCevre() {
        return Math.PI * yaricap * 2;
    }
}
