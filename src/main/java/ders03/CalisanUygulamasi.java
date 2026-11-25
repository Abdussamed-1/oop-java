package ders03;

import java.util.List;

public class CalisanUygulamasi {
    public static void main(String[] args) {
        List<Calisan> calisanlar = List.of(
                new TamZamanliCalisan("Mehmet", 35_000),
                new SaatlikCalisan("Zeynep", 200, 120));
        for (Calisan calisan : calisanlar) calisan.maasBordrosuYazdir();
    }
}
