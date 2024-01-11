package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.registrationPage;

public class registrationStepDefinition {
    registrationPage reg = new registrationPage();

    @And("user navigates to the registration form")
    public void navigates_to_register_form(){
        Driver.driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
    }

    @When("user select Gender type")
    public void select_Gender_type(){
        reg.genderPOM().click();
    }

    @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void user_enter_first_last_name(String first, String last ){
        reg.send_first_last_name(first,last);
    }

    @And("user enter date of birth")
    public void enter_date_of_birth (){
        reg.send_birthDay(1,"April","1998");
    }

    @And("^user enter email \"(.*)\"$")
    public void enter_email(String email){
        reg.emailPOM().sendKeys(email);
    }
    @And("^user enter company name \"(.*)\"$")
    public void enter_company_name(String Cname){
        reg.companyNamePOM().sendKeys(Cname);
    }
    @And("user select newspaper availability")
    public void select_newspaper(){
        reg.newspaperPOM().click();
    }
    @And("^user enter password \"(.*)\"$")
    public void enter_password(String pass){
        reg.passwordPOM().sendKeys(pass);
    }
    @And("^user enter confirm password \"(.*)\"$")
    public void enter_confirm_password(String pass) throws InterruptedException {
        reg.confirmPassPOM().sendKeys(pass);
        Thread.sleep(7000);
    }
    @And("user  click on register button")
    public void click_on_register_button(){
        reg.confirmPassPOM().sendKeys(Keys.ENTER);
    }
    @Then("the account is registered successfully")
    public void success_message(){
        String ExpectedResult = "Your registration completed";
        String ActualResult =reg.ResultMsgPOM().getText();

        Assert.assertTrue("Account registered successfully "
                ,ActualResult.contains(ExpectedResult));
    }

}
