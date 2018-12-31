package selenium;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

public class Steps2 {
    WebDriver driver;

    @Given(("^Open the Chrome and launch the application in step 2$"))
    public void  open_the_Chrome_and_launch_the_application() throws Throwable
    {
        WebDriverManager.getInstance(CHROME).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.get("http://www.demo.guru99.com/v4");
    }

//    @When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")
//    @When("^Enter the Username User(\\d+) and Password password(\\d+)$")
    @When("^Enter the Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void ehter_the_Username_and_Password(String username, String password) throws Throwable
    {
        driver.findElement(By.name("uid")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @Then("^Reset the credential in step 2$")
    public void Reset_the_credential() throws Throwable
    {
        driver.findElement(By.name("btnReset")).click();
        driver.close();
    }
}
