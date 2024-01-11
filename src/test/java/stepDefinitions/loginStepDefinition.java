package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.loginPage;
import pages.registrationPage;

public class loginStepDefinition {
     loginPage login = new loginPage();

    @Given("user navigates to the login form")
    public void navigates_to_login_form(){ Driver.driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");}
    @When("^user login using email \"(.*)\"$")
    public void enter_email(String email){ login.emailPom().sendKeys(email);}
    @And("^user login using password \"(.*)\"$")
    public void enter_password(String pass){ login.passwordPom().sendKeys(pass); }
    @And("user click on login button")
    public void click_on_login() throws InterruptedException {
        login.passwordPom().sendKeys(Keys.ENTER);
        Thread.sleep(4000);
    }
    @Then("user login successfully")
    public void successLogin() {
        Assert.assertEquals("https://demo.nopcommerce.com/",Driver.driver.getCurrentUrl());
    }
    @Then("user couldnt login")
    public void unsuccessfulMsg() {
        login.wrongMsgPOM().isDisplayed();
        String Actual = login.wrongMsgPOM().getText();
        Assert.assertTrue(Actual.contains("Login was unsuccessful. Please correct the errors and try again."));
    }


}
