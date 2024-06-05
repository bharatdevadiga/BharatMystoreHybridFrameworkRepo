package mystore.testcases;

import mystore.baseclass.Baseclass;
import mystore.utilities.Exceldata;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.*;

import java.io.IOException;


public class TC_BuyProduct extends Baseclass {

    Registerpage rg;

    Shoppingcartpage sg;

    @Test(priority = 1,dataProviderClass = Exceldata.class,dataProvider = "datasupplier")
    public void AddToCart(String emailid,String password) throws IOException {
        logger.info("***************TestCase ADD TO CART STARTS*****************");
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
        logger.info("Clicked on login button");
       HomePage hg=new HomePage(driver);
        hg.clickoncameraoption();
        logger.info("clicked on camera option");
        hg.clickonnikoncmaera();
        logger.info("Clicked on nikoncamera");
        hg.clickonAddtocartbtn();
        logger.info("Clicked on addtocart buttn");
        hg.clickonshoppingcartopt();
        logger.info("Clicked on shoppingcartoption");
        Assert.assertTrue(hg.productisdiisplayed(),"product is not displyed");
        pg.clickonMyaccount();
        logger.info("Clicked on MyAccount button");
        rg.clickonlogout();
        logger.info("Clicked on Logout button");
        String msg=rg.accountlogoutmsg();
        if(msg.equals("Account Logout")) {
            logger.info("testcase passed");
            Assert.assertTrue(true);
        }
        else{
            logger.info("testcase failed");
            captureScreenShot(driver,"LoginTest");
            Assert.assertTrue(false);

        }
        logger.info("***************TestCase ADDTO CART ENDS*****************");

    }

    @Test(priority = 2,dataProviderClass = Exceldata.class,dataProvider = "datasupplier")
    public void checkout(String emailid,String password,String Firstname,String lastnme) throws IOException, InterruptedException {
        logger.info("***************TestCase CHECKOUT  STARTS*****************");
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
        logger.info("Clicked on login button");
        HomePage hg=new HomePage(driver);
        hg.clickonshoppingcartopt();
        logger.info("Clicked on shoppingcartoption");
        sg=new Shoppingcartpage(driver);
        sg.clickonestimateshippingopt();
        logger.info("clicked on estimate shopping option");
        sg.Selectcuntrydrpdwn("India");
        logger.info("selected country");
        sg.Selectregiondrpdwn("Karnataka");
        logger.info("Selected region");
        sg.Eneterpostalcode("580032");
        logger.info("Entered postalcode");
        sg.clickongetquotes();
        logger.info("clicked on quotes button");
        sg.clickonradiobtn();
        logger.info("clicked on radio button");
        sg.clickonapplyshippopt();
        Thread.sleep(5000);
        logger.info("clicked on apply shipping option");
        scrollPageDown(driver);
        logger.info("scrolled the page");
        scrollPageDown(driver);
        logger.info("scrolled the page");
        sg.clickoncheckoutopt();
        logger.info("clicked on checkout");
        checkoutpage cg=new checkoutpage(driver);
        cg.clickonnewaddressbtn();
        Thread.sleep(2000);
        cg.Eneterfirstname(Firstname);
        logger.info("Entered firstname");
        cg.Eneterlastname(lastnme);
        logger.info("Entered lastname");
        cg.Eneteraddress("chandranth nagar vijay hotel building");
        logger.info("Entered address");
        cg.EnterCitydetails("Hubli");
        logger.info("Entered city");
        cg.Eneteronpostcode("580032");
        logger.info("Entered postalcode");
        cg.Selectcuntrydrpdwn("India");
        logger.info("selected country");
        cg.Selectregiondrpdwn("Karnataka");
        logger.info("selected region");
        cg.clickoncontinuebtn();
        logger.info("clicked on contiue button");
        Thread.sleep(2000);
        cg.clickonnewaddressbtnshipp();
        Thread.sleep(2000);
        cg.Eneterfirstnameshipp(Firstname);
        logger.info("Entered firstname");
        cg.Eneterlastnameshipp(lastnme);
        logger.info("Entered lastname");
        cg.Eneteraddreeshipp("chandranth nagar vijay hotel building");
        logger.info("Entered address");
        cg.Eneteracityshipp("Hubli");
        logger.info("Entered city");
        cg.clickoncontinuebtnshipp();
        logger.info("clicked on contiue button");
        cg.Eneteroncommentbox("deliver fast");
        logger.info("Entered comment in comment box");
        Thread.sleep(2000);
        cg.clickonshippingcontinuebtn();
        cg.clickonprivacybox();
        logger.info("clicked on privacy box");
        cg.clickoncontinuepaymenbtn();
        logger.info("clicked on continue payment method");
        Thread.sleep(2000);
        hg.clickonshoppingcartopt();
        logger.info("clicked on shopping crt option");
        sg.clickonremoveopt();
        Thread.sleep(2000);
        logger.info("clicked on remove option");
        pg.clickonMyaccount();
        logger.info("clicked on My account option");
        Thread.sleep(2000);
        rg.clickonlogout();
        logger.info("clicked on logout ");
        logger.info("***************TestCase CHECKOUT ENDS*****************");



}
}
