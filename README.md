# cekino-back-end-test-algirotihmic-question
# Narsistic Numbers

1) Yazılan kod tamamen fonskiyonel olması açısından en ufak yerler bile method halinde yazıldı.
2) Üs Alma methodu için recursive kullanıldı.
3) enteredNumber methodunda gelen değer String olarak tutuldu ki, basamak sayısı arttığında ya da basamak sayısı azaldığında
dinamik olarak işlem yapılabilsin.
4) isNarsisticNumber methodunda kullanılan algoritma şu şekilde;
    a. Charachter tipindeki ArrayList'e String değerinde gelen number sayıyı ekle. (ArrayList diğer veriyapılarına göre ekleme konusunda çok daha performanslı.)
    b. 2. bir Integer tipinde arraylist tanımlandı ve ilk arraylistten gelen char veriler bu Integer list'e aktarıldı.
    c. String değerden gelen veri int'e çevrildi.
    d. Arraylist'in size()'ı kadar üs alınması gerektiğinden arraylist'in size()'ı pow diye bir değere atandı.
    (153, algoritmaya göre 3 elemanlı bir size olacak ve bu size değeri pow değerenie eşit olacak.)
    e. Yazılan recursive method ile Integer ArrayList'indeki her bir indisin teker teker üssü alındı ve toplandı.
    f. Son adımda ise eğer c adımından çıkan değer ile e adımından çıkan değer eşit ise true(Narsistic Sayı), değilse false döndürüldü.
    


# HATALAR

1) Bir basamaklı sayılar da narsistik sayı olma niteliği taşıyabilir. Bu durum kodlanmadı.
2) Negatif sayıların narsistliğinden bahsedilemez. Bu durum kodlanmadı.
3) Float ya da double sayıların narsistliğinden bahseddilemez. Bu durum kodlanmadı.
4) ArrayList ve recursive gibi ram'i işgal eden veriyapıları ve methodlar kullanıldı.


# DÜZELTMELER

Gerekli exception handlingler yazıldı. Negatif sayıların, double ya da float sayıların ve rakam olmayanların kontrolleri yazıldı.
Konuyla alakalı olarak, 0 harici sayıların kontrolu yapıldı.

Hatalar kısmında ise exception handling daha düzgün yazılabilirdi.

# DİKKAT

Kodu github'a push ederken Master Branch üzerinden conflict'e düştüm. Kodu FinishedBranch üzerinden clone'lamalısınız.

