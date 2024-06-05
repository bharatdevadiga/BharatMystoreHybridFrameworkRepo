package mystore.utilities;

import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

public class Readconfig {
    Properties properties;


    String path="D:\\newprojectbranch\\Mystoreproject\\src\\test\\resources\\config.properties\\properties";

    public  Readconfig() {

        try {
            properties = new Properties();

            FileInputStream fis = new FileInputStream(path);
            properties.load(fis);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
public static String generateNamewithTimestamp()
{
    Date date=new Date();
    String timestamp =date.toString().replace(" ","_").replace(":","_");
    return timestamp;
}

    public String geturl(){
       String value= properties.getProperty("baseurl");
       if(value!=null)
           return value;
           else
           throw new RuntimeException("url not specified in config file");
       }

    public String getbrowser(){
        String value= properties.getProperty("BrowserName");
        if(value!=null)
            return value;
        else
            throw new RuntimeException("browsername not specified in config file");
    }






    }



