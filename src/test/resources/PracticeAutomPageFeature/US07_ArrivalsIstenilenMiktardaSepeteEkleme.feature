Feature: Arrivals istenilen miktarinda sepete ekleme testi


  Scenario: Kullanici arrivals urunlerinin  istenilen miktarinda sepete eklendigini test eder

    Given Kullanici "Pa" sitesine gider
    When Shop sekmesine tiklar
    And Geri gelmek için Home menüsüne tiklar
    And Ana sayfayı aşagiya kaydirir ve 3 adet Arrivals elementi olduğunu doğrular
    When Birinci Arrivals resmine tiklar
    And Dogru sayfaya gittiğini test eder
    When Sepete ekle butonunun kullanılabilir olduğunu test eder
    When Urun fiyatinin gozuktugunu test eder
    When Sepete istenilen miktarda "20" ürün ekler
    When Sepete urun eklendi yazisinin gozuktuğunu test eder
    And Sayfayı kapatır