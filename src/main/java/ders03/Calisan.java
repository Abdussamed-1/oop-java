package ders03;

public abstract class Calisan {
    private final String ad;

    protected Calisan(String ad) { this.ad = ad; }
    public String getAd() { return ad; }
    public abstract double aylikMaasHesapla();

    public void maasBordrosuYazdir() {
        System.out.printf("%s - %.2f TL%n", ad, aylikMaasHesapla());
    }
}
