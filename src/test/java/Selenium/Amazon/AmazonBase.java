package Selenium.Amazon;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonBase {
    public WebDriver driver;

    @BeforeMethod
    public WebDriver base() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://amazon.com");

        return driver;

    }
@Test
    public void signUpAmazon() throws IOException
    {   //Amazon am= new Amazon();

        SignUp su = new SignUp(driver);
        Actions a = new Actions(driver);
        a.moveToElement(su.moveToSignIn()).build().perform();
        su.startHere().click();

        File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Screenshots\\results.png"));

        su.name().sendKeys("Abhinav");
        su.email().sendKeys("abhin@gmail.com");
        su.paaswrd().sendKeys("password");
        su.repwd().sendKeys("password");
        su.button().click();

        File src1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src1,new File("C:\\Screenshots\\results1.png"));
    }

    @Test
    public void addToCart()
    {
        AddToCart a1= new AddToCart(driver);
        Actions a =new Actions(driver);
        a.moveToElement(a1.getinputText()).click().keyDown(Keys.SHIFT).sendKeys("samsung").keyUp(Keys.SHIFT).build().perform();

        a1.click2().click();
        a1.samsungText().click();
        a1.getAddToCartButton().click();
        a1.proceedToCheckout().click();

    }

@Test
    public void addToCartAll()
    {
        AddToCart a1= new AddToCart(driver);
        Actions a =new Actions(driver);
        a.moveToElement(a1.getinputText()).click().keyDown(Keys.SHIFT).sendKeys("samsung").keyUp(Keys.SHIFT).build().perform();

        a1.click2().click();
        //a1.samsungText().click();
        //a1.getAddToCartButton().click();
        //a1.proceedToCheckout().click();
        List<WebElement> l1= a1.itemToBeAdded();
       for( WebElement ws: l1)
       {
           System.out.println(ws.getText());
           if(ws.getText().contains("Samsung Galaxy SmartTag Bluetooth Tracker"))
           {
               ws.click();
               a1.getAddToCartButton().click();
               a1.proceed1().click();
               System.out.println("webelement clicked");
               driver.navigate().back();
               WebDriverWait wait = new WebDriverWait(driver,30);
               //wait.until(ExpectedConditions.presenceOfElementLocated( a1.addToCartButton));
              // driver.navigate().back();
               driver.navigate().back();
               wait.until(ExpectedConditions.visibilityOfElementLocated((By) a1.proceed1));
               
               driver.navigate().back();
               wait.until(ExpectedConditions.invisibilityOfElementLocated((By) a1.proceed1));

           }
       }

    }
/*
    @AfterMethod
    public void close()
    {
        driver.close();
    }
    */

}
