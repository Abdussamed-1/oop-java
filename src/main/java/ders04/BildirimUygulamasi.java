package ders04;
public class BildirimUygulamasi {
    public static void main(String[] args) {
        new BildirimServisi(new EpostaBildirim()).haberVer("ali@example.com", "Siparişiniz hazır.");
        new BildirimServisi(new MobilBildirim()).haberVer("kullanici-42", "Yeni mesajınız var.");
    }
}
