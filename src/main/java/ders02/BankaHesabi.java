package ders02;

public class BankaHesabi {
    private final String iban;
    private final String hesapSahibi;
    private double bakiye;

    public BankaHesabi(String iban, String hesapSahibi, double ilkBakiye) {
        if (ilkBakiye < 0) throw new IllegalArgumentException("İlk bakiye negatif olamaz.");
        this.iban = iban;
        this.hesapSahibi = hesapSahibi;
        this.bakiye = ilkBakiye;
    }

    public void paraYatir(double miktar) {
        pozitifMiktariDogrula(miktar);
        bakiye += miktar;
    }

    public boolean paraCek(double miktar) {
        pozitifMiktariDogrula(miktar);
        if (miktar > bakiye) return false;
        bakiye -= miktar;
        return true;
    }

    private void pozitifMiktariDogrula(double miktar) {
        if (miktar <= 0) throw new IllegalArgumentException("Miktar pozitif olmalıdır.");
    }

    public String getIban() { return iban; }
    public String getHesapSahibi() { return hesapSahibi; }
    public double getBakiye() { return bakiye; }
}
