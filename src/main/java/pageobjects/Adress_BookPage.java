package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Adress_BookPage {

    WebDriver ldriver;
    public Adress_BookPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

   @FindBy(linkText = "Delete")
    List<WebElement> Delete1;

    @FindBy(linkText = "Address Book")
    WebElement Address_Book;

    public void ClickOnAllDeleteOptions() throws InterruptedException {
        int totaldeletes = Delete1.size();
        for(int i=0;i<totaldeletes;i++){
           if (totaldeletes>1){
               Delete1.get(i).click();
               Thread.sleep(1000);
           }
               break;
        }
        }

    public void clickonAddress_Book(){
        Address_Book.click();
    }


}
