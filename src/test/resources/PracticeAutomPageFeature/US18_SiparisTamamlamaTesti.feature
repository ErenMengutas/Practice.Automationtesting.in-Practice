Feature: Siparis tamamlama

  Scenario: Kullanici siparis formunu doldurarak siparis verebildiğini test eder
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
    When Ara toplam tutarinin Toplam tutardan az olduğunu test eder
    When Odemeye devam et butonuna tiklar
    When "Pa"+"checkout/" sayfasinda olduğunu test eder
    Then Siparis formunun kulllanilabilir olduğunu test eder
    Then Siparis formunu doldurur
    And Odeme turunu secer
    Then odemeyi tamamla butonuna tiklar
    Then Siparis detayları sayfasinda olduğunu doğrular
    And Sayfayı kapatır