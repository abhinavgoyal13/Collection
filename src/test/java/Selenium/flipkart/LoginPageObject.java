package Selenium.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
    private By username= By.xpath("//input[@type='text'");
    private By pwd= By.xpath("//input[@type='password']");
    private By loginButton = By.xpath("//button[@type='submit'");

    public WebDriver driver;
    public LoginPageObject(WebDriver driver)
    {
        this.driver= driver;
    }

    public WebElement getUsername()
    {
        return driver.findElement(username);
    }

    public WebElement getpwd()
    {
        return driver.findElement(pwd);
    }

    public WebElement submit()
    {
        return driver.findElement(loginButton);
    }
}
