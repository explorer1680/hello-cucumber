package selenium;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

public class Steps1 {

    WebDriver driver;

    @Given(("^Open the Chrome and launch the application in step 1$"))
    public void  open_the_Chrome_and_launch_the_application() throws Throwable
    {
        WebDriverManager.getInstance(CHROME).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.get("http://www.demo.guru99.com/v4");
    }

    @When("^Enter the Username and Password$")
    public void ehter_the_Username_and_Password() throws Throwable
    {
        driver.findElement(By.name("uid")).sendKeys("username12");
        driver.findElement(By.name("password")).sendKeys("password12");
    }

    @Then("^Reset the credential in step 1$")
    public void Reset_the_credential() throws Throwable
    {
        driver.findElement(By.name("btnReset")).click();
        driver.close();
    }

}
