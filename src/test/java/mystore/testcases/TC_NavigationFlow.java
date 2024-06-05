package mystore.testcases;

import mystore.baseclass.Baseclass;
import mystore.utilities.Exceldata;
import org.testng.annotations.Test;
import pageobjects.MyAccountPage;
import pageobjects.Registerpage;
import pageobjects.indexpage;

public class TC_NavigationFlow extends Baseclass {
    Registerpage rg;

    @Test(priority = 1, dataProviderClass = Exceldata.class, dataProvider = "datasupplier")
    public void NavigationFlow(String emailid,String password){
        logger.info("***************TestCase NAVIGATION FLOW STARTS*****************");
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
        MyAccountPage mg=new MyAccountPage(driver);
        mg.clickonEditoption();
        logger.info("clicked on editoption");
        mg.clickonPassword();
        logger.info("clicked on Password");
        mg.clickonAddress_Book();
        logger.info("clicked on Address_Book");
        mg.clickonWishList();
        logger.info("clicked on wishlist");
        mg.clickonorder_history();
        logger.info("clicked on order_history");
        mg.clickonDownloads();
        logger.info("clicked on downloads");
        mg.clickonRecurringPayments();
        logger.info("clicked on RecurringPayments");
        mg.clickonRewards();
        logger.info("clicked on Rewards");
        mg.clickonReturns();
        logger.info("clicked on Returns");
        mg.clickonTransactions();
        logger.info("clicked on Transactions");
        mg.clickonNewsletter();
        logger.info("clicked on NewsLetter");
        mg.clickonLogout();
        logger.info("clicked on logout");
        logger.info("***************TestCase NAVIGATION FLOW ENDS*****************");
    }

}
