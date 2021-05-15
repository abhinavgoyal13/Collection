package Selenium.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp extends AmazonBase {
    public WebDriver driver;

    public SignUp(WebDriver driver) {
        this.driver = driver;
    }

    By mouseHover = By.cssSelector("a[href*='signin']");
    By startHere = By.xpath("//a[contains(@href,'register')]");
    By custName= By.id("ap_customer_name");
    By email= By.id("ap_email");
    By pwd =By.xpath("//input[@type='password']");
    By repwd= By.cssSelector("input[id='ap_password_check']");
    By button = By.cssSelector("input#continue");

    public WebElement moveToSignIn() {
        return (driver.findElement(mouseHover));
    }

    public WebElement startHere()
    {
        return(driver.findElement(startHere));
    }

    public WebElement name()
    {
return(driver.findElement(custName));
    }

    public WebElement email()
    {

return(driver.findElement(email));
    }

    public WebElement paaswrd()
    {
        return(driver.findElement(pwd));
    }

    public WebElement repwd()
    {
        return(driver.findElement(repwd));
    }

    public WebElement button()
    {
        return(driver.findElement(button));
    }

}
