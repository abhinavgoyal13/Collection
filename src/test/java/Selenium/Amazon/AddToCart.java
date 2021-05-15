package Selenium.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddToCart {

    @FindBy(css="input#twotabsearchtextbox")
    WebElement inputText;

    @FindBy(css="span#nav-search-submit-text")
            WebElement click1;

    @FindBy(xpath = "//a[contains(@href,'Samsung-Galaxy-Wi-Fi-Silver-SM')]")
            WebElement tabA7;

    @FindBy(xpath="//input[@id='add-to-cart-button']")
            WebElement addToCartButton;

    @FindBy(xpath="//input[@class='a-button-input']")
            WebElement proceedToCheckout;

    @FindBy(css="span#hlb-ptc-btn")
    WebElement proceed1;

    @FindBy(css="h2.a-size-mini.a-spacing-none.a-color-base.s-line-clamp-2 a.a-link-normal.a-text-normal")
    List<WebElement> itemToBeAdded;

            WebDriver driver;
            public AddToCart(WebDriver driver)
            {
                this.driver=driver;
                PageFactory.initElements(driver,this);
            }

            public WebElement getinputText()
            {
                return inputText;
            }

            public WebElement click2()
            {
                return click1;
            }

            public WebElement samsungText()
            {
                return tabA7;
            }

            public WebElement getAddToCartButton()
            {
                return addToCartButton;
            }

            public WebElement proceedToCheckout()
            {
                return proceedToCheckout;
            }

            public List<WebElement> itemToBeAdded()
            {
                return itemToBeAdded;
            }

            public WebElement proceed1()
            {
                return proceed1;
            }
}
