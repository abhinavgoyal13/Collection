package Selenium.flipkart;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class testing extends Flipkart {
    public WebDriver driver;
    public testing(WebDriver driver)
    {
        this.driver= driver;
    }

    @Test
    public void Login() throws IOException {
        Flipkart fp= new Flipkart();
        driver= fp.Base();
      //  driver= Testing();
        LoginPageObject lp = new LoginPageObject(driver);
        lp.getUsername().sendKeys("abhinav");
        lp.getpwd().sendKeys("pwd");
        lp.submit().click();


    }
}
