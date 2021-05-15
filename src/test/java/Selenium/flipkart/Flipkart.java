package Selenium.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Flipkart {
    public WebDriver driver;
    @Test
    public WebDriver Base() throws FileNotFoundException, IOException
    {

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\Selenium\\abc.properties");
        Properties prop = new Properties();
        prop.load(fis);


        String browserName= prop.getProperty("browser");

        if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();

        }

        else if(browserName.equals("firefox"))
        {

        }

        else
        {

        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://www.flipkart.com/");
        return driver;

    }
    }

