package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexpage {
WebDriver ldriver;
    public indexpage(WebDriver rdriver){
        ldriver=rdriver;

        PageFactory.initElements(rdriver,this);
    }


    //identify the elements

    @FindBy(xpath = "(//*[text()='Register'])[1]")
    WebElement Registerbutton;

    @FindBy(xpath = "(//*[text()='Login'])[1]")
    WebElement Loginbutton;
    @FindBy(xpath = "//span[text()='My Account']")
    WebElement Myaccount;

    public void clickonMyaccount(){

        Myaccount.click();
    }

    public void clickonloginbutton(){
        Loginbutton.click();
    }

    public void clickRegisterbutton (){

        Registerbutton.click();
    }

}
