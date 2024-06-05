package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    WebDriver ldriver;

    public HomePage(WebDriver rdriver){
        ldriver=rdriver;

        PageFactory.initElements(rdriver,this);


    }


    @FindBy(xpath = "//a[text()='MacBook']")
    WebElement MacWishListCart;

    @FindBy(xpath = "//i[@class='fa fa-heart']")
    WebElement WishListCart;

    @FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
    WebElement AppleWishListCart;

    @FindBy(xpath = "//a[text()='iPhone']")
    WebElement IphoneWishListCart;

    @FindBy(xpath = "//i[@class='fa fa-home']")
    WebElement homebutton;

    @FindBy(xpath = "//div[@class='product-thumb transition']//img[@title='MacBook']/../../..//div[@class='caption']/following-sibling::div//i[@class='fa fa-heart']")
    WebElement MACaddtowishlist;

    @FindBy(xpath = "//div[@class='product-thumb transition']//img[@title='iPhone']/../../..//div[@class='caption']/following-sibling::div//i[@class='fa fa-heart']")
    WebElement IPHONEwishlist;

    @FindBy(xpath = "//div[@class='product-thumb transition']//img[@title='Apple Cinema 30\"']/../../..//div[@class='caption']/following-sibling::div//i[@class='fa fa-heart']")
    WebElement APPLEcineWISHLIST;

    @FindBy(xpath = "//a[text()='Cameras']")
    WebElement cameraoption;

    @FindBy(xpath = "//div[@id='content']//img[@title='Nikon D300']")
    WebElement nikond300;

    @FindBy(xpath = "//tbody//tr//td/a[text()='iPhone']/../following-sibling::td/a")
    WebElement RemoveIphonefrmcart;

    @FindBy(xpath = "//tbody//tr//td/a[text()='MacBook']/../following-sibling::td/a")
    WebElement RemoveMacBookfrmcart;

    @FindBy(xpath = "//tbody//tr//td/a[text()='Apple Cinema 30\"']/../following-sibling::td/a")
    WebElement RemoveApplePcfrmcart;

    @FindBy(xpath = "//div[@id='content']//a[text()='Nikon D300']")
    WebElement NIKOND300camera;

    @FindBy(xpath="//*[@id='button-cart']")
    WebElement AddtoCartBtn;

@FindBy(xpath ="//*[text()='Shopping Cart']")
    WebElement Shoppingcartoption;

public void clickoncameraoption(){
    cameraoption.click();
}

    public void clickonAddtocartbtn(){
        AddtoCartBtn.click();
    }

    public void clickonshoppingcartopt(){
        Shoppingcartoption.click();
    }

    public void clickonnikoncmaera(){
        nikond300.click();
    }

    public boolean productisdiisplayed(){
    boolean displaystatus=NIKOND300camera.isDisplayed();
    return displaystatus;
    }

    public  void clickonmacbookWishlist(){
    MACaddtowishlist.click();
    }

    public  void clickoniphoneWishlist(){
    IPHONEwishlist.click();
    }

    public  void clickonApplePcWishlist(){
    APPLEcineWISHLIST.click();
    }


    public  void clickonWishlistcart(){
        WishListCart.click();
    }

    public boolean Macdisplayedincart(){
        boolean displaystatus=MacWishListCart.isDisplayed();
        return displaystatus;
    }

    public boolean Iphonedisplayedincart(){
        boolean displaystatus=IphoneWishListCart.isDisplayed();
        return displaystatus;
    }

    public boolean Appledisplayedincart(){
        boolean displaystatus=AppleWishListCart.isDisplayed();
        return displaystatus;
    }

    public void clickonelement(WebDriver driver){
        JavascriptExecutor js= ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();",homebutton);
    }


    public  void RemoveIphonefromwishlist(){
    if (Iphonedisplayedincart()){
        RemoveIphonefrmcart.click();
        }
    }

    public  void RemoveMacbookfromwishlist(){
        if (Macdisplayedincart()){
            RemoveMacBookfrmcart.click();
        }
    }

    public  void RemoveApplePcfromwishlist(){
        if (Appledisplayedincart()){
            RemoveApplePcfrmcart.click();
        }
    }


}


