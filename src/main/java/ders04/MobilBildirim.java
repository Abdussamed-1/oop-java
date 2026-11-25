package ders04;
public class MobilBildirim implements BildirimKanali {
    @Override public void gonder(String alici, String mesaj) {
        System.out.printf("Mobil bildirim -> %s: %s%n", alici, mesaj);
    }
}
