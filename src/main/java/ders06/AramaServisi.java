package ders06;
public class AramaServisi {
    private final AramaAlgoritmasi algoritma;
    public AramaServisi(AramaAlgoritmasi algoritma) { this.algoritma = algoritma; }
    public void sonucuYazdir(int[] sayilar, int hedef) {
        System.out.printf("%s -> %d sayısının indeksi: %d%n", algoritma.ad(), hedef, algoritma.ara(sayilar, hedef));
    }
}
