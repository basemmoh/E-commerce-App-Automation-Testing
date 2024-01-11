package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.passwordRecoveryPage;

public class passwordRecoveryStepDefinition {
    passwordRecoveryPage recovery = new passwordRecoveryPage();

    @Given("user navigates to the login form for recovery")
    public void navigates_to_forget_password_page(){ Driver.driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F"); }
    @When("user click on forget password")
    public void click_on_forget_password(){
        recovery.forgetPassPOM().click();
    }
    @And("user fill email section with a valid email")
    public void enter_email() throws InterruptedException {
        recovery.email().sendKeys("basemabdelghanhy@gmail.com");
        Thread.sleep(3000);
    }
    @Then("user click on recovery button")
    public void click_on_recovery_button(){
        recovery.recoveryButton().click();
    }
    @And("message shows successfully")
    public void success_msg(){
        String Expected = "Email with instructions has been sent to you.";
        String Actual = recovery.message().getText();
        Assert.assertTrue(Actual.contains(Expected));
    }
}
