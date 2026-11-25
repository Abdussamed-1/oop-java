package ders04;
public class EpostaBildirim implements BildirimKanali {
    @Override public void gonder(String alici, String mesaj) {
        System.out.printf("E-posta -> %s: %s%n", alici, mesaj);
    }
}
