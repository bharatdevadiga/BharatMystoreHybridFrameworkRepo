package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Shoppingcartpage {

    WebDriver ldriver;

    public  Shoppingcartpage(WebDriver rdriver){

        ldriver= rdriver;


        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//*[text()='Estimate Shipping & Taxes ']//i")
    WebElement  Estimateshoppngoption;

    @FindBy(id="input-country")
    WebElement countrydrpdwn;

    @FindBy(id="input-zone")
    WebElement regiondrpdwn;

    @FindBy(id="input-postcode")
    WebElement postalcode1;

    @FindBy(id="button-quote")
    WebElement Getquotesbtn;

     @FindBy(xpath = "//button[@data-original-title='Remove']")
     WebElement Removeoption;

    @FindBy(id = "button-shipping")
    WebElement Applyshippopt;

    @FindBy(xpath="//*[@type='radio']")
    WebElement radiobutton;

    @FindBy(id="button-shipping")
    WebElement Shippingbutton;

    @FindBy(xpath="//a[text()='Checkout']")
    WebElement Checkoutoption;

    public void clickongetquotes(){
        Getquotesbtn.click();
    }

    public void Eneterpostalcode(String postalcodevalue){
        postalcode1.sendKeys(postalcodevalue);
    }

    public void clickonradiobtn(){
        radiobutton.click();
    }

    public void clickonshippingbtn(){
        Shippingbutton.click();
    }

    public void clickoncheckoutopt(){
        Checkoutoption.click();

    }

    public void clickonapplyshippopt(){
        Applyshippopt.click();

    }

    public  void clickonestimateshippingopt(){
        Estimateshoppngoption.click();
    }

    public  void Selectcuntrydrpdwn(String country){
        Select drp=new Select(countrydrpdwn);
        drp.selectByVisibleText(country);
    }

    public  void Selectregiondrpdwn(String region){
        Select drp=new Select(regiondrpdwn);
        drp.selectByVisibleText(region);
    }

    public void clickonremoveopt(){
        Removeoption.click();
    }

}
