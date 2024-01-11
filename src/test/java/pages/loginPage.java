package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.Driver;

public class loginPage {

    public WebElement emailPom(){ return Driver.driver.findElement(By.id("Email")); }
    public WebElement passwordPom(){ return Driver.driver.findElement(By.id("Password")); }
    public WebElement wrongMsgPOM(){ return  Driver.driver.findElement(By.cssSelector(
            "div[class=\"message-error validation-summary-errors\"]"));}
}
