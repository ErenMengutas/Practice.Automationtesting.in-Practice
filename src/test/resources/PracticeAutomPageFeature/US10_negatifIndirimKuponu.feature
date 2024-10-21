Feature: Negatif Indirim kuponu uygulama testi

  Scenario: Kullanici 450 rupi altina indirim kuponu uygulayamamali

    Given Kullanici "Pa" sitesine gider
    When Shop sekmesine tiklar
    And  Geri gelmek için Home menüsüne tiklar
    And  Ana sayfayı aşagiya kaydirir ve 3 adet Arrivals elementi olduğunu doğrular
    When ikinci Arrivals resmine tiklar
    And  ikinci ürünün sayfasına gittiğini test eder
    When Sepete ekle butonunun kullanılabilir olduğunu test eder
    When Urun fiyatinin gozuktugunu test eder
    When Sepete ekle butonuna tiklar
    When Sepete gitmek için View Basket butonuna tiklar
    When Sepete urun eklendigini test eder
    When indirim kuponu olarak "indirimKuponu" girer ve enter tuşuna basar
    And 450 rupi altina indirim kuponu uygulanamaz yazisinin gözüktüğünü test eder
    And Sayfayı kapatır
