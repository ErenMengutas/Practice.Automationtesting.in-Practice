Feature: Ana Sayfa Arrivals aciklamalari

  Scenario:Kullanici ana sayfaki Arrivals'lara tikladiktan sonra aciklama sekmesinin gözüktügünü test eder

    Given Kullanici "Pa" sitesine gider
    When Shop sekmesine tiklar
    And Geri gelmek için Home menüsüne tiklar
    And Ana sayfayı aşagiya kaydirir ve 3 adet Arrivals elementi olduğunu doğrular
    When Birinci Arrivals resmine tiklar
    And Dogru sayfaya gittiğini test eder
    Then Acılan sayfada ürün aciklamalari sekmesinin gözültüğünü test eder
    Then Acılan sayfada ürün aciklamalari sekmesinin tıklar
    And Sayfayı kapatır