package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PracticeAutomPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class PracticeAutomPageStepdefinitions {

    PracticeAutomPage practiceAutomPage=new PracticeAutomPage();
    Actions actions=new Actions(Driver.getDriver());
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    Faker faker=new Faker();


    @Given("Kullanici {string} sitesine gider")
    public void kullanici_sitesine_gider(String paUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("paUrl"));

    }
    @When("Shop sekmesine tiklar")
    public void shop_sekmesine_tiklar() {
        practiceAutomPage.shopButonu.click();

    }
    @When("Geri gelmek için Home menüsüne tiklar")
    public void geri_gelmek_için_home_menüsüne_tiklar() {
        practiceAutomPage.homeSekmeButonu.click();
    }

    @When("Sayfayı kapatır")
    public void sayfayı_kapatır() {
      //Hooks classinin içerisinde quit driver olduğu ve her classtan sonra çalıştığı için bu adım boş bırakılmıştır
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }


    @And("Ana sayfayı aşagiya kaydirir ve {int} adet Arrivals elementi olduğunu doğrular")
    public void anaSayfayıAşagiyaKaydirirVeAdetArrivalsElementiOlduğunuDoğrular(int istenilenSayi) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertEquals(practiceAutomPage.arrivalsList.size(),istenilenSayi);
    }

    @Then("Ana sayfada {int} adet Arrivals elementi olduğunu doğrular")
    public void anaSayfadaAdetArrivalsElementiOlduğunuDoğrular(int arg0) {
    }


    @Then("Ana sayfa Selenium kitabı olduğunu doğrular")
    public void ana_sayfa_selenium_kitabı_olduğunu_doğrular() {
        Assert.assertTrue(practiceAutomPage.seleniumBook.isDisplayed());
    }

    @Then("HTML kitabı olduğunu doğrular")
    public void html_kitabı_olduğunu_doğrular() {
        wait.until(ExpectedConditions.visibilityOf(practiceAutomPage.htmlBook));

        Assert.assertTrue(practiceAutomPage.htmlBook.isDisplayed());

    }

    @Then("JavaScript kitabı olduğunu doğrular")
    public void java_script_kitabı_olduğunu_doğrular() {
        wait.until(ExpectedConditions.visibilityOf(practiceAutomPage.javaScriptBook));
        Assert.assertTrue(practiceAutomPage.javaScriptBook.isDisplayed());

    }


    @Then("Sayfayı sağa kaydirir")
    public void sayfayıSağaKaydirir() {
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
    }

    @When("Birinci Arrivals resmine tiklar")
    public void birinciArrivalsResmineTiklar() {
        practiceAutomPage.birinciArrivalsSekmesi.click();
    }

    @And("Dogru sayfaya gittiğini test eder")
    public void dogruSayfayaGittiğiniTestEder() {
        String expectedUrl="https://practice.automationtesting.in/product/selenium-ruby/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Then("Acılan sayfada ürün aciklamalari sekmesinin gözültüğünü test eder")
    public void acılanSayfadaÜrünAciklamalariSekmesininGözültüğünüTestEder() {
        Assert.assertTrue(practiceAutomPage.arrivalsUrunincelemeleriSekmesi.isDisplayed());
    }

    @Then("Acılan sayfada ürün aciklamalari sekmesinin tıklar")
    public void acılanSayfadaÜrünAciklamalariSekmesininTıklar() {
        practiceAutomPage.arrivalsUrunincelemeleriSekmesi.click();
    }

    @Then("Acılan sayfada ürün incelemeleri sekmesinin gözültüğünü test eder")
    public void acılanSayfadaÜrünIncelemeleriSekmesininGözültüğünüTestEder() {
        Assert.assertTrue(practiceAutomPage.arrivalsUrunYorumlariSekmesi.isDisplayed());
    }

    @Then("Acılan sayfada ürün incelemeleri sekmesinin tıklar")
    public void acılanSayfadaÜrünIncelemeleriSekmesininTıklar() {
        practiceAutomPage.arrivalsUrunYorumlariSekmesi.click();
    }

    @And("Be the first to review yazisinin gözüktüğünü test eder")
    public void beTheFirstToReviewYazisininGözüktüğünüTestEder() {
        Assert.assertTrue(practiceAutomPage.beTheFirstToReviewYaziElementi.isDisplayed());
    }

    @When("Sepete ekle butonunun kullanılabilir olduğunu test eder")
    public void sepeteEkleButonununKullanılabilirOlduğunuTestEder() {
        Assert.assertTrue(practiceAutomPage.sepeteEklemeButonu.isEnabled());
    }

    @When("Urun fiyatinin gozuktugunu test eder")
    public void urunFiyatininGozuktugunuTestEder() {
        Assert.assertTrue(practiceAutomPage.fiyatYaziElementi.isEnabled());
    }

    @When("Sepete ekle butonuna tiklar")
    public void sepeteEkleButonunaTiklar() {
        practiceAutomPage.sepeteEklemeButonu.click();
    }


    @When("Sepete istenilen miktarda {string} ürün ekler")
    public void sepeteIstenilenMiktardaÜrünkler(String istenilenMiktar) {
        practiceAutomPage.miktarYazıElementi.clear();
        practiceAutomPage.miktarYazıElementi.sendKeys(istenilenMiktar);
        practiceAutomPage.sepeteEklemeButonu.click();
    }


    @When("Sepete urun eklendi yazisinin gozuktuğunu test eder")
    public void sepeteUrunEklendiYazisininGozuktuğunuTestEder() {
        Assert.assertTrue(practiceAutomPage.sepeteUrunEklendiYaziElementi.isDisplayed());
    }

    @When("Sepete gitmek için View Basket butonuna tiklar")
    public void sepeteGitmekIçinViewBasketButonunaTiklar() {
        practiceAutomPage.viewBasketButonu.click();
    }

    @When("Sepete urun eklendigini test eder")
    public void sepeteUrunEklendiginiTestEder() {
        Assert.assertTrue(practiceAutomPage.sepettekiUrunElementleriList.size()>0);
    }


    @When("indirim kuponu olarak {string} girer ve enter tuşuna basar")
    public void indirimKuponuOlarakGirerVeEnterTuşunaBasar(String indirimKuponu) {

        actions.sendKeys(practiceAutomPage.indirimKuponuSekmesi,ConfigReader.getProperty(indirimKuponu)+Keys.ENTER).perform();
    }

    @And("toplamda {string} rupi indirim olduğunu doğrular")
    public void toplamdaRupiIndirimOlduğunuDoğrular(String expectedIndirimMiktari) {
        String actualMiktar=practiceAutomPage.indirimMiktari.getText().replaceFirst("₹","");
        Assert.assertEquals(expectedIndirimMiktari,actualMiktar);

    }

    @When("ikinci Arrivals resmine tiklar")
    public void ikinciArrivalsResmineTiklar() {
        practiceAutomPage.ikinciArrialSekmesi.click();
    }



    @And("ikinci ürünün sayfasına gittiğini test eder")
    public void ikinciÜrününSayfasınaGittiğiniTestEder() {
        String expectedUrl="https://practice.automationtesting.in/product/thinking-in-html/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @And("{int} rupi altina indirim kuponu uygulanamaz yazisinin gözüktüğünü test eder")
    public void rupiAltinaIndirimKuponuUygulanamazYazisininGözüktüğünüTestEderVeSayfayiKapatir(int arg0) {
        Assert.assertTrue(practiceAutomPage.indirimYapilamazYaziElementi.isDisplayed());

    }

    @When("Sepete eklenmiş urunu sepetten siler")
    public void sepeteEklenmişUrunuSepettenSiler() {
        practiceAutomPage.sepettekiUrunElementleriList.size();

        for (int i = 0; i <practiceAutomPage.sepettekiUrunElementleriList.size() ; i++) {

            if (practiceAutomPage.sepettekiUrunuIptalEtmeButonu.isDisplayed())
            {
                practiceAutomPage.sepettekiUrunuIptalEtmeButonu.click();
            }


        }
    }

    @When("Sepetin bos olduğunu test eder")
    public void sepetinBosOlduğunuTestEder() {
        Assert.assertTrue(practiceAutomPage.sepetBosYaziElementi.isDisplayed());

    }

    @When("Urun miktar kutucugunun kullanilabilir oldugunu dogrular")
    public void urunMiktarKutucugununKullanilabilirOldugunuDogrular() {
        Assert.assertTrue(practiceAutomPage.urunMiktarGuncellemeKutucugu.isEnabled());
    }

    @When("Urun miktar kutucuguna farkli bir rakam girer")
    public void urunMiktarKutucugunaFarkliBirRakamGirer() {
        String randomNum= String.valueOf(faker.number().numberBetween(1,50));
       practiceAutomPage.urunMiktarGuncellemeKutucugu.clear();
       practiceAutomPage.urunMiktarGuncellemeKutucugu.sendKeys(randomNum);

    }

    @When("Sepeti güncelle butonunun kullanilabilir olduğunu test eder")
    public void sepetiGüncelleButonununKullanilabilirOlduğunuTestEder() {
        Assert.assertTrue(practiceAutomPage.sepetGuncellemeButonu.isDisplayed());
    }

    @When("Sepeti güncelle butonuna tiklar")
    public void sepetiGüncelleButonunaTiklar() {
        practiceAutomPage.sepetGuncellemeButonu.click();
    }

    @When("Sepetteki urunlerin toplam fiyatinin gözüktüğünü test eder")
    public void sepettekiUrunlerinToplamFiyatininGözüktüğünüTestEder() {
        Assert.assertTrue(practiceAutomPage.totalFiyatYazisi.isDisplayed());
    }

    @When("Urun miktar kutucuguna {string} girer")
    public void urunMiktarKutucugunaGirer(String miktarSayisi) {
        practiceAutomPage.urunMiktarGuncellemeKutucugu.clear();
        practiceAutomPage.urunMiktarGuncellemeKutucugu.sendKeys(miktarSayisi);
    }

    @When("Ara toplam tutarinin Toplam tutardan az olduğunu test eder")
    public void araToplamTutarininToplamTutardanAzOlduğunuTestEder() {

       String araToplam=practiceAutomPage.araToplamFiyatYazisi.getText().replaceFirst("₹","");
       String totalFiyat=practiceAutomPage.totalFiyatYazisi.getText().replaceFirst("₹","");

       double dblAraToplamTutari= Double.parseDouble(araToplam);
       double dblTotalFiyatTutari= Double.parseDouble(totalFiyat);



        Assert.assertTrue(dblTotalFiyatTutari>dblAraToplamTutari);

    }

    @When("Odemeye devam et butonuna tiklar")
    public void odemeyeDevamEtButonunaTiklar() {
        practiceAutomPage.odemeyeDevamEtButonu.click();
    }

    @When("Odeme sayfasinda oldugunu test eder")
    public void odemeSayfasindaOldugunuTestEder() {
    }

    @When("{string}+{string} sayfasinda olduğunu test eder")
    public void sayfasindaOlduğunuTestEder(String paUrl, String checkout) {
        String expectedUrl=ConfigReader.getProperty("paUrl")+checkout;

        Assert.assertEquals(expectedUrl,Driver.getDriver().getCurrentUrl());

    }


    @Then("Siparis formunun kulllanilabilir olduğunu test eder")
    public void siparisFormununKulllanilabilirOlduğunuTestEder() {
        Assert.assertTrue(practiceAutomPage.firstnameButonu.isEnabled());
        Assert.assertTrue(practiceAutomPage.lastNameButonu.isEnabled());
        Assert.assertTrue(practiceAutomPage.companyNameButonu.isEnabled());
        Assert.assertTrue(practiceAutomPage.emailButonu.isEnabled());
        Assert.assertTrue(practiceAutomPage.phoneButonu.isEnabled());



    }

    @Then("Siparis formunu doldurur")
    public void siparisFormunuDoldurur() {


        String ulke=faker.address().country();
        String state=faker.address().state();
        practiceAutomPage.firstnameButonu.sendKeys(faker.name().firstName());
        practiceAutomPage.lastNameButonu.sendKeys(faker.name().lastName());
        practiceAutomPage.companyNameButonu.sendKeys(faker.name().firstName());
        practiceAutomPage.emailButonu.sendKeys(faker.internet().emailAddress());
        practiceAutomPage.phoneButonu.sendKeys(faker.phoneNumber().subscriberNumber());
        actions.sendKeys(practiceAutomPage.ulkeButonu,"Denmark"+Keys.ENTER).perform();
        practiceAutomPage.addresButonu.sendKeys(faker.address().streetAddress());
        practiceAutomPage.zipCode.sendKeys(faker.address().zipCode());
        practiceAutomPage.cityButonu.sendKeys(faker.address().city());

    }

    @And("Odeme turunu secer")
    public void odemeTurunuSecer() {
       ReusableMethods.click(practiceAutomPage.chashButonu);
    }

    @Then("odemeyi tamamla butonuna tiklar")
    public void odemeyiTamamlaButonunaTiklar() {
       actions.moveToElement(practiceAutomPage.placeOrderButonu);
       ReusableMethods.click(practiceAutomPage.placeOrderButonu);
    }

    @Then("Siparis detayları sayfasinda olduğunu doğrular")
    public void siparisDetaylarıSayfasindaOlduğunuDoğrular() {
        Assert.assertTrue(practiceAutomPage.siparisDetaylariYaziElementi.isDisplayed());
    }
}
