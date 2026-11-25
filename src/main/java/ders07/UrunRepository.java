package ders07;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
public class UrunRepository {
    private final Map<Integer, Urun> urunler = new HashMap<>();
    public void kaydet(Urun urun) { urunler.put(urun.getId(), urun); }
    public Optional<Urun> idIleBul(int id) { return Optional.ofNullable(urunler.get(id)); }
}
