package mystore.testcases;

import mystore.baseclass.Baseclass;
import mystore.utilities.Exceldata;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.Registerpage;
import pageobjects.indexpage;

import java.io.IOException;

public class TC_AddProductToWishlist extends Baseclass {
    Registerpage rg;
    HomePage hg;

    @Test(priority = 1, dataProviderClass = Exceldata.class, dataProvider = "datasupplier")
    public void AddToWishList(String emailid, String password) throws IOException, InterruptedException {
        logger.info("***************TestCase ADD TO Wishlist STARTS*****************");
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
        hg=new HomePage(driver);
        hg.clickonelement(driver);
        logger.info("click on home icon");
        hg.clickonmacbookWishlist();
        logger.info("Added Mac to wishlist");
        Thread.sleep(2000);
        hg.clickonApplePcWishlist();
        logger.info("Added APPLE PC to wishlist");
        Thread.sleep(2000);
        hg.clickoniphoneWishlist();
        logger.info("Added IPHONE to wishlist");
        Thread.sleep(2000);
        hg.clickonWishlistcart();
        logger.info("clciked on wishlist cart");
        Assert.assertTrue(hg.Macdisplayedincart(),"MACbook is not displayed");
        Assert.assertTrue(hg.Iphonedisplayedincart(),"Ipone is not displayed");
        Assert.assertTrue(hg.Appledisplayedincart(),"APPLE PC is not displayed");
        pg.clickonMyaccount();
        logger.info("clicked on My account option");
        Thread.sleep(2000);
        rg.clickonlogout();
        logger.info("clicked on logout ");


        logger.info("***************TestCase ADD TO WISHLIST ENDS*****************");

    }

    @Test(priority = 2, dataProviderClass = Exceldata.class, dataProvider = "datasupplier")
    public void RemoveprdtfrmWishList(String emailid, String password) throws IOException, InterruptedException {
        logger.info("***************TestCase Remove Product FROM Wishlist STARTS*****************");
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
        hg=new HomePage(driver);
        hg.clickonWishlistcart();
        logger.info("clicked on wishlist cart");
        Thread.sleep(2000);
        hg.RemoveIphonefromwishlist();
        logger.info("Removed iphone from cart");
        Thread.sleep(2000);
        hg.RemoveMacbookfromwishlist();
        logger.info("Removed macbook from cart");
        Thread.sleep(2000);
        hg.RemoveApplePcfromwishlist();
        logger.info("Removed Apple Pc from cart");


        logger.info("***************TestCase Remove Product FROM Wishlist ENDS*****************");







    }
    }

//https://github.com/bharatdevadiga/BharatMystoreHybridFrameworkRepo.git