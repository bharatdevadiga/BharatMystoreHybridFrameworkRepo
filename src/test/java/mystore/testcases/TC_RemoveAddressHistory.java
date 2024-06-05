package mystore.testcases;

import mystore.baseclass.Baseclass;
import mystore.utilities.Exceldata;
import org.testng.annotations.Test;
import pageobjects.Adress_BookPage;
import pageobjects.Registerpage;
import pageobjects.indexpage;

import java.io.IOException;

public class TC_RemoveAddressHistory extends Baseclass {
     Registerpage rg;
     Adress_BookPage ag;
    @Test(priority = 2, dataProviderClass = Exceldata.class, dataProvider = "datasupplier")
    public void RemoveAddressHistory(String emailid, String password) throws IOException, InterruptedException {
        logger.info("***************TestCase Remove Address History STARTS*****************");
        indexpage pg= new indexpage(driver);
        pg.clickonMyaccount();
        logger.info("Clicked on MyAccount button");
        pg.clickonloginbutton();
        logger.info("Clicked on Loginbutton");
        rg=new Registerpage(driver);
        rg.Enteremailid(emailid);
        logger.info("Entered Email id ");
        rg.Enterpassword(password);
        logger.info("Entered password ");
        rg.clickonloginbutton();
        logger.info("clicked on login button");
        Thread.sleep(2000);
        ag=new Adress_BookPage(driver);
        ag.clickonAddress_Book();
        logger.info("clicked on address book option ");
        Thread.sleep(2000);
        ag.ClickOnAllDeleteOptions();
        logger.info("***************TestCase Address History Ends*****************");
    }
}
