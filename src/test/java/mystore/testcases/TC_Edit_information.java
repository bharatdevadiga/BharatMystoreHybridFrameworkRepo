package mystore.testcases;

import mystore.baseclass.Baseclass;
import mystore.utilities.Exceldata;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.MyAccountPage;
import pageobjects.Registerpage;
import pageobjects.indexpage;

public class TC_Edit_information extends Baseclass {
    MyAccountPage mg;
    Registerpage rg;
    @Test(priority = 1, dataProvider = "datasupply")
    public void Edit_Information(String emailid,String password,String firstname,String lastname,String Teleno) throws InterruptedException {
        logger.info("***************TestCase Edit INFORMATION  STARTS*****************");
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
        mg=new MyAccountPage(driver);
        mg.clickonEditoption();
        logger.info("clicked on Edit option");
        mg.Enterfirstname(firstname);
        logger.info("Entered first name");
        mg.Enterlastname(lastname);
        logger.info("Entered last name");
        mg.EntertelephoneNo(Teleno);
        logger.info("Entered Teleno");
        rg.clickonContinueButton();
        logger.info("clicked on continue button");
        pg.clickonMyaccount();
        logger.info("clicked on My account option");
        Thread.sleep(2000);
        rg.clickonlogout();
        logger.info("clicked on logout ");
        logger.info("***************TestCase Edit information Ends*****************");
    }

    @Test(priority = 2, dataProviderClass = Exceldata.class, dataProvider = "datasupplier")
    public void ChangePassword(String emailid,String password,String ChangePwd,String ConfirmPwd) throws InterruptedException {
        logger.info("***************TestCase CHANGE PASSWORD  STARTS*****************");
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
        mg=new MyAccountPage(driver);
        mg.clickonPassword();
        logger.info("clicked on passwod option");
        rg.Enterpassword(ChangePwd);
        logger.info("Enter change password");
        rg.Enterconfirmpwd(ConfirmPwd);
        logger.info("Enter confirm change password");
        rg.clickonContinueButton();
        logger.info("click on continue button");
        logger.info("***************TestCase CHANGE PASSWORD  ENDS*****************");
    }


@DataProvider(name="datasupply")
    public Object[][] getData() {

        String loginData[][] = {{"ramesh1234@gmail.com", "123456789", "ramesh123", "vijay123", "8553745580"}
    };
    return loginData;
    }


}
