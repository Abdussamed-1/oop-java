package ders03;

public class TamZamanliCalisan extends Calisan {
    private final double aylikMaas;
    public TamZamanliCalisan(String ad, double aylikMaas) { super(ad); this.aylikMaas = aylikMaas; }
    @Override public double aylikMaasHesapla() { return aylikMaas; }
}
