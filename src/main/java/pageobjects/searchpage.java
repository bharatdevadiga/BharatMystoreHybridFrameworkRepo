package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchpage {

    WebDriver ldriver;
    public searchpage(WebDriver rdriver){
        ldriver=rdriver;

        PageFactory.initElements(rdriver,this);


    }

@FindBy(xpath = "//*[@placeholder='Search']")
    WebElement SerchBox;

    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    WebElement SearchButton;

    @FindBy(xpath = "//*[text()='HP LP3065']")
    WebElement HpLaptop;

    @FindBy(xpath = "//*[text()='There is no product that matches the search criteria.']")
            WebElement noproductdisplaystatus;

    public void enterdetailsonsearcbox(String productname){
        SerchBox.clear();
        SerchBox.sendKeys(productname);
    }

    public void clckonsearchbutton(){
        SearchButton.click();
    }

    public boolean displaystatusofproduct(){
        boolean displaystatus=HpLaptop.isDisplayed();
        return displaystatus;
    }

    public boolean nodisplaystatusofproduct(){
        boolean displaystatus=noproductdisplaystatus.isDisplayed();
        return displaystatus;
    }
}
