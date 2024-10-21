Feature: Güncelleme butonu kullanilarak urun silme

  Scenario: Kullanici güncelleme butonu kullanilarak urun silinebildiğini test eder

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
    When Urun miktar kutucugunun kullanilabilir oldugunu dogrular
    When Urun miktar kutucuguna "0" girer
    When Sepeti güncelle butonunun kullanilabilir olduğunu test eder
    When Sepeti güncelle butonuna tiklar
    And Sepetin bos olduğunu test eder
    And Sayfayı kapatır