# Practice Automation Testing Test Otomasyon Projesi

Bu proje, [https://practice.automationtesting.in/](https://practice.automationtesting.in/) web sitesi üzerinde yer alan kullanıcı senaryolarının, Java, Selenium ve Cucumber kullanılarak BDD (Behavior Driven Development) yaklaşımıyla otomasyonunu içermektedir. Maven altyapısı ile yapılandırılmıştır.

## Kullanılan Teknolojiler

- Java  
- Selenium WebDriver  
- Cucumber 
- Maven  
- IntelliJ IDEA

## Projenin Amacı

Bu proje ile BDD yöntemi kullanılarak kullanıcı davranışlarının otomasyon testlerine nasıl dönüştürülebileceği hedeflenmiştir.
Feature dosyalarında yazılan doğal dildeki senaryolar, Java sınıfları ile adım adım (Step Definitions) kodlanmıştır.

## Uygulanan Test Senaryoları

Toplam **18 adet** kullanıcı senaryosu otomasyona dönüştürülmüştür. Bazı önemli senaryolar şunlardır:

- `US01_AnaSayfaSlidersElementleri` – Anasayfa slider öğelerinin doğrulanması  
- `US02_AnaArrivalsElementleri` – Anasayfa "Arrivals" başlığının altındaki ürünlerin kontrolü  
- `US05_ArrivalsUrunleriYorumlarSekmesi` – Ürün detay sayfasında yorumlar sekmesinin test edilmesi  
- `US09_indirimKuponuUygulama` – Geçerli kupon ile indirim uygulanması  
- `US11_SepettenUrunSilme` – Sepetten ürün kaldırma işlevinin doğrulanması  
- `US17_SiprarisFormu` – Sipariş formu doldurma senaryosu  
- `US18_SiparisTamamlamaTesti` – Satın alma işleminin başarıyla tamamlanması  
