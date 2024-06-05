package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class checkoutpage{

    WebDriver ldriver;

    public  checkoutpage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(id="input-payment-firstname")
    WebElement firstnametextfield;

    @FindBy(id="input-shipping-firstname")
    WebElement firstnametextfieldshipp;
    @FindBy(id="input-payment-lastname")
    WebElement lastnametxtfield;

    @FindBy(id="input-shipping-lastname")
    WebElement lastnametxtshipp;
    @FindBy(id="input-payment-address-1")
    WebElement address_1txtfield;

    @FindBy(id="input-shipping-address-1")
    WebElement address_1shipping;

    @FindBy(id="input-payment-city")
    WebElement city1;

    @FindBy(id="input-shipping-city")
    WebElement cityshipp;
    @FindBy(id="input-payment-zone")
    WebElement regiondrpdwn;


    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postcodetxtfield;
    @FindBy(id="input-payment-postcode")
    WebElement postcodetxtfield1;

    @FindBy(id="button-payment-address")
    WebElement continuebtn;

    @FindBy(id="button-payment-method")
    WebElement continuebtnpayment;

    @FindBy(xpath = "//input[@id='button-shipping-address']")
    WebElement continuebtnshipp;

    @FindBy(id = "input-payment-country")
    WebElement countrydrpdwn;

    @FindBy(id = "button-shipping-method")
    WebElement shippingcontinuebtn;
    @FindBy(name="comment")
    WebElement commentbox;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement privacybox;

    @FindBy(id="button-confirm")
    WebElement confirmbtn;

    @FindBy(xpath = "//*[text()='Your order has been placed!']")
    WebElement orderplacedtxt;

    @FindBy(xpath = "//*[@name='payment_address' and contains(@value, 'new')]")
    WebElement USENEWADDRESSBTN;

    @FindBy(xpath = "//input[@name='shipping_address' and contains(@value, 'new')]")
    WebElement USENEWADDRESSBTNshipp;


    public void clickonconfirmbtn(){
        confirmbtn.click();
    }

    public void clickonprivacybox(){
        privacybox.click();
    }

    public void clickoncontinuepaymenbtn(){
        continuebtnpayment.click();
    }

    public void Eneterfirstname(String firstname){
        firstnametextfield.sendKeys(firstname);
    }
    public void Eneterfirstnameshipp(String firstname){
        firstnametextfieldshipp.sendKeys(firstname);
    }

    public void Eneterlastnameshipp(String lastname){
        lastnametxtshipp.sendKeys(lastname);
    }

    public void Eneteraddreeshipp(String address){
        address_1shipping.sendKeys(address);
    }

    public void Eneteracityshipp(String city){
        cityshipp.sendKeys(city);
    }

    public void Eneterlastname(String lastname){
        lastnametxtfield.sendKeys(lastname);
    }

    public void Eneteroncommentbox(String comment){
        commentbox.sendKeys(comment);
    }

    public void Eneteronpostcode(String postcode){
        postcodetxtfield.sendKeys(postcode);
    }


    public void clickoncontinuebtn(){
        continuebtn.click();
    }
    public void clickoncontinuebtnshipp(){
        continuebtnshipp.click();
    }

    public void Enterpostcode1(String postecode){
       postcodetxtfield1.click();
    }

    public void Eneteraddress(String address){
        address_1txtfield.sendKeys(address);
    }

    public boolean orderplacedmsg(){
        boolean msg =orderplacedtxt.isDisplayed();
        return msg;
    }

    public  void EnterCitydetails(String city){
        city1.sendKeys(city);
    }

    public void clickonnewaddressbtn(){
        USENEWADDRESSBTN.click();
}

    public void clickonshippingcontinuebtn(){
        shippingcontinuebtn.click();
    }

    public void clickonnewaddressbtnshipp(){
        USENEWADDRESSBTNshipp.click();
    }
    public  void Selectcuntrydrpdwn(String country){
        Select drp=new Select(countrydrpdwn);
        drp.selectByVisibleText(country);
    }

    public  void Selectregiondrpdwn(String region){
        Select drp=new Select(regiondrpdwn);
        drp.selectByVisibleText(region);
    }
}
