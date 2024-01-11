package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver driver = null;

    @Before
    public void user_open_the_browser() throws InterruptedException {
        String ChromePath =System.getProperty("user.dir")
                +"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",ChromePath);
//        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @After
    public void close_the_browser(){
        driver.quit();
    }

}
