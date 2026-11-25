package ders07;
public class SiparisServisi {
    private final UrunRepository urunRepository;
    public SiparisServisi(UrunRepository urunRepository) { this.urunRepository = urunRepository; }
    public Siparis siparisOlustur(int[] urunIdleri) {
        Siparis siparis = new Siparis();
        for (int id : urunIdleri) {
            Urun urun = urunRepository.idIleBul(id)
                    .orElseThrow(() -> new IllegalArgumentException("Ürün bulunamadı: " + id));
            siparis.urunEkle(urun);
        }
        return siparis;
    }
}
