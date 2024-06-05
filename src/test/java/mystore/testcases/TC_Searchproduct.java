package mystore.testcases;

import mystore.baseclass.Baseclass;
import mystore.utilities.Exceldata;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.searchpage;

public class TC_Searchproduct extends Baseclass {
    searchpage serach;

    @Test(priority = 1,dataProviderClass = Exceldata.class, dataProvider = "datasupplier")
    public void searchvalidproduct(String productname) {
        serach = new searchpage(driver);
        logger.info("***************TestCase search validproduct starts*****************");
        serach.enterdetailsonsearcbox(productname);
        logger.info("Entered product name");
        serach.clckonsearchbutton();
        logger.info("Clicked on the searchbutton");
        Assert.assertTrue(serach.displaystatusofproduct(), "product is displayed");
        logger.info("***************TestCase search validproduct Ends*****************");

    }


    @Test(priority = 2,dataProviderClass = Exceldata.class, dataProvider = "datasupplier")
    public void searchinvalidproduct(String productname) {
        serach = new searchpage(driver);
        logger.info("***************TestCase search  invalidproduct starts*****************");
        serach.enterdetailsonsearcbox(productname);
        logger.info("Entered product name");
        serach.clckonsearchbutton();
        logger.info("Clicked on the searchbutton");
        Assert.assertTrue(serach.nodisplaystatusofproduct(), "msg not is displayed");
        logger.info("***************TestCase search invalidproduct Ends*****************");

    }


}
