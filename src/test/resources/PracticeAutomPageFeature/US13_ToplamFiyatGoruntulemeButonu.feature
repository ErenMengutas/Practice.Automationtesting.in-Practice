Feature: Toplam fiyat görme

  Scenario: Kullanici sepete eklemiş olduğu urunlerin toplam fiyatını görebildiğini test eder

    Given Kullanici "Pa" sitesine gider
    When Shop sekmesine tiklar
    And Geri gelmek için Home menüsüne tiklar
    And Ana sayfayı aşagiya kaydirir ve 3 adet Arrivals elementi olduğunu doğrular
    When Birinci Arrivals resmine tiklar
    And Dogru sayfaya gittiğini test eder
    When Sepete ekle butonunun kullanılabilir olduğunu test eder
    When Urun fiyatinin gozuktugunu test eder
    When Sepete ekle butonuna tiklar
    When Sepete gitmek için View Basket butonuna tiklar
    When Sepete urun eklendigini test eder
    When Sepetteki urunlerin toplam fiyatinin gözüktüğünü test eder
    And Sayfayı kapatır