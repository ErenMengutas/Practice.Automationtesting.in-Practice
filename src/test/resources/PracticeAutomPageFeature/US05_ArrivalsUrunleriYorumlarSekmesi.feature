Feature: Arrivals urunleri incelemeler sekmesi

  Scenario: Kullanici Arrivals ürünlerinin incelemeler sekmesinin gözüktüğünü test eder

    Given Kullanici "Pa" sitesine gider
    When Shop sekmesine tiklar
    And Geri gelmek için Home menüsüne tiklar
    And Ana sayfayı aşagiya kaydirir ve 3 adet Arrivals elementi olduğunu doğrular
    When Birinci Arrivals resmine tiklar
    And Dogru sayfaya gittiğini test eder
    Then Acılan sayfada ürün incelemeleri sekmesinin gözültüğünü test eder
    Then Acılan sayfada ürün incelemeleri sekmesinin tıklar
    And Be the first to review yazisinin gözüktüğünü test eder
    And Sayfayı kapatır