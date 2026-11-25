package ders05;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class KitapRepository {
    private final List<Kitap> kitaplar = new ArrayList<>();
    public void kaydet(Kitap kitap) { kitaplar.add(kitap); }
    public Optional<Kitap> isbnIleBul(String isbn) {
        return kitaplar.stream().filter(k -> k.getIsbn().equals(isbn)).findFirst();
    }
    public List<Kitap> adindaGecen(String aranan) {
        String kucukAranan = aranan.toLowerCase();
        return kitaplar.stream().filter(k -> k.getAd().toLowerCase().contains(kucukAranan)).toList();
    }
    public List<Kitap> tumunuGetir() { return List.copyOf(kitaplar); }
}
