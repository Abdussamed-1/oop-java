package ders05;
public class Kitap {
    private final String isbn, ad, yazar;
    public Kitap(String isbn, String ad, String yazar) { this.isbn = isbn; this.ad = ad; this.yazar = yazar; }
    public String getIsbn() { return isbn; }
    public String getAd() { return ad; }
    public String getYazar() { return yazar; }
    @Override public String toString() { return ad + " - " + yazar; }
}
