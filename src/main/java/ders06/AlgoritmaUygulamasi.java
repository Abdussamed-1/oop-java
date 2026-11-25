package ders06;
import java.util.Arrays;
public class AlgoritmaUygulamasi {
    public static void main(String[] args) {
        int[] sayilar = {9, 2, 7, 1, 5};
        new AramaServisi(new DogrusalArama()).sonucuYazdir(sayilar, 7);
        int[] sirali = Arrays.copyOf(sayilar, sayilar.length);
        Arrays.sort(sirali);
        System.out.println("Sıralı dizi: " + Arrays.toString(sirali));
        new AramaServisi(new IkiliArama()).sonucuYazdir(sirali, 7);
    }
}
