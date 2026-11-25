package ders06;
public class DogrusalArama implements AramaAlgoritmasi {
    @Override public int ara(int[] sayilar, int hedef) {
        for (int i = 0; i < sayilar.length; i++) if (sayilar[i] == hedef) return i;
        return -1;
    }
    @Override public String ad() { return "Doğrusal arama O(n)"; }
}
