package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {

    WebDriver ldriver;
    public Registerpage(WebDriver rdriver){
        ldriver=rdriver;

        PageFactory.initElements(rdriver,this);


    }
    @FindBy(id= "input-firstname")
    WebElement Firstname;

    @FindBy(id= "input-lastname")
    WebElement Lastname;

    @FindBy(id= "input-email")
    WebElement Emailid;

    @FindBy(id= "input-telephone")
    WebElement Telephone;

    @FindBy(id= "input-password")
    WebElement Password;

    @FindBy(id= "input-confirm")
    WebElement ConfirmPassword;

    @FindBy(name = "agree")
    WebElement privacypolicychbx;

    @FindBy(xpath= "//input[@value='Continue']")
    WebElement ContinueButton;

    @FindBy(xpath = "(//*[text()='My Account'])[2]")
    WebElement Myaccountdrpdwn;

    @FindBy(xpath = "//*[@value='Login']")
    WebElement Loginbutton;
    @FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
    WebElement accountcreatedmessage;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement LogOut;

    @FindBy(xpath = "//h1[text()='Account Logout']")
    WebElement accountlogout;

    public void Enterfirstname( String firstname){
        Firstname.sendKeys(firstname);
    }

    public void Enterlastname( String lastname){
        Lastname.sendKeys(lastname);
    }

    public void Enteremailid( String emailid){

        Emailid.sendKeys(emailid);
    }

    public void EntertelephoneNo( String telephone){
        Telephone.sendKeys(telephone);
    }

    public void Enterpassword( String password){
        Password.sendKeys(password);
    }

    public void Enterconfirmpwd( String confirmpwd){
        ConfirmPassword.sendKeys(confirmpwd);
    }

    public void clickonContinueButton( ){
        ContinueButton.click();
    }
    public void clickonprivacychbx(){
        privacypolicychbx.click();
    }

    public  String accountcreatedmsg(){
        return(accountcreatedmessage.getText());

    }

    public void clickonloginbutton(){
        Loginbutton.click();
    }

    public void clickonlogout(){
        LogOut.click();
    }

    public  String accountlogoutmsg() {
        return (accountlogout.getText());
    }

    public void clickonmyaccdrpdwn(){
        Myaccountdrpdwn.click();
    }


}
