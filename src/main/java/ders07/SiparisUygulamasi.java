package ders07;
public class SiparisUygulamasi {
    public static void main(String[] args) {
        UrunRepository repo = new UrunRepository();
        repo.kaydet(new Urun(1, "Klavye", 850));
        repo.kaydet(new Urun(2, "Fare", 450));
        repo.kaydet(new Urun(3, "Monitör", 5_500));
        Siparis siparis = new SiparisServisi(repo).siparisOlustur(new int[]{1, 2, 3});
        System.out.println("Siparişteki ürün sayısı: " + siparis.getUrunler().size());
        System.out.printf("Toplam tutar: %.2f TL%n", siparis.toplamTutar());
    }
}
