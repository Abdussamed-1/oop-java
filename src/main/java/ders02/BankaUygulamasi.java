package ders02;

public class BankaUygulamasi {
    public static void main(String[] args) {
        BankaHesabi hesap = new BankaHesabi("TR001", "Ayşe", 1_000);
        hesap.paraYatir(250);
        boolean basarili = hesap.paraCek(400);
        System.out.println("Hesap sahibi: " + hesap.getHesapSahibi());
        System.out.println("Para çekme başarılı mı? " + basarili);
        System.out.println("Yeni bakiye: " + hesap.getBakiye());
    }
}
