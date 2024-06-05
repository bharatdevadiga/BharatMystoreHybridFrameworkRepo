package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    WebDriver ldriver;
    public   MyAccountPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(linkText = "Edit Account")
    WebElement EditAccount;

    @FindBy(linkText = "Password")
    WebElement Password;

    @FindBy(linkText = "Address Book")
    WebElement Address_Book;

    @FindBy(linkText = "Wish List")
    WebElement Wish_List;

    @FindBy(linkText = "Order History")
    WebElement Order_History;

    @FindBy(linkText = "Downloads")
    WebElement Downloads;

    @FindBy(linkText = "Recurring payments")
    WebElement Recurring_payments;

    @FindBy(linkText = "Reward Points")
    WebElement Reward_Points;

    @FindBy(linkText = "Returns")
    WebElement Returns;

    @FindBy(linkText = "Transactions")
    WebElement Transactions;

    @FindBy(linkText = "Newsletter")
    WebElement Newsletter;

    @FindBy(linkText = "Logout")
    WebElement Logout;

    @FindBy(id= "input-firstname")
    WebElement Firstname;

    @FindBy(id= "input-lastname")
    WebElement Lastname;

    @FindBy(id= "input-telephone")
    WebElement Telephone;

    public void clickonEditoption(){
        EditAccount.click();

    }

    public void clickonPassword(){
        Password.click();
    }

    public void clickonAddress_Book(){
        Address_Book.click();
    }

    public void clickonWishList(){
        Wish_List.click();
    }

    public void clickonorder_history(){
        Order_History.click();
    }

    public void clickonDownloads(){
        Downloads.click();
    }

    public void clickonRewards(){
        Reward_Points.click();
    }

    public void clickonRecurringPayments(){
        Recurring_payments.click();
    }

    public void clickonReturns(){
        Returns.click();
    }

    public void clickonTransactions(){
        Transactions.click();
    }

    public void clickonNewsletter(){
        Newsletter.click();
    }

    public void clickonLogout(){
        Logout.click();
    }


    public void Enterfirstname( String firstname){
        Firstname.clear();
        Firstname.sendKeys(firstname);
    }

    public void Enterlastname( String lastname){
        Lastname.clear();
        Lastname.sendKeys(lastname);
    }

    public void EntertelephoneNo( String telephone){
        Telephone.clear();
        Telephone.sendKeys(telephone);
    }
}
