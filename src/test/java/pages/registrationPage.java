package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.Driver;


public class registrationPage {
    public WebElement genderPOM() { return Driver.driver.findElement(By.id("gender-male")); }
    public WebElement firstnamePOM() { return Driver.driver.findElement(By.id("FirstName")); }
    public WebElement lastnamePOM() { return Driver.driver.findElement(By.name("LastName")); }
    public void send_first_last_name(String first, String last)
    {
        firstnamePOM().sendKeys(first);
        lastnamePOM().sendKeys(last);
    }
    public WebElement Birthday_day() { return Driver.driver.findElement(By.name("DateOfBirthDay")); }
    public WebElement Birthday_month() { return Driver.driver.findElement(By.name("DateOfBirthMonth")); }
    public WebElement Birthday_year() { return Driver.driver.findElement(By.name("DateOfBirthYear")); }
    public void send_birthDay(int day, String month, String year)
    {
        Select select = new Select(Birthday_day());
        select.selectByIndex(day);
        select = new Select(Birthday_month());
        select.selectByVisibleText(month);
        select = new Select(Birthday_year());
        select.selectByValue(year);
    }
    public WebElement emailPOM(){ return Driver.driver.findElement(By.name("Email")); }
    public WebElement companyNamePOM() { return  Driver.driver.findElement(By.name("Company")); }
    public WebElement newspaperPOM() { return Driver.driver.findElement(By.name("Newsletter")); }
    public WebElement passwordPOM() { return Driver.driver.findElement(By.name("Password")); }
    public WebElement confirmPassPOM() { return Driver.driver.findElement(By.name("ConfirmPassword")); }
    public WebElement ResultMsgPOM() { return Driver.driver.findElement(By.className("result")); }

}
