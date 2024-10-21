package pages;

import io.cucumber.java.bs.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;
import java.util.logging.XMLFormatter;

public class PracticeAutomPage {
    public PracticeAutomPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//a[text()='Shop']" )
    public WebElement shopButonu;

    @FindBy(xpath ="//a[text()='Home']" )
    public WebElement homeSekmeButonu;

    @FindBy(xpath ="//*[@class='woocommerce']" )
    public List<WebElement> arrivalsList;

    @FindBy(xpath =" //*[@alt='Shop Selenium Books']" )
    public WebElement seleniumBook;

    @FindBy(xpath ="//*[@alt='HTML']" )
    public WebElement htmlBook;

    @FindBy(xpath ="//*[@alt='JavaScript']" )
    public WebElement javaScriptBook;


    @FindBy(xpath ="//*[@title='Selenium Ruby']" )
    public WebElement birinciArrivalsSekmesi;


    @FindBy(xpath =" //a[@href=\"#tab-description\"]" )
    public WebElement arrivalsUrunincelemeleriSekmesi;

    @FindBy(xpath = "//a[@href=\"#tab-reviews\"]")
    public WebElement arrivalsUrunYorumlariSekmesi;

    @FindBy(xpath = "//h3[@class=\"comment-reply-title\"]")
    public WebElement beTheFirstToReviewYaziElementi;

    @FindBy(xpath = "//*[@class='single_add_to_cart_button button alt']")
    public WebElement sepeteEklemeButonu;

    @FindBy(className = "price")
    public WebElement fiyatYaziElementi;

    @FindBy(xpath =" //input[@type='number']")
    public WebElement miktarYazıElementi;

    @FindBy(xpath ="//div[@class='woocommerce-message']")
    public WebElement sepeteUrunEklendiYaziElementi;

    @FindBy(xpath ="//a[@class='button wc-forward']")
    public WebElement viewBasketButonu;

    @FindBy(xpath ="//tr[@class='cart_item']")
    public List<WebElement> sepettekiUrunElementleriList;

    @FindBy(name = "coupon_code")
    public WebElement indirimKuponuSekmesi;

    @FindBy(xpath = "//*[text()='50.00']")
    public WebElement indirimMiktari;

    @FindBy(xpath = "  (//*[@class='attachment-shop_catalog size-shop_catalog wp-post-image'])[2]")
    public WebElement ikinciArrialSekmesi;

    @FindBy(xpath = "(//*[@class='woocommerce-Price-amount amount'])[5]")
    public WebElement totalFiyatYazisi;

    @FindBy(xpath = "(//*[@class='woocommerce-Price-amount amount'])[3]")
    public WebElement araToplamFiyatYazisi;

    @FindBy(xpath = "//*[text()='The minimum spend for this coupon is ']")
    public WebElement indirimYapilamazYaziElementi;

    @FindBy(xpath = "//a[@title='Remove this item']")
    public WebElement sepettekiUrunuIptalEtmeButonu;

    @FindBy(xpath = "//p[@class='cart-empty']")
    public WebElement sepetBosYaziElementi;

    @FindBy(xpath = "//*[@class='input-text qty text']")
    public WebElement urunMiktarGuncellemeKutucugu;

    @FindBy(xpath = "//*[@name='update_cart']")
    public WebElement sepetGuncellemeButonu;

    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    public WebElement odemeyeDevamEtButonu;



    @FindBy(xpath = "(//input[@class='input-text '])[1]")
    public WebElement firstnameButonu;

    @FindBy(xpath = "(//input[@class='input-text '])[2]")
    public WebElement lastNameButonu;

    @FindBy(xpath = "(//input[@class='input-text '])[3]")
    public WebElement companyNameButonu;

    @FindBy(xpath = "(//input[@class='input-text '])[4]")
    public WebElement emailButonu;

    @FindBy(xpath = "(//input[@class='input-text '])[5]")
    public WebElement phoneButonu;

    @FindBy(xpath = "(//input[@class='input-text '])[6]")
    public WebElement addresButonu;

    @FindBy(xpath = "(//input[@class='input-text '])[7]")
    public WebElement addressIkinciSatirButonu;

    @FindBy(xpath = "(//input[@class='input-text '])[8]")
    public WebElement zipCode;

    @FindBy(xpath = "(//input[@class='input-text '])[9]")
    public WebElement cityButonu;


    @FindBy(xpath = "//label[@for='payment_method_cod']")
    public WebElement chashButonu;

    @FindBy(xpath = "//*[@class='select2-choice']")
    public WebElement ulkeButonu;


    @FindBy(xpath = "(//*[@class='select2-choice'])[2]")
    public WebElement stateButonu;

    @FindBy(xpath = "//h2[text()='Order Details']")
    public WebElement siparisDetaylariYaziElementi;

    @FindBy(xpath = "//*[@name='woocommerce_checkout_place_order']")
    public WebElement placeOrderButonu;







}
