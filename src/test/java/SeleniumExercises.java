import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumExercises {
    @Test
    public void login()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("paytm");
        driver.findElement(By.cssSelector("input[value='Google Search'")).click();
        driver.findElement(By.xpath("//a[contains(@href,'/login')]")).click();
        driver.findElement(By.cssSelector("div._3ac-")).click();
        String s= driver.getWindowHandle();
        driver.switchTo().frame(0);
        WebElement x=driver.findElement(By.xpath("//div[@class='loginLeftSectionContainer']"));
        System.out.println(x.findElement(By.xpath("//p[@class='heading']")).getText());
        driver.switchTo().window(s);
        driver.findElement(By.cssSelector("a._3i6R")).click();

        driver.close();

    }
}
