package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testar {
    WebDriver driver;

    @Given("go to site")
    public void go_to_site() {
        System.setProperty("webdriver.chrome.driver","src/test/java/utils/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://blogdoagi.com.br/");
    }

    @When("click button search")
    public void click_button_search() {
        driver.findElement(By.id("search-open")).click();
    }

    @When("write in search field")
    public void write_in_search_field() {
         driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/form/label/input")).sendKeys("Dividas");

    }

    @Then("click button and show result")
    public void click_button_and_show_result() {
        driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/form/input")).submit();
        driver.quit();

    }

}
