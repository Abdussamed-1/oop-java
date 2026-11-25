package ders01;

import java.util.Scanner;

public class HesapMakinesi {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        float sayi1 = 0, sayi2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = scanner.nextFloat();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = scanner.nextFloat();

        System.out.println("Toplam: " + topla(sayi1, sayi2));
        System.out.println("Fark: " + cikar(sayi1, sayi2));
        System.out.println("Çarpım: " + carp(sayi1, sayi2));
        System.out.println("Bölüm: " + bol(sayi1, sayi2));
        System.out.println("1'den 5'e toplam: " + birdenNyeTopla(5));
    }

    static double topla(double a, double b) { return a + b; }
    static double cikar(double a, double b) { return a - b; }
    static double carp(double a, double b) { return a * b; }

    static double bol(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Sıfıra bölme yapılamaz.");
        return a / b;
    }

    static int birdenNyeTopla(int n) {
        int toplam = 0;
        for (int i = 1; i <= n; i++) toplam += i;
        return toplam;
    }
}
