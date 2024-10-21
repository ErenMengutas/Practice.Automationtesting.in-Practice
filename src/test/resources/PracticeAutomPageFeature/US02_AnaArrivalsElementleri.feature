Feature: US02 Ana sayfa Arrivals elementleri testi

  Scenario: TC01 Kullanıcı practice.automationtesting sitesinde 3 adet Arrivals elementi olduğunu doğrular

    Given Kullanici "Pa" sitesine gider
    When Shop sekmesine tiklar
    And Geri gelmek için Home menüsüne tiklar
    And Ana sayfayı aşagiya kaydirir ve 3 adet Arrivals elementi olduğunu doğrular
    And Sayfayı kapatır