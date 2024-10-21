Feature: US03 Ana Sayfa Arrivals Resimleri testi

  Scenario: TC01 Kullanıcı Ana Sayfadaki Arrivals Resimlerinin kullanilabilir olduğunu test eder

    Given Kullanici "Pa" sitesine gider
    When Shop sekmesine tiklar
    And Geri gelmek için Home menüsüne tiklar
    And Ana sayfayı aşagiya kaydirir ve 3 adet Arrivals elementi olduğunu doğrular
    When Birinci Arrivals resmine tiklar
    And Dogru sayfaya gittiğini test eder
    And Sayfayı kapatır