Feature: US01 Ana sayfa Sliders elementleri testi

  Scenario: TC01 Kullanıcı practice.automationtesting sitesinde 3 adet Sliders elementi olduğunu doğrular

    Given Kullanici "Pa" sitesine gider
    When Shop sekmesine tiklar
    And Geri gelmek için Home menüsüne tiklar
    Then Ana sayfa Selenium kitabı olduğunu doğrular
    Then Sayfayı sağa kaydirir
    Then HTML kitabı olduğunu doğrular
    Then Sayfayı sağa kaydirir
    Then JavaScript kitabı olduğunu doğrular
    And Sayfayı kapatır

