import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TextPadSeleniumCode {
@Test
    public void test1()
    {
    System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().window().maximize();
     driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

     List<WebElement> x=driver.findElements(By.xpath("//h4[@class='product-name']"));
        System.out.println(x.size());
        System.out.println(driver.findElements(By.xpath("//div[@class='product-action']/button")).size());
     for(int i=0;i<=x.size()-1;i++)
     {
         System.out.println(x.get(i).getText());
         //System.out.println(x.get(i).getText().indexOf("Tomato"));
         if(x.get(i).getText().indexOf("Tomato")>=0)
         {
             System.out.println(x.get(i).toString());
             driver.findElements(By.xpath("//button[@type='button']")).get(i).click();

         }
     }

    }
}
