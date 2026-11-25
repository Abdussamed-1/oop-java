package ders07;
public class Urun {
    private final int id;
    private final String ad;
    private final double fiyat;
    public Urun(int id, String ad, double fiyat) {
        if (fiyat < 0) throw new IllegalArgumentException("Fiyat negatif olamaz.");
        this.id = id; this.ad = ad; this.fiyat = fiyat;
    }
    public int getId() { return id; }
    public String getAd() { return ad; }
    public double getFiyat() { return fiyat; }
}
