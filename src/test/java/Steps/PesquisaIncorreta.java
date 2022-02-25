package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesquisaIncorreta {
    WebDriver driver;

    @Given("open website")
    public void open_website() {
        System.setProperty("webdriver.chrome.driver","src/test/java/utils/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://blogdoagi.com.br/");
    }
    @When("button search click")
    public void button_search_click() {
        driver.findElement(By.id("search-open")).click();
    }
    @When("incorrect search")
    public void incorrect_search() {
        driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/form/label/input")).sendKeys("Batata");
    }
    @Then("show no result")
    public void show_no_result() {
        driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/form/input")).submit();
        driver.quit();
    }

}


