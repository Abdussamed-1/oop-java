package ders03;

public class SaatlikCalisan extends Calisan {
    private final double saatUcreti;
    private final int calisilanSaat;
    public SaatlikCalisan(String ad, double saatUcreti, int calisilanSaat) {
        super(ad); this.saatUcreti = saatUcreti; this.calisilanSaat = calisilanSaat;
    }
    @Override public double aylikMaasHesapla() { return saatUcreti * calisilanSaat; }
}
