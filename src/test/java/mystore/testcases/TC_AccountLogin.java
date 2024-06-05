package mystore.testcases;

import mystore.baseclass.Baseclass;
import mystore.utilities.Exceldata;
import mystore.utilities.Readconfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.Registerpage;
import pageobjects.indexpage;


public class TC_AccountLogin extends Baseclass {


    @Test(priority = 1,dataProviderClass = Exceldata.class,dataProvider = "datasupplier")
public void verifylogin(String lastname,String TELENO,String password,String confpwd) throws Throwable {

        logger.info("***************TestCase Verify Registration and Login starts*****************");
        indexpage pg = new indexpage(driver);
    pg.clickonMyaccount();
    logger.info("clicked on myaccount button");
    pg.clickRegisterbutton();
        logger.info("clicked on register button");

        Registerpage registerpage=new Registerpage(driver);
        registerpage.Enterfirstname(Readconfig.generateNamewithTimestamp());
        logger.info("entered firstname");
        registerpage.Enterlastname(lastname);
        logger.info("entered lastname");
        registerpage.Enteremailid(Readconfig.generateNamewithTimestamp()+"@gmail.com");
        logger.info("entered emailid");
        registerpage.EntertelephoneNo(TELENO);
        logger.info("entered telephone no");
        registerpage.Enterpassword(password);
        logger.info("entered password");
        registerpage.Enterconfirmpwd(confpwd);
        logger.info("entered confirmpasswod");
        registerpage.clickonprivacychbx();
        logger.info("clicked on privacychckbx");
        registerpage.clickonContinueButton();
        logger.info("clicked on continue button");
        String message =registerpage.accountcreatedmsg();
        Assert.assertEquals("Your Account Has Been Created!",message);
        pg.clickonMyaccount();
        logger.info("Clicked on MyAccount button");
        registerpage.clickonlogout();
        logger.info("Clicked on Logout button");
        String msg=registerpage.accountlogoutmsg();
        Assert.assertEquals("Account Logout",msg);
        logger.info("account logged out");

        logger.info("-------------------TESTCASE PASSED----------------------");

}

@Test(priority = 2,dataProviderClass = Exceldata.class,dataProvider = "datasupplier")
    public void LoginTest(String emailid,String password) throws Throwable {
    logger.info("***************TestCase Login with username and password starts*****************");
    indexpage pg = new indexpage(driver);
    pg.clickonMyaccount();
    logger.info("Clicked on MyAccount button");
    pg.clickonloginbutton();
    logger.info("Clicked on Loginbutton");
    Registerpage registerpage=new Registerpage(driver);
    registerpage.Enteremailid(emailid);
    logger.info("Entered Email id ");
    registerpage.Enterpassword(password);
    logger.info("Entered password ");
    registerpage.clickonloginbutton();
    logger.info("Clicked on login button");
    Thread.sleep(5);
    pg.clickonMyaccount();
    logger.info("Clicked on MyAccount button");
    registerpage.clickonlogout();
    logger.info("Clicked on Logout button");
    String msg=registerpage.accountlogoutmsg();
    if(msg.equals("Account Logout")) {
        logger.info("testcase passed");
        Assert.assertTrue(true);
    }
        else{
            logger.info("testcase failed");
            captureScreenShot(driver,"LoginTest");
            Assert.assertTrue(false);

        }
    }



}





