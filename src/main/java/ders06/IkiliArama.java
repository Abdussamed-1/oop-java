package ders06;
public class IkiliArama implements AramaAlgoritmasi {
    @Override public int ara(int[] sayilar, int hedef) {
        int sol = 0, sag = sayilar.length - 1;
        while (sol <= sag) {
            int orta = sol + (sag - sol) / 2;
            if (sayilar[orta] == hedef) return orta;
            if (sayilar[orta] < hedef) sol = orta + 1;
            else sag = orta - 1;
        }
        return -1;
    }
    @Override public String ad() { return "İkili arama O(log n)"; }
}
