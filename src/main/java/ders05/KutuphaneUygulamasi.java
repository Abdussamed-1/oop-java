package ders05;
public class KutuphaneUygulamasi {
    public static void main(String[] args) {
        KitapRepository repo = new KitapRepository();
        repo.kaydet(new Kitap("1", "Sefiller", "Victor Hugo"));
        repo.kaydet(new Kitap("2", "Suç ve Ceza", "Dostoyevski"));
        repo.kaydet(new Kitap("3", "Temiz Kod", "Robert C. Martin"));
        System.out.println("Adında 'kod' geçenler: " + repo.adindaGecen("kod"));
        repo.isbnIleBul("2").ifPresentOrElse(
                kitap -> System.out.println("Bulundu: " + kitap),
                () -> System.out.println("Kitap bulunamadı."));
    }
}
