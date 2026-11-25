# Java ile Nesne Tabanlı Programlama

Bu depo, Java ve nesne tabanlı programlamayı (OOP) giriş seviyesinden başlayarak küçük uygulamalarla öğretir. Örnekleri sırayla çalıştır. Kodu yalnızca okumak yerine önce sonucu tahmin et, sonra çalıştır ve en sonda alıştırmayı kendin değiştir.

## Gerekli araçlar

- JDK 17 veya daha yeni bir sürüm
- Bir terminal ve istediğin bir editör (IntelliJ IDEA, VS Code vb.)

Sürümü kontrol et:

```bash
java -version
javac -version
```

Tüm örnekleri derle:

```bash
mkdir -p out
javac -d out $(find src/main/java -name "*.java")
```

Bir örneği çalıştırmak için:

```bash
java -cp out ders01.HesapMakinesi
java -cp out ders02.BankaUygulamasi
java -cp out ders03.CalisanUygulamasi
java -cp out ders04.BildirimUygulamasi
java -cp out ders05.KutuphaneUygulamasi
java -cp out ders06.AlgoritmaUygulamasi
java -cp out ders07.SiparisUygulamasi
```

## Öğrenme sırası

| Ders | Konu | Uygulama | Öğreneceğin kalıp |
|---|---|---|---|
| 1 | Değişken, koşul, döngü, metot | Hesap makinesi | Metodu tek sorumlulukla yazma |
| 2 | Sınıf, nesne, constructor, kapsülleme | Banka hesabı | Veriyi davranışla birlikte tutma |
| 3 | Kalıtım, `abstract`, overriding, çok biçimlilik | Maaş hesaplama | Template Method fikri |
| 4 | Interface ve bağımlılıkların ayrılması | Bildirim gönderme | Strategy |
| 5 | `List`, `Map`, `Set`, Stream API | Kütüphane | Repository |
| 6 | Arama, sıralama, karmaşıklık | Algoritma karşılaştırma | Strategy + algoritma seçimi |
| 7 | Bütün konuların birleşimi | Sipariş sistemi | Model–Repository–Service |

## Java'da sık kullanılan hazır metotlar

- `String`: `length`, `isBlank`, `equals`, `equalsIgnoreCase`, `contains`, `substring`, `split`, `toLowerCase`
- Sayılar: `Math.min`, `Math.max`, `Math.abs`, `Math.pow`, `Integer.parseInt`
- `List`: `add`, `get`, `set`, `remove`, `contains`, `size`, `sort`
- `Map`: `put`, `get`, `getOrDefault`, `containsKey`, `keySet`, `values`
- `Set`: `add`, `contains`, `remove` — tekrar eden değerleri saklamaz
- Stream: `filter`, `map`, `sorted`, `distinct`, `reduce`, `toList`

Hazır metotları öğrenmek önemlidir; fakat 6. derste arama algoritmalarını elle yazarak bu metotların arkasındaki düşünceyi de göreceksin.

## OOP'nin dört temel ilkesi

1. **Kapsülleme:** Alanları `private` tut; nesnenin durumunu kontrollü metotlarla değiştir.
2. **Soyutlama:** Kullanıcının ne yapılacağını bilmesi yeterli olsun; nasıl yapıldığı sınıfın içinde kalsın.
3. **Kalıtım:** Gerçek bir “bir türüdür” ilişkisi varsa ortak davranışı üst sınıfa taşı.
4. **Çok biçimlilik:** Aynı interface veya üst sınıf üzerinden farklı nesneleri çalıştır.

Kalıtımı yalnızca kod tekrarını azaltmak için kullanma. Çoğu zaman interface ve nesne bileşimi (`composition`) daha esnektir.

## Algoritma çalışırken kullanacağın yöntem

1. Girdiyi ve beklenen çıktıyı örnekle yaz.
2. Problemi küçük metotlara böl.
3. Uç durumları belirle: boş liste, negatif sayı, bulunamayan değer gibi.
4. Önce doğru ve okunabilir çözümü yaz.
5. Zaman ve bellek karmaşıklığını değerlendir.
6. Gerekliyse veri yapısını veya algoritmayı değiştir.

Örnek: Bir listede kitap adına göre arama doğrusal aramayla `O(n)` sürer. Çok sık arama yapılacaksa kitapları bir `Map` içinde tutmak ortalama `O(1)` erişim sağlayabilir. Daha hızlı olan çözüm her zaman daha iyi değildir; veri miktarı, okunabilirlik ve güncelleme maliyeti de önemlidir.

## Alıştırmalar

1. Hesap makinesine mod alma ve üs alma işlemleri ekle.
2. Banka hesabına günlük para çekme limiti koy.
3. Maaş uygulamasına prim alan yeni bir çalışan türü ekle.
4. Bildirim uygulamasına `SmsBildirim` ekle; mevcut servisi değiştirme.
5. Kütüphanede yazara göre arama ve kitap iade etme özellikleri ekle.
6. Binary search algoritmasını azalan sıralı dizi için uyarlamayı dene.
7. Siparişe stok kontrolü ve indirim stratejisi ekle.

## Sonraki adımlar

Bu örneklerden sonra sırasıyla exception yönetimi, generics, dosya işlemleri, JUnit testleri, SOLID ilkeleri ve Spring Boot çalışabilirsin. Özellikle her örnek için test yazmak, metotlarının küçük ve bağımsız olup olmadığını anlamanın en iyi yollarından biridir.
