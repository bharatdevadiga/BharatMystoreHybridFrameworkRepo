package mystore.baseclass;

import mystore.utilities.Readconfig;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Baseclass {

    Readconfig readconfig=new Readconfig();
    String URL=readconfig.geturl();
    String Browser =readconfig.getbrowser();



  public static WebDriver driver;
    public static Logger logger;

    @BeforeClass
    public void setup() throws InterruptedException {

        switch (Browser.toLowerCase())
        {
            case "chrome":
                 driver=new ChromeDriver();
                break;
            case "edge":
                 driver=new EdgeDriver();
                 break;
            default:driver=null;
            break;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get(URL);
        logger = LogManager.getLogger("MyStore");

    }

    public  static void drpdwn(WebElement ele, String value ){
        Select drp =new Select(ele);
        List<WebElement> alloptions = drp.getOptions();

        for(WebElement options1:alloptions){

            if (options1.getText().equals(value)){
                options1.click();
                break;
            }
        }


    }

    public void captureScreenShot(WebDriver driver, String testName) throws IOException {
        TakesScreenshot screenshot= ((TakesScreenshot)driver);

        File src =screenshot.getScreenshotAs(OutputType.FILE);
        File dest= new File(System.getProperty("user.dir")+"//Screenshots//"+ testName +".png");
        FileUtils.copyFile(src,dest);
    }


    public  void scrollPageDown(WebDriver driver){
        JavascriptExecutor js= ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public void scrollPageUp(WebDriver driver){
        JavascriptExecutor js= ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
    }

@AfterClass
    public void teardown() throws InterruptedException {
        Thread.sleep(5);
        driver.quit();

    }

}
