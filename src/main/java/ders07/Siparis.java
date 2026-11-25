package ders07;
import java.util.ArrayList;
import java.util.List;
public class Siparis {
    private final List<Urun> urunler = new ArrayList<>();
    public void urunEkle(Urun urun) { urunler.add(urun); }
    public double toplamTutar() { return urunler.stream().mapToDouble(Urun::getFiyat).sum(); }
    public List<Urun> getUrunler() { return List.copyOf(urunler); }
}
