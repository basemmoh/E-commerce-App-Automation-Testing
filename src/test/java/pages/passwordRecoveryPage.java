package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.Driver;

public class passwordRecoveryPage {
    public WebElement forgetPassPOM(){ return Driver.driver.findElement(By.cssSelector("span[class=\"forgot-password\"]")); }
    public WebElement email ()
    {
        return Driver.driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }
    public WebElement recoveryButton(){
        return Driver.driver.findElement(By.cssSelector(
                "button[class=\"button-1 password-recovery-button\"]"));
    }
    public WebElement message()
    {
        return Driver.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

}
